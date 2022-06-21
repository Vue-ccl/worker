package com.oracle.view;

import java.awt.EventQueue;
import java.util.List;
import java.util.Vector;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.oracle.model.Chuqin;
import com.oracle.service.ChuqinService;
import com.oracle.service.impl.ChuqinServiceimpl;

public class ChuqinInternalFrame extends JInternalFrame {
	private JTable table;
	ChuqinService cqs=new ChuqinServiceimpl();
	public static String ID=null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChuqinInternalFrame frame = new ChuqinInternalFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChuqinInternalFrame() {
		setTitle("\u51FA\u52E4\u8BB0\u5F55");
		setBackground(Color.GRAY);
		getContentPane().setForeground(Color.GRAY);
		setClosable(true);
		setBounds(600, 220, 771, 448);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 717, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 374, GroupLayout.PREFERRED_SIZE)
					.addGap(19))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u51FA\u52E4\u7F16\u53F7", "\u804C\u5DE5\u7F16\u53F7", "\u4E0A\u5348\u4E0A\u73ED\u65F6\u95F4", "\u4E0A\u5348\u4E0B\u73ED\u65F6\u95F4", "\u4E0B\u5348\u4E0A\u73ED\u65F6\u95F4", "\u4E0B\u5348\u4E0B\u73ED\u65F6\u95F4", "\u662F\u5426\u7F3A\u52E4", "\u65E5\u671F"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		fillTable(new Chuqin(),Integer.parseInt(ID));// fillTable()填充表格的方法

	}

	private void fillTable(Chuqin chuq, int ID) {
		// TODO Auto-generated method stub
		//查找出信息，并显示在JTable上
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list=cqs.selectAllChuqin(chuq,ID);
		for (Vector v : list) {
			model.addRow(v);
		}
	}
}
