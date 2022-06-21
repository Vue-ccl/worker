package com.oracle.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.net.ssl.SSLContext;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.oracle.model.adminuser;
import com.oracle.service.adminuserService;
import com.oracle.service.impl.adminuserServiceimpl;
import com.oracle.utils.StringUtils;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangePwdInternalFrame extends JInternalFrame {
	private JTextField passwordText;
	public static String user_name=null;
	adminuserService as = new adminuserServiceimpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePwdInternalFrame frame = new ChangePwdInternalFrame();
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
	public ChangePwdInternalFrame() {
		getContentPane().setBackground(Color.GRAY);
		
		JLabel label = new JLabel("\u4FEE\u6539\u5BC6\u7801");
		label.setIcon(new ImageIcon(ChangePwdInternalFrame.class.getResource("/image/paw.png")));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("黑体", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u65B0\u5BC6\u7801\uFF1A");
		lblNewLabel.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.WHITE);
		
		passwordText = new JTextField();
		passwordText.setColumns(10);
		
		JButton button = new JButton("\u786E\u8BA4\u4FEE\u6539");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//修改密码功能的实现
				String password=passwordText.getText();
				if (StringUtils.isEmpty(password)) {
					// 如果没有选取到一行记录
					JOptionPane.showMessageDialog(null, "请输入新密码！");
					return;
				}
				if (!StringUtils.isInteger(password) || password.length()!=6) {
					JOptionPane.showMessageDialog(null, "请输入六位数字密码！");
					return;
					
				}
				//修改密码功能
				int i=as.updatePwd(password,user_name);
				if (i>0) {
					//成功
					JOptionPane.showMessageDialog(null, "修改密码成功！");
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "修改密码失败！");
				}
			}
		});
		button.setFont(new Font("黑体", Font.BOLD, 18));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(156)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(66)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(button)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(91, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(label)
					.addGap(80)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addComponent(button)
					.addGap(38))
		);
		getContentPane().setLayout(groupLayout);
		setClosable(true);
		setBounds(730, 250, 450, 300);

	}
}
