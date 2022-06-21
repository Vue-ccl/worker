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
import com.oracle.service.ChuqinService;
import com.oracle.service.impl.ChuqinServiceimpl;

public class QueqinInterFrame extends JInternalFrame {
	public static String ID=null;
	ChuqinService cqs=new ChuqinServiceimpl();
	private JTable table;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QueqinInterFrame frame = new QueqinInterFrame();
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
	public QueqinInterFrame() {
		setTitle("\u7F3A\u52E4\u8BB0\u5F55");
		setClosable(true);
		getContentPane().setBackground(Color.GRAY);
		setBounds(600, 220, 771, 448);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(79)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 592, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(56)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u51FA\u52E4\u7F16\u53F7", "\u804C\u5DE5\u7F16\u53F7", "\u4E0A\u5348\u4E0A\u73ED\u65F6\u95F4", "\u4E0A\u5348\u4E0B\u73ED\u65F6\u95F4", "\u4E0B\u5348\u4E0A\u73ED\u65F6\u95F4", "\u4E0B\u5348\u4E0B\u73ED\u65F6\u95F4", "\u65E5\u671F"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		fillTable(new Chuqin(),Integer.parseInt(ID));
	}

	private void fillTable(Chuqin chuq, int ID) {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list=cqs.selectAllQueqin(chuq,ID);
		for (Vector v : list) {
			model.addRow(v);
		}
	}	
	
}
