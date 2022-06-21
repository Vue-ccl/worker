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

import com.oracle.model.Chuchai;
import com.oracle.model.Jiaban;
import com.oracle.service.ChuchaiService;
import com.oracle.service.impl.ChuchaiServiceimpl;
import java.awt.SystemColor;

public class ChuchaiInternalFrame extends JInternalFrame {
	public static String ID=null;
	private JTable table;
	ChuchaiService ccs=new ChuchaiServiceimpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChuchaiInternalFrame frame = new ChuchaiInternalFrame();
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
	public ChuchaiInternalFrame() {
		setTitle("\u51FA\u5DEE\u8BB0\u5F55");
		setClosable(true);
		getContentPane().setBackground(Color.GRAY);
		setBounds(600, 220, 771, 448);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(66)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 620, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(54)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u51FA\u5DEE\u7F16\u53F7", "\u804C\u5DE5\u7F16\u53F7", "\u5F00\u59CB\u65F6\u95F4", "\u7ED3\u675F\u65F6\u95F4", "\u51FA\u5DEE\u5929\u6570"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		fillTable(new Chuchai(),Integer.parseInt(ID));
	}

	private void fillTable(Chuchai chuc,int ID) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list=ccs.selectAllChuchai(chuc,ID);
		for (Vector v : list) {
			model.addRow(v);
		}
	}

}
