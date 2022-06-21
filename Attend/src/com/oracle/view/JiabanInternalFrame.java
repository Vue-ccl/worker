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

import com.oracle.model.Chuqin;
import com.oracle.model.Jiaban;
import com.oracle.service.JiabanService;
import com.oracle.service.impl.JiabanServiceimpl;

public class JiabanInternalFrame extends JInternalFrame {
	private JTable table;
	JiabanService jbs=new JiabanServiceimpl();
	public static String ID=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JiabanInternalFrame frame = new JiabanInternalFrame();
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
	public JiabanInternalFrame() {
		setTitle("\u52A0\u73ED\u8BB0\u5F55");
		setClosable(true);
		getContentPane().setBackground(Color.GRAY);
		setBounds(600, 220, 771, 448);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(58)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 665, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(54, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u52A0\u73ED\u7F16\u53F7", "\u804C\u5DE5\u7F16\u53F7", "\u665A\u4E0A\u4E0A\u73ED\u65F6\u95F4", "\u665A\u4E0A\u4E0B\u73ED\u65F6\u95F4", "\u52A0\u73ED\u65F6\u957F", "\u65E5\u671F"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		fillTable(new Jiaban(),Integer.parseInt(ID));// fillTable()填充表格的方法
	}

	private void fillTable(Jiaban jiab,int ID) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list=jbs.selectAllJiaban(jiab,ID);
		for (Vector v : list) {
			model.addRow(v);
		}
		
	}
}
