package com.oracle.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.Date;
import java.util.List;
import java.util.Vector;

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

import com.oracle.model.Chuqin;
import com.oracle.service.ChuqinService;
import com.oracle.service.impl.ChuqinServiceimpl;
import com.oracle.utils.StringUtils;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ManageQueqinInternalFrame extends JInternalFrame {
	private JTextField idword;
	private JTable table;
	private JTextField wdText;
	private JTextField uutimeText;
	private JTextField nutimeText;
	private JTextField abcordText;
	private JTextField idText;
	private JTextField untimeText;
	private JTextField nntimeText;
	private JTextField ddayText;
	private JTextField uutimeText2;
	private JTextField idText2;
	private JTextField nutimeText2;
	private JTextField untimeText2;
	private JTextField nntimeText2;
	private JTextField ddayText2;
	private JComboBox abcordText2;
	ChuqinService cqs=new ChuqinServiceimpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageQueqinInternalFrame frame = new ManageQueqinInternalFrame();
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
	public ManageQueqinInternalFrame() {
		setTitle("\u804C\u5DE5\u7F3A\u52E4\u7BA1\u7406");
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
					fillTable(new Chuqin());
				} else {
					Chuqin chuqin = new Chuqin();
					chuqin.setId(Integer.parseInt(key));
					resetData();
					fillTable(chuqin);
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
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(idword, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button))
						.addComponent(panel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(idword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(22, Short.MAX_VALUE))
		);
		
		JLabel label_9 = new JLabel("\u804C\u5DE5\u7F16\u53F7\uFF1A");
		
		JLabel label_10 = new JLabel("\u4E0A\u5348\u4E0A\u73ED\u65F6\u95F4\uFF1A");
		
		uutimeText2 = new JTextField();
		uutimeText2.setColumns(10);
		
		idText2 = new JTextField();
		idText2.setColumns(10);
		
		JLabel label_11 = new JLabel("\u4E0B\u5348\u4E0A\u73ED\u65F6\u95F4\uFF1A");
		
		nutimeText2 = new JTextField();
		nutimeText2.setColumns(10);
		
		JLabel label_12 = new JLabel("\u7F3A\u52E4\u8BB0\u5F55\uFF1A");
		
		JLabel label_13 = new JLabel("\u4E0A\u5348\u4E0B\u73ED\u65F6\u95F4\uFF1A");
		
		untimeText2 = new JTextField();
		untimeText2.setColumns(10);
		
		JLabel label_14 = new JLabel("\u4E0B\u5348\u4E0B\u73ED\u65F6\u95F4\uFF1A");
		
		nntimeText2 = new JTextField();
		nntimeText2.setColumns(10);
		
		JLabel label_15 = new JLabel("\u65E5\u671F\uFF1A");
		
		ddayText2 = new JTextField();
		ddayText2.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				addchuqin(event);
			}
		});
		
		abcordText2 = new JComboBox();
		abcordText2.setModel(new DefaultComboBoxModel(new String[] {"\u662F", "\u5426"}));
		
		JButton button_3 = new JButton("\u83B7\u53D6\u65E5\u671F");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//获取时期
				long l = System.currentTimeMillis();
				Date now=new Date(l);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				ddayText2.setText(dateFormat.format(now));
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_10)
								.addComponent(label_9))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(uutimeText2)
								.addComponent(idText2, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_11)
								.addComponent(label_12))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(abcordText2, 0, 159, Short.MAX_VALUE)
								.addComponent(nutimeText2))))
					.addGap(65)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(btnNewButton)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button_3))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(label_13)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(untimeText2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_14)
								.addComponent(label_15))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(ddayText2, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
								.addComponent(nntimeText2))))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_9)
						.addComponent(idText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_10)
						.addComponent(uutimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_13)
						.addComponent(untimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_11)
						.addComponent(nutimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_14)
						.addComponent(nntimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_12)
						.addComponent(label_15)
						.addComponent(ddayText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(abcordText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_3)
						.addComponent(btnNewButton))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel label_1 = new JLabel("\u51FA\u52E4\u7F16\u53F7\uFF1A");
		
		wdText = new JTextField();
		wdText.setEditable(false);
		wdText.setColumns(10);
		
		JLabel label_2 = new JLabel("\u4E0A\u5348\u4E0A\u73ED\u65F6\u95F4\uFF1A");
		
		uutimeText = new JTextField();
		uutimeText.setColumns(10);
		
		JLabel label_3 = new JLabel("\u4E0B\u5348\u4E0A\u73ED\u65F6\u95F4\uFF1A");
		
		nutimeText = new JTextField();
		nutimeText.setColumns(10);
		
		JLabel label_4 = new JLabel("\u7F3A\u52E4\u8BB0\u5F55\uFF1A");
		
		abcordText = new JTextField();
		abcordText.setColumns(10);
		
		JLabel label_5 = new JLabel("\u804C\u5DE5\u7F16\u53F7\uFF1A");
		
		idText = new JTextField();
		idText.setEditable(false);
		idText.setColumns(10);
		
		JLabel label_6 = new JLabel("\u4E0A\u5348\u4E0B\u73ED\u65F6\u95F4\uFF1A");
		
		untimeText = new JTextField();
		untimeText.setColumns(10);
		
		JLabel label_7 = new JLabel("\u4E0B\u5348\u4E0B\u73ED\u65F6\u95F4\uFF1A");
		
		nntimeText = new JTextField();
		nntimeText.setColumns(10);
		
		JLabel label_8 = new JLabel("\u65E5\u671F\uFF1A");
		
		ddayText = new JTextField();
		ddayText.setColumns(10);
		
		JButton button_1 = new JButton("\u5220\u9664");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//删除按钮功能的实现
				String wd = wdText.getText();
				if (StringUtils.isEmpty(wd)) {
					// 如果没有选取到一行记录
					JOptionPane.showMessageDialog(null, "请选择要删除的记录！");
					return;
				}
				int i = cqs.deleteChuqin(wd);
				if (i > 0) {
					// 删除成功
					JOptionPane.showMessageDialog(null, "删除成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Chuqin());
				} else {
					JOptionPane.showMessageDialog(null, "删除失败！");
				}
			}
		});
		
		JButton button_2 = new JButton("\u4FEE\u6539");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 修改功能的实现，先判断修改是否为空
				String wd = wdText.getText();
				if (StringUtils.isEmpty(wd)) {
					JOptionPane.showMessageDialog(null, "请选择要修改的记录！");
					return;
				}
				String id = idText.getText();
				String uutiem = uutimeText.getText();
				String untime = untimeText.getText();
				String nutime = nutimeText.getText();
				String nntime = nntimeText.getText();
				String abcord = abcordText.getText();
				if (StringUtils.isEmpty(abcord)) {
					JOptionPane.showMessageDialog(null, "缺勤记录不能为空！");
					return;
				}
				String dday = ddayText.getText();
				if (StringUtils.isEmpty(dday)) {
					JOptionPane.showMessageDialog(null, "日期不能为空！");
					return;
				}

				// 修改功能实现
				Chuqin chuq = new Chuqin(Integer.parseInt(wd), Integer.parseInt(id), uutiem, untime, nutime, nntime,
						abcord, dday);
				int i = cqs.updataChuqin(chuq);
				if (i > 0) {
					// 删除成功
					JOptionPane.showMessageDialog(null, "修改成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Chuqin());
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
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(label_3)
									.addComponent(label_4))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(abcordText, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
									.addComponent(nutimeText)))
							.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(label_2)
									.addComponent(label_1))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(wdText, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
									.addComponent(uutimeText)))))
					.addGap(58)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_7)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(ddayText, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
										.addComponent(button_2)
										.addComponent(nntimeText, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_6)
										.addComponent(label_5))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(idText)
										.addComponent(untimeText, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))))
							.addGap(149))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(label_8)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(label_5)
						.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(wdText, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(uutimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(untimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(nutimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_7)
						.addComponent(nntimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_4)
						.addComponent(abcordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(label_8)
							.addComponent(ddayText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(button_1)
						.addComponent(button_2))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent event) {
				// 点击表格当前行数据，将数据显示在表单上
				int row = table.getSelectedRow(); // 获得选中行号

				Integer wd = (Integer) table.getValueAt(row, 0);
				Integer id = (Integer) table.getValueAt(row, 1);
				String uutime = (String) table.getValueAt(row, 2);
				String untime = (String) table.getValueAt(row, 3);
				String nutime = (String) table.getValueAt(row, 4);
				String nntime = (String) table.getValueAt(row, 5);
				String abcord = (String) table.getValueAt(row, 6);
				String dday = (String) table.getValueAt(row, 7);
				// 把这一行数据显示在表单上
				wdText.setText(wd.toString());
				idText.setText(id.toString());
				uutimeText.setText(untime);
				untimeText.setText(untime);
				nutimeText.setText(nutime);
				nntimeText.setText(nntime);
				abcordText.setText(abcord);
				ddayText.setText(dday);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u51FA\u52E4\u7F16\u53F7", "\u804C\u5DE5\u7F16\u53F7", "\u4E0A\u5348\u4E0A\u73ED\u65F6\u95F4", "\u4E0A\u5348\u4E0B\u73ED\u65F6\u95F4", "\u4E0B\u5348\u4E0A\u73ED\u65F6\u95F4", "\u4E0B\u5348\u4E0B\u73ED\u65F6\u95F4", "\u7F3A\u52E4\u8BB0\u5F55", "\u65E5\u671F"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		setClosable(true);
		setBounds(600, 30, 833, 813);
		fillTable(new Chuqin());

	}

	private void fillTable(Chuqin chuq) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list = cqs.selectAllQueqins(chuq);
		for (Vector v : list) {
			model.addRow(v);
		}
	}
	
	/**
	 * 添加出勤记录功能的实现
	 * 
	 * @param event
	 */
	protected void addchuqin(ActionEvent event) {
		String id = this.idText2.getText();
		String uutime = this.uutimeText2.getText();
		String untime = this.untimeText2.getText();
		String nutime = this.nutimeText2.getText();
		String nntime = this.nntimeText2.getText();
		String abcord = this.abcordText2.getSelectedItem().toString();
		String dday = this.ddayText2.getText();
		if (StringUtils.isEmpty(id)) {
			JOptionPane.showMessageDialog(null, "编号不能为空！");
			return;
		}
		if (StringUtils.isEmpty(abcord)) {
			JOptionPane.showMessageDialog(null, "缺勤记录不能为空！");
			return;
		}
		if (StringUtils.isEmpty(dday)) {
			JOptionPane.showMessageDialog(null, "日期不能为空！");
			return;
		}
		// 添加功能,传输数据view（控制器）==》service ===》dao （通过方法的参数）
				// dao = service = view控制器 （通过返回值）
				Chuqin chuqin=new Chuqin(Integer.parseInt(id), uutime, untime, nutime, nntime, abcord, dday);
				int i = cqs.adddate(chuqin);
				if (i > 0) {
					JOptionPane.showMessageDialog(null, "添加成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Chuqin());
				} else {
					JOptionPane.showMessageDialog(null, "添加失败！");
				}

	}
	/**
	 * 清空表单数据
	 */
	private void resetData() {
		wdText.setText("");
		idText.setText("");
		uutimeText.setText("");
		untimeText.setText("");
		nutimeText.setText("");
		nntimeText.setText("");
		abcordText.setText("");
		ddayText.setText("");
	}
}
