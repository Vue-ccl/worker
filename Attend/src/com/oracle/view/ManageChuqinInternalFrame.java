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

import com.oracle.model.Chuqin;
import com.oracle.model.adminuser;
import com.oracle.service.ChuqinService;
import com.oracle.service.impl.ChuqinServiceimpl;
import com.oracle.utils.StringUtils;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ManageChuqinInternalFrame extends JInternalFrame {
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
	private JTextField idText2;
	private JTextField uutimeText2;
	private JTextField nutimeText2;
	private JTextField untimeText2;
	private JTextField nntimeText2;
	private JTextField ddayText2;
	private JComboBox abcordText2;
	ChuqinService cqs = new ChuqinServiceimpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageChuqinInternalFrame frame = new ManageChuqinInternalFrame();
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
	public ManageChuqinInternalFrame() {
		setTitle("\u804C\u5DE5\u51FA\u52E4\u7BA1\u7406");
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
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), " \u7BA1 \u7406 \u64CD \u4F5C",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, " \u6DFB \u52A0 \u8BB0 \u5F55", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(71)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(panel, 0, 0, Short.MAX_VALUE)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(label)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(idword, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(button))
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)))
					.addContainerGap(67, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(48)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(idword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);

		JLabel label_8 = new JLabel("");

		JLabel label_9 = new JLabel("\u804C\u5DE5\u7F16\u53F7\uFF1A");

		idText2 = new JTextField();
		idText2.setColumns(10);

		JLabel label_10 = new JLabel("\u4E0A\u5348\u4E0A\u73ED\u65F6\u95F4\uFF1A");

		JLabel label_11 = new JLabel("\u4E0B\u5348\u4E0A\u73ED\u65F6\u95F4\uFF1A");

		JLabel label_12 = new JLabel("\u7F3A\u52E4\u8BB0\u5F55\uFF1A");

		uutimeText2 = new JTextField();
		uutimeText2.setColumns(10);

		nutimeText2 = new JTextField();
		nutimeText2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\u4E0A\u5348\u4E0B\u73ED\u65F6\u95F4\uFF1A");

		untimeText2 = new JTextField();
		untimeText2.setColumns(10);

		JLabel label_13 = new JLabel("\u4E0B\u5348\u4E0B\u73ED\u65F6\u95F4\uFF1A");

		nntimeText2 = new JTextField();
		nntimeText2.setColumns(10);

		JLabel label_14 = new JLabel("\u65E5\u671F\uFF1A");

		ddayText2 = new JTextField();
		ddayText2.setColumns(10);

		JButton button_3 = new JButton("\u6DFB\u52A0");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 添加出勤记录功能
				addchuqin(event);
			}
		});
		
		abcordText2 = new JComboBox();
		abcordText2.setModel(new DefaultComboBoxModel(new String[] {"\u5426", "\u662F"}));
		
		JButton button_4 = new JButton("\u83B7\u53D6\u65E5\u671F");
		button_4.addActionListener(new ActionListener() {
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
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(325)
							.addComponent(label_8))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_10)
										.addComponent(label_9))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(uutimeText2)
										.addComponent(idText2, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_11)
										.addComponent(label_12))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(abcordText2, 0, 134, Short.MAX_VALUE)
										.addComponent(nutimeText2))))
							.addGap(64)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(untimeText2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(label_13)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
											.addComponent(button_3)
											.addComponent(label_14)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(ddayText2, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
										.addComponent(nntimeText2)
										.addComponent(button_4, Alignment.TRAILING))))))
					.addContainerGap(214, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(label_8)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_9)
						.addComponent(idText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_10)
						.addComponent(uutimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(untimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_11)
						.addComponent(nutimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_13)
						.addComponent(nntimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_12)
						.addComponent(label_14)
						.addComponent(ddayText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(abcordText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_3)
						.addComponent(button_4))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);

		JLabel label_1 = new JLabel("\u51FA\u52E4\u7F16\u53F7\uFF1A");

		wdText = new JTextField();
		wdText.setEditable(false);
		wdText.setColumns(10);

		JLabel label_3 = new JLabel("\u4E0A\u5348\u4E0A\u73ED\u65F6\u95F4\uFF1A");

		uutimeText = new JTextField();
		uutimeText.setColumns(10);

		JLabel lblNewLabel = new JLabel("\u4E0B\u5348\u4E0A\u73ED\u65F6\u95F4\uFF1A");

		nutimeText = new JTextField();
		nutimeText.setColumns(10);

		JLabel label_2 = new JLabel("\u7F3A\u52E4\u8BB0\u5F55\uFF1A");

		abcordText = new JTextField();
		abcordText.setColumns(10);

		JLabel label_4 = new JLabel("\u804C\u5DE5\u7F16\u53F7\uFF1A");

		JLabel label_5 = new JLabel("\u4E0A\u5348\u4E0B\u73ED\u65F6\u95F4\uFF1A");

		JLabel label_6 = new JLabel("\u4E0B\u5348\u4E0B\u73ED\u65F6\u95F4\uFF1A");

		JLabel label_7 = new JLabel("\u65E5\u671F\uFF1A");

		idText = new JTextField();
		idText.setEditable(false);
		idText.setColumns(10);

		untimeText = new JTextField();
		untimeText.setColumns(10);

		nntimeText = new JTextField();
		nntimeText.setColumns(10);

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
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(label_1).addComponent(label_3))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
														.addComponent(wdText, GroupLayout.PREFERRED_SIZE, 135,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(uutimeText)))
										.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(lblNewLabel).addComponent(label_2))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(abcordText, GroupLayout.DEFAULT_SIZE, 135,
																Short.MAX_VALUE)
														.addComponent(nutimeText))))
								.addComponent(button_1))
						.addGap(57)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(label_4).addComponent(label_5))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
														.addComponent(untimeText).addComponent(idText,
																GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)))
										.addGroup(gl_panel.createSequentialGroup()
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(label_6).addComponent(label_7))
												.addPreferredGap(ComponentPlacement.RELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(ddayText, GroupLayout.DEFAULT_SIZE, 144,
																Short.MAX_VALUE)
														.addComponent(nntimeText).addComponent(button_2))))
						.addContainerGap(187, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(label_1)
										.addComponent(wdText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_4).addComponent(idText, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(uutimeText, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_5).addComponent(untimeText,
														GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE))
										.addComponent(label_3))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(nutimeText, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_6)
												.addComponent(nntimeText, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(abcordText, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(label_7))
										.addComponent(ddayText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(label_2))
								.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(button_2)
										.addComponent(button_1))
								.addContainerGap()));
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
				uutimeText.setText(uutime);
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
		setBounds(600, 30, 817, 793);
		fillTable(new Chuqin());
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

	private void fillTable(Chuqin chuq) {
		// TODO Auto-generated method stub
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list = cqs.selectAllChuqins(chuq);
		for (Vector v : list) {
			model.addRow(v);
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
