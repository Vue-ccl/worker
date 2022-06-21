package com.oracle.view;

import java.awt.EventQueue;
import java.util.List;
import java.util.Vector;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.oracle.model.Chuchai;
import com.oracle.model.Qingjia;
import com.oracle.service.QingjiaService;
import com.oracle.service.impl.QingjiaServiceimpl;

public class QingjiaInternalFrame extends JInternalFrame {
	private JTable table;
	public static String ID=null;
	QingjiaService qjs=new QingjiaServiceimpl();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QingjiaInternalFrame frame = new QingjiaInternalFrame();
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
	public QingjiaInternalFrame() {
		setTitle("\u8BF7\u5047\u8BB0\u5F55");
		setClosable(true);
		getContentPane().setBackground(Color.GRAY);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(61)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 606, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BF7\u5047\u7F16\u53F7", "\u804C\u5DE5\u7F16\u53F7", "\u5F00\u59CB\u65F6\u95F4", "\u7ED3\u675F\u65F6\u95F4", "\u8BF7\u5047\u5929\u6570"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		setBounds(600, 220, 771, 448);
		fillTable(new Qingjia(),Integer.parseInt(ID));
	}

	private void fillTable(Qingjia qingj, int ID) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list=qjs.selectAllQingjia(qingj,ID);
		for (Vector v : list) {
			model.addRow(v);
		}
	}

}
