package com.oracle.view;

import java.awt.EventQueue;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.oracle.model.Chuchai;
import com.oracle.model.Qingjia;
import com.oracle.service.QingjiaService;
import com.oracle.service.impl.QingjiaServiceimpl;
import com.oracle.utils.StringUtils;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageQingjiaInternalFrame extends JInternalFrame {
	private JTextField idword;
	private JTable table;
	private JTextField qdText;
	private JTextField idText;
	private JTextField stimeText;
	private JTextField endtimeText;
	private JTextField sumtimeText;
	private JTextField idText2;
	private JTextField stimeText2;
	private JTextField endtimeText2;
	private JTextField sumtimeText2;
	QingjiaService qjs=new QingjiaServiceimpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageQingjiaInternalFrame frame = new ManageQingjiaInternalFrame();
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
	public ManageQingjiaInternalFrame() {
		setTitle("\u804C\u5DE5\u8BF7\u5047\u7BA1\u7406");
		getContentPane().setBackground(Color.GRAY);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u804C\u5DE5\u7F16\u53F7\uFF1A");
		
		idword = new JTextField();
		idword.setColumns(10);
		
		JButton button = new JButton("\u641C\u7D22");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 实现搜索功能
				String key = idword.getText();
				if (StringUtils.isEmpty(key)) {
					JOptionPane.showMessageDialog(null, "请输入要查找的职工编号！");
					resetData();
					fillTable(new Qingjia());
				} else {
					Qingjia qingjia=new Qingjia();
					qingjia.setId(Integer.parseInt(key));
					resetData();
					fillTable(qingjia);
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, " \u7BA1 \u7406 \u64CD \u4F5C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, " \u6DFB \u52A0 \u8BB0 \u5F55", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(idword, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button)))
					.addGap(81))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(idword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		
		JLabel label_5 = new JLabel("\u804C\u5DE5\u7F16\u53F7\uFF1A");
		
		idText2 = new JTextField();
		idText2.setColumns(10);
		
		JLabel label_6 = new JLabel("\u5F00\u59CB\u65F6\u95F4\uFF1A");
		
		stimeText2 = new JTextField();
		stimeText2.setColumns(10);
		
		JLabel label_7 = new JLabel("\u7ED3\u675F\u65F6\u95F4\uFF1A");
		
		endtimeText2 = new JTextField();
		endtimeText2.setColumns(10);
		
		JLabel label_8 = new JLabel("\u8BF7\u5047\u5929\u6570\uFF1A");
		
		sumtimeText2 = new JTextField();
		sumtimeText2.setColumns(10);
		
		JButton button_3 = new JButton("\u6DFB\u52A0");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				addqingjia(event);
			}
		});
		
		JButton btnNewButton = new JButton("\u83B7\u53D6\u5F00\u59CB\u65F6\u95F4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//获取时期
				long l = System.currentTimeMillis();
				Date now=new Date(l);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				stimeText2.setText(dateFormat.format(now));
			}
		});
		
		JButton btnNewButton_1 = new JButton("\u83B7\u53D6\u7ED3\u675F\u65F6\u95F4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//获取时期
				long l = System.currentTimeMillis();
				Date now=new Date(l);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				endtimeText2.setText(dateFormat.format(now));
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_5)
								.addComponent(label_6))
							.addGap(29)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(stimeText2)
								.addComponent(idText2, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
								.addComponent(endtimeText2)))
						.addComponent(label_7))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(36)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(button_3)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(21)
									.addComponent(label_8)
									.addGap(18)
									.addComponent(sumtimeText2, 157, 157, 157))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1)
								.addComponent(btnNewButton))))
					.addContainerGap(85, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(idText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sumtimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6)
						.addComponent(stimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_7)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(endtimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnNewButton_1)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button_3)
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel label_1 = new JLabel("\u8BF7\u5047\u7F16\u53F7\uFF1A");
		
		qdText = new JTextField();
		qdText.setEditable(false);
		qdText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u804C\u5DE5\u7F16\u53F7\uFF1A");
		
		idText = new JTextField();
		idText.setEditable(false);
		idText.setColumns(10);
		
		JLabel label_2 = new JLabel("\u5F00\u59CB\u65F6\u95F4\uFF1A");
		
		stimeText = new JTextField();
		stimeText.setColumns(10);
		
		JLabel label_3 = new JLabel("\u7ED3\u675F\u65F6\u95F4\uFF1A");
		
		endtimeText = new JTextField();
		endtimeText.setColumns(10);
		
		JLabel label_4 = new JLabel("\u8BF7\u5047\u5929\u6570\uFF1A");
		
		sumtimeText = new JTextField();
		sumtimeText.setColumns(10);
		
		JButton button_1 = new JButton("\u5220\u9664");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//删除按钮功能的实现
				String qd = qdText.getText();
				if (StringUtils.isEmpty(qd)) {
					// 如果没有选取到一行记录
					JOptionPane.showMessageDialog(null, "请选择要删除的记录！");
					return;
				}
				int i = qjs.deleteQingjia(qd);
				if (i > 0) {
					// 删除成功
					JOptionPane.showMessageDialog(null, "删除成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Qingjia());
				} else {
					JOptionPane.showMessageDialog(null, "删除失败！");
				}
			}
		});
		
		JButton button_2 = new JButton("\u4FEE\u6539");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 修改功能的实现，先判断修改是否为空
				String qd = qdText.getText();
				if (StringUtils.isEmpty(qd)) {
					JOptionPane.showMessageDialog(null, "请选择要修改的记录！");
					return;
				}
				String id = idText.getText();
				String stime = stimeText.getText();
				String endtime = endtimeText.getText();
				String sumtime = sumtimeText.getText();
				
				if (StringUtils.isEmpty(stime)) {
					JOptionPane.showMessageDialog(null, "开始时间不能为空！");
					return;
				}
				if (StringUtils.isEmpty(endtime)) {
					JOptionPane.showMessageDialog(null, "结束时间不能为空！");
					return;
				}
				if (StringUtils.isEmpty(sumtime)) {
					JOptionPane.showMessageDialog(null, "请假天数不能为空！");
					return;
				}

				// 修改功能实现
				Qingjia qingj=new Qingjia(Integer.parseInt(qd), Integer.parseInt(id), stime, endtime, Integer.parseInt(sumtime));
				int i = qjs.updataChuchai(qingj);
				if (i > 0) {
					// 删除成功
					JOptionPane.showMessageDialog(null, "修改成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Qingjia());
				} else {
					JOptionPane.showMessageDialog(null, "修改失败！");
				}
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(button_1)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2)
								.addComponent(label_1)
								.addComponent(label_4))
							.addGap(29)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(sumtimeText)
								.addComponent(stimeText)
								.addComponent(qdText, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
					.addGap(51)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_3)
						.addComponent(lblNewLabel))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button_2))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(idText)
								.addComponent(endtimeText, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))))
					.addContainerGap(87, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(qdText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(stimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_3)
							.addComponent(endtimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(sumtimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_1)
						.addComponent(button_2))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent event) {
				// 点击表格当前行数据，将数据显示在表单上
				int row = table.getSelectedRow(); // 获得选中行号

				Integer qd = (Integer) table.getValueAt(row, 0);
				Integer id = (Integer) table.getValueAt(row, 1);
				String stime = (String) table.getValueAt(row, 2);
				String endtime = (String) table.getValueAt(row, 3);
				Integer sumtime = (Integer) table.getValueAt(row, 4);

				// 把这一行数据显示在表单上
				qdText.setText(qd.toString());
				idText.setText(id.toString());
				stimeText.setText(stime);
				endtimeText.setText(endtime);
				sumtimeText.setText(sumtime.toString());
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BF7\u5047\u7F16\u53F7", "\u804C\u5DE5\u7F16\u53F7", "\u5F00\u59CB\u65F6\u95F4", "\u7ED3\u675F\u65F6\u95F4", "\u8BF7\u5047\u5929\u6570"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		setClosable(true);
		setBounds(550,30, 813, 751);
		fillTable(new Qingjia());//填充表格
	}

	protected void addqingjia(ActionEvent event) {
		/**
		 * 添加出勤记录功能的实现
		 * 
		 * @param event
		 */
		String id = this.idText2.getText();
		String stime = this.stimeText2.getText();
		String endtime = this.endtimeText2.getText();
		String sumtime = this.sumtimeText2.getText();
		if (StringUtils.isEmpty(id)) {
			JOptionPane.showMessageDialog(null, "编号不能为空！");
			return;
		}
		if (StringUtils.isEmpty(stime)) {
			JOptionPane.showMessageDialog(null, "开始时间不能为空！");
			return;
		}
		if (StringUtils.isEmpty(endtime)) {
			JOptionPane.showMessageDialog(null, "结束时间不能为空！");
			return;
		}
		if (StringUtils.isEmpty(sumtime)) {
			JOptionPane.showMessageDialog(null, "请假天数不能为空！");
			return;
		}
		
		// 添加功能,传输数据view（控制器）==》service ===》dao （通过方法的参数）
				// dao = service = view控制器 （通过返回值）
				Qingjia qingjia=new Qingjia(Integer.parseInt(id), stime, endtime, Integer.parseInt(sumtime));
				int i = qjs.adddate(qingjia);
				if (i > 0) {
					JOptionPane.showMessageDialog(null, "添加成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Qingjia());
				} else {
					JOptionPane.showMessageDialog(null, "添加失败！");
				}
	}

	private void fillTable(Qingjia qingj) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list = qjs.selectAllQingjias(qingj);
		for (Vector v : list) {
			model.addRow(v);
		}
	}
	/**
	 * 清空表单数据
	 */
	private void resetData() {
		qdText.setText("");
		idText.setText("");
		stimeText.setText("");
		endtimeText.setText("");
		sumtimeText.setText("");
	}
}
