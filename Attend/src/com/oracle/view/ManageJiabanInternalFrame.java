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
import com.oracle.model.Jiaban;
import com.oracle.service.JiabanService;
import com.oracle.service.impl.JiabanServiceimpl;
import com.oracle.utils.StringUtils;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManageJiabanInternalFrame extends JInternalFrame {
	private JTextField idword;
	private JTable table;
	private JTextField jdText;
	private JTextField stimeText;
	private JTextField sumtimeText;
	private JTextField endtimeText;
	private JTextField idText;
	private JTextField ddayText;
	private JTextField idText2;
	private JTextField stimeText2;
	private JTextField endtimeText2;
	private JTextField sumtimeText2;
	private JTextField ddayText2;
	JiabanService jbs=new JiabanServiceimpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageJiabanInternalFrame frame = new ManageJiabanInternalFrame();
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
	public ManageJiabanInternalFrame() {
		setTitle("\u804C\u5DE5\u52A0\u73ED\u7BA1\u7406");
		getContentPane().setBackground(Color.GRAY);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u804C\u5DE5\u7F16\u53F7\uFF1A");
		
		idword = new JTextField();
		idword.setColumns(10);
		
		JButton btnNewButton = new JButton("\u641C\u7D22");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 实现搜索功能
				String key = idword.getText();
				if (StringUtils.isEmpty(key)) {
					JOptionPane.showMessageDialog(null, "请输入要查找的职工编号！");
					resetData();
					fillTable(new Jiaban());
				} else {
					Jiaban jiaban=new Jiaban();
					jiaban.setId(Integer.parseInt(key));
					resetData();
					fillTable(jiaban);
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
					.addGap(66)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_1, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(idword, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton)))
					.addContainerGap(82, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(idword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		
		JLabel label_7 = new JLabel("\u804C\u5DE5\u7F16\u53F7\uFF1A");
		
		idText2 = new JTextField();
		idText2.setColumns(10);
		
		JLabel label_8 = new JLabel("\u665A\u4E0A\u4E0A\u73ED\u65F6\u95F4\uFF1A");
		
		stimeText2 = new JTextField();
		stimeText2.setColumns(10);
		
		JLabel label_9 = new JLabel("\u665A\u4E0A\u4E0B\u73ED\u65F6\u95F4\uFF1A");
		
		endtimeText2 = new JTextField();
		endtimeText2.setColumns(10);
		
		JLabel label_10 = new JLabel("\u52A0\u73ED\u65F6\u957F\uFF1A");
		
		sumtimeText2 = new JTextField();
		sumtimeText2.setColumns(10);
		
		JLabel label_11 = new JLabel("\u65E5\u671F\uFF1A");
		
		ddayText2 = new JTextField();
		ddayText2.setColumns(10);
		
		JButton button_2 = new JButton("\u6DFB\u52A0");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				addjiaban(event);
			}
		});
		
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
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_8)
								.addComponent(label_7)
								.addComponent(label_10))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(sumtimeText2)
								.addComponent(stimeText2)
								.addComponent(idText2, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
							.addGap(59)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(label_9)
								.addComponent(label_11))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(ddayText2)
								.addComponent(endtimeText2, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(289)
							.addComponent(button_2)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button_3)))
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_7)
						.addComponent(idText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_8)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(stimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_9)
							.addComponent(endtimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_10)
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
							.addComponent(sumtimeText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_11))
						.addComponent(ddayText2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2)
						.addComponent(button_3))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel label_1 = new JLabel("\u52A0\u73ED\u7F16\u53F7\uFF1A");
		
		jdText = new JTextField();
		jdText.setEditable(false);
		jdText.setColumns(10);
		
		JLabel label_2 = new JLabel("\u665A\u4E0A\u4E0A\u73ED\u65F6\u95F4\uFF1A");
		
		stimeText = new JTextField();
		stimeText.setColumns(10);
		
		JLabel label_3 = new JLabel("\u52A0\u73ED\u65F6\u957F\uFF1A");
		
		sumtimeText = new JTextField();
		sumtimeText.setColumns(10);
		
		JLabel label_4 = new JLabel("\u665A\u4E0A\u4E0B\u73ED\u65F6\u95F4\uFF1A");
		
		endtimeText = new JTextField();
		endtimeText.setColumns(10);
		
		JLabel label_5 = new JLabel("\u804C\u5DE5\u7F16\u53F7\uFF1A");
		
		idText = new JTextField();
		idText.setEditable(false);
		idText.setColumns(10);
		
		JLabel label_6 = new JLabel("\u65E5\u671F\uFF1A");
		
		ddayText = new JTextField();
		ddayText.setColumns(10);
		
		JButton button = new JButton("\u5220\u9664");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//删除按钮功能的实现
				String jd = jdText.getText();
				if (StringUtils.isEmpty(jd)) {
					// 如果没有选取到一行记录
					JOptionPane.showMessageDialog(null, "请选择要删除的记录！");
					return;
				}
				int i = jbs.deleteJiaban(jd);
				if (i > 0) {
					// 删除成功
					JOptionPane.showMessageDialog(null, "删除成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Jiaban());
				} else {
					JOptionPane.showMessageDialog(null, "删除失败！");
				}
			}
		});
		
		JButton button_1 = new JButton("\u4FEE\u6539");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// 修改功能的实现，先判断修改是否为空
				String jd = jdText.getText();
				if (StringUtils.isEmpty(jd)) {
					JOptionPane.showMessageDialog(null, "请选择要修改的记录！");
					return;
				}
				String id = idText.getText();
				String stime = stimeText.getText();
				String endtime = endtimeText.getText();
				String sumtime = sumtimeText.getText();
				String dday = ddayText.getText();
				
				if (StringUtils.isEmpty(stime)) {
					JOptionPane.showMessageDialog(null, "晚上上班时间不能为空！");
					return;
				}
				if (StringUtils.isEmpty(endtime)) {
					JOptionPane.showMessageDialog(null, "晚上下班时间不能为空！");
					return;
				}
				if (StringUtils.isEmpty(sumtime)) {
					JOptionPane.showMessageDialog(null, "加班时长不能为空！");
					return;
				}
				if (StringUtils.isEmpty(dday)) {
					JOptionPane.showMessageDialog(null, "日期不能为空！");
					return;
				}

				// 修改功能实现
				Jiaban jiab=new Jiaban(Integer.parseInt(jd), Integer.parseInt(id), stime, endtime, Integer.parseInt(sumtime), dday);
				int i = jbs.updataJiaban(jiab);
				if (i > 0) {
					// 删除成功
					JOptionPane.showMessageDialog(null, "修改成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Jiaban());
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
						.addComponent(button)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(label_2)
								.addComponent(label_3))
							.addGap(14)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(sumtimeText)
								.addComponent(stimeText)
								.addComponent(jdText, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
					.addGap(55)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_4)
						.addComponent(label_5)
						.addComponent(label_6))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(ddayText)
							.addComponent(idText)
							.addComponent(endtimeText, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
						.addComponent(button_1))
					.addContainerGap(114, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(jdText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_5)
						.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(stimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)
						.addComponent(endtimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(sumtimeText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_6)
						.addComponent(ddayText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(button_1))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent event) {
				// 点击表格当前行数据，将数据显示在表单上
				int row = table.getSelectedRow(); // 获得选中行号

				Integer jd = (Integer) table.getValueAt(row, 0);
				Integer id = (Integer) table.getValueAt(row, 1);
				String stime = (String) table.getValueAt(row, 2);
				String endtime = (String) table.getValueAt(row, 3);
				Integer sumtime = (Integer) table.getValueAt(row, 4);
				String dday = (String) table.getValueAt(row, 5);

				// 把这一行数据显示在表单上
				jdText.setText(jd.toString());
				idText.setText(id.toString());
				stimeText.setText(stime);
				endtimeText.setText(endtime);
				sumtimeText.setText(sumtime.toString());
				ddayText.setText(dday);
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u52A0\u73ED\u7F16\u53F7", "\u804C\u5DE5\u7F16\u53F7", "\u665A\u4E0A\u4E0A\u73ED\u65F6\u95F4", "\u665A\u4E0A\u4E0B\u73ED\u65F6\u95F4", "\u52A0\u73ED\u65F6\u957F", "\u65E5\u671F"
			}
		));
		scrollPane.setViewportView(table);
		getContentPane().setLayout(groupLayout);
		setClosable(true);
		setBounds(550,30, 813, 751);
		fillTable(new Jiaban());//填充表格

	}
	
	protected void addjiaban(ActionEvent event) {
		/**
		 * 添加出勤记录功能的实现
		 * 
		 * @param event
		 */
		String id = this.idText2.getText();
		String stime = this.stimeText2.getText();
		String endtime = this.endtimeText2.getText();
		String sumtime = this.sumtimeText2.getText();
		String dday = this.ddayText2.getText();
		if (StringUtils.isEmpty(id)) {
			JOptionPane.showMessageDialog(null, "编号不能为空！");
			return;
		}
		if (StringUtils.isEmpty(stime)) {
			JOptionPane.showMessageDialog(null, "晚上上班时间不能为空！");
			return;
		}
		if (StringUtils.isEmpty(endtime)) {
			JOptionPane.showMessageDialog(null, "晚上下班时间不能为空！");
			return;
		}
		if (StringUtils.isEmpty(sumtime)) {
			JOptionPane.showMessageDialog(null, "加班时长不能为空！");
			return;
		}
		if (StringUtils.isEmpty(dday)) {
			JOptionPane.showMessageDialog(null, "日期不能为空！");
			return;
		}
		// 添加功能,传输数据view（控制器）==》service ===》dao （通过方法的参数）
				// dao = service = view控制器 （通过返回值）
				Jiaban jiaban=new Jiaban(Integer.parseInt(id), stime, endtime, Integer.parseInt(sumtime), dday);
				int i = jbs.adddate(jiaban);
				if (i > 0) {
					JOptionPane.showMessageDialog(null, "添加成功！");
					// 清空刷新表单数据
					resetData();
					// 填充刷新表格
					fillTable(new Jiaban());
				} else {
					JOptionPane.showMessageDialog(null, "添加失败！");
				}
		
	}

	private void fillTable(Jiaban jiab) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		List<Vector> list = jbs.selectAllJiabans(jiab);
		for (Vector v : list) {
			model.addRow(v);
		}
	}
	/**
	 * 清空表单数据
	 */
	private void resetData() {
		jdText.setText("");
		idText.setText("");
		stimeText.setText("");
		endtimeText.setText("");
		sumtimeText.setText("");
		ddayText.setText("");
	}
}
