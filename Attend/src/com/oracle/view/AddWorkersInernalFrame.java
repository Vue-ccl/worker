package com.oracle.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.oracle.model.adminuser;
import com.oracle.service.adminuserService;
import com.oracle.service.impl.adminuserServiceimpl;
import com.oracle.utils.StringUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddWorkersInernalFrame extends JInternalFrame {
	private JTextField nameText;
	private JTextField ageText;
	private JTextField profText;
	private JTextField usernameText;
	private JTextField passwordText;
	adminuserService as = new adminuserServiceimpl();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWorkersInernalFrame frame = new AddWorkersInernalFrame();
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
	public AddWorkersInernalFrame() {
		getContentPane().setBackground(Color.GRAY);
		setTitle("\u6DFB\u52A0\u804C\u5DE5\u4FE1\u606F");
		setFrameIcon(new ImageIcon(AddWorkersInernalFrame.class.getResource("/image/add.png")));
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(700, 200, 514, 457);
		
		JLabel label = new JLabel("\u804C\u5DE5\u4FE1\u606F");
		label.setFont(new Font("黑体", Font.BOLD, 20));
		label.setIcon(new ImageIcon(AddWorkersInernalFrame.class.getResource("/image/add1.png")));
		
		JLabel lblNewLabel = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("黑体", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_1.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2 = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel_2.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("\u5C97\u4F4D\uFF1A");
		lblNewLabel_3.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_3.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4 = new JLabel("\u8D26\u53F7\uFF1A");
		lblNewLabel_4.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_5 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_5.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_5.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_6 = new JLabel("\u6743\u9650\uFF1A");
		lblNewLabel_6.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_6.setForeground(Color.WHITE);
		
		nameText = new JTextField();
		nameText.setColumns(10);
		
		ageText = new JTextField();
		ageText.setColumns(10);
		
		profText = new JTextField();
		profText.setColumns(10);
		
		usernameText = new JTextField();
		usernameText.setColumns(10);
		
		passwordText = new JTextField();
		passwordText.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u7537", "\u5973"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"\u804C\u5DE5", "\u7BA1\u7406\u5458"}));
		
		JButton button = new JButton("\u5B8C\u6210");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//完成添加功能
				registerActionPerformed(event,comboBox,comboBox_1);
			}
		});
		button.setIcon(new ImageIcon(AddWorkersInernalFrame.class.getResource("/image/login3.png")));
		button.setFont(new Font("黑体", Font.BOLD, 18));
		
		JButton btnNewButton = new JButton("\u91CD\u7F6E");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//重置功能的实现
				resetActionPerformed(event);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("黑体", Font.BOLD, 18));
		btnNewButton.setIcon(new ImageIcon(AddWorkersInernalFrame.class.getResource("/image/clear.png")));
		
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(206, Short.MAX_VALUE)
					.addComponent(label)
					.addGap(171))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(114)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_6)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox_1, 0, 146, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordText, 146, 146, 146))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(usernameText, 146, 146, 146))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(profText, 146, 146, 146))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ageText, 146, 146, 146))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox, 0, 146, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nameText, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(60)
							.addComponent(btnNewButton)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button)
					.addGap(72))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(32)
					.addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(ageText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(profText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addComponent(usernameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button)
						.addComponent(btnNewButton))
					.addContainerGap(30, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}
	protected void registerActionPerformed(ActionEvent event,JComboBox comboBox,JComboBox comboBox_1) {
		// TODO Auto-generated method stub
		//完成添加功能
		String name = this.nameText.getText();
		String sex = comboBox.getSelectedItem().toString();
		String age = this.ageText.getText();
		String prof = this.profText.getText();
		String username = this.usernameText.getText();
		String password = this.passwordText.getText();
		String root1 = comboBox_1.getSelectedItem().toString();
		String root;
		if (root1=="管理员") {
			root="1";
		}else {
			root="0";
		}

		if (StringUtils.isEmpty(name)) {
			JOptionPane.showMessageDialog(null, "姓名不能为空！");
			return;
		}
		if (StringUtils.isEmpty(sex)) {
			JOptionPane.showMessageDialog(null, "性别不能为空！");
			return;
		}
		if (StringUtils.isEmpty(age)) {
			JOptionPane.showMessageDialog(null, "年龄不能为空！");
			return;
		}
		if (StringUtils.isEmpty(prof)) {
			JOptionPane.showMessageDialog(null, "岗位不能为空！");
			return;
		}
		if (StringUtils.isEmpty(username)) {
			JOptionPane.showMessageDialog(null, "账号不能为空！");
			return;
		} else {
			// 不为空，校验不重复
			boolean flag = as.validateUserName(username);
			if (flag == true) {
				JOptionPane.showMessageDialog(null, "账号重复！");
				return;
			}
		}

		if (StringUtils.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		if (StringUtils.isEmpty(root)) {
			JOptionPane.showMessageDialog(null, "权限不能为空！");
			return;
		}
		if (!StringUtils.isInteger(password) || password.length()!=6) {
			JOptionPane.showMessageDialog(null, "请输入六位数字密码！");
			return;
			
		}
		// 添加功能,传输数据view（控制器）==》service ===》dao （通过方法的参数）
		// dao = service = view控制器 （通过返回值）
		adminuser admins = new adminuser(name, sex, age, prof, username, password, root);
		int i = as.register(admins);
		if (i > 0) {
			JOptionPane.showMessageDialog(null, "添加成功！");
		} else {
			JOptionPane.showMessageDialog(null, "添加失败！");
		}
	}

	// 重置添加功能
	protected void resetActionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		this.nameText.setText("");
		this.ageText.setText("");
		this.profText.setText("");
		this.usernameText.setText("");
		this.passwordText.setText("");
	}
}
