package com.oracle.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.alibaba.druid.util.StringUtils;
import com.oracle.model.adminuser;
import com.oracle.service.adminuserService;
import com.oracle.service.impl.adminuserServiceimpl;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class adminuserLoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameText;
	private JPasswordField passwordText;
	public static String user_name=null;
	public static String ID=null;
	
	//创建Service对象，成员变量，所以方法都可以使用这个对象
	adminuserService as=new adminuserServiceimpl();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminuserLoginFrame frame = new adminuserLoginFrame();
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
	public adminuserLoginFrame() {
		setBackground(Color.GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage(adminuserLoginFrame.class.getResource("/image/login.png")));
		setTitle("\u804C\u5DE5\u8003\u52E4\u7CFB\u7EDF-\u767B\u5F55");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 295);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u767B  \u5F55");
		lblNewLabel.setIcon(new ImageIcon(adminuserLoginFrame.class.getResource("/image/login2.png")));
		lblNewLabel.setBackground(Color.DARK_GRAY);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("黑体", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("\u8D26\u53F7\uFF1A");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("黑体", Font.BOLD, 20));
		lblNewLabel_1.setIcon(new ImageIcon(adminuserLoginFrame.class.getResource("/image/user.png")));
		
		usernameText = new JTextField();
		usernameText.setColumns(10);
		
		JLabel label = new JLabel("\u5BC6\u7801\uFF1A");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("黑体", Font.BOLD, 20));
		label.setIcon(new ImageIcon(adminuserLoginFrame.class.getResource("/image/paw.png")));
		
		JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				loginActionPerformed(event);
			}
		});
		btnNewButton.setIcon(new ImageIcon(adminuserLoginFrame.class.getResource("/image/login3.png")));
		btnNewButton.setFont(new Font("黑体", Font.BOLD, 20));
		btnNewButton.setForeground(Color.BLACK);
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				resetActionPerformed(event);
				
			}
		});
		btnNewButton_1.setFont(new Font("黑体", Font.BOLD, 20));
		btnNewButton_1.setIcon(new ImageIcon(adminuserLoginFrame.class.getResource("/image/clear.png")));
		
		passwordText = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(81)
								.addComponent(btnNewButton_1)
								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton)
								.addGap(19))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(65)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_1)
									.addComponent(label))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(passwordText)
									.addComponent(usernameText, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(148)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(84, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(usernameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		//窗口居中
		this.setLocationRelativeTo(null);
	}
	/**
	 * 登录功能实现
	 */
	protected void loginActionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		String username=this.usernameText.getText();
		String password=new String(passwordText.getPassword());
		String root="1";
		
		
		if (StringUtils.isEmpty(username)) {
			JOptionPane.showMessageDialog(null, "账号不能为空！");
			return;
		}
		if (StringUtils.isEmpty(password)) {
			JOptionPane.showMessageDialog(null, "密码不能为空！");
			return;
		}
		//登录
		adminuser a=as.login(username);	
		
		if(a==null) {
			//按用户名没查到
			JOptionPane.showMessageDialog(null, "账号错误！");
			return;
		}
		//传递登录信息到各个窗口
		PersonalInternalFrame.user_name=a.getUsername();
		ChangePwdInternalFrame.user_name=a.getUsername();
		ChuqinInternalFrame.ID=Integer.toString(a.getId()) ;
		JiabanInternalFrame.ID=Integer.toString(a.getId()) ;
		ChuchaiInternalFrame.ID=Integer.toString(a.getId()) ;
		QingjiaInternalFrame.ID=Integer.toString(a.getId()) ;
		QueqinInterFrame.ID=Integer.toString(a.getId()) ;
		if (password.equals(a.getPassword())) {
			JOptionPane.showMessageDialog(null, "登录成功！");
			dispose();
			//保存登录id
			
			if (root.equals(a.getRoot())) {
				new MainFrameaf().setVisible(true);
			}else {
				new MainFrameas().setVisible(true);
			}			
		}else {
			JOptionPane.showMessageDialog(null, "密码错误！");
		}
	}

	/**
	 * 重置功能实现
	 * @param event
	 */
	protected void resetActionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		this.usernameText.setText("");
		this.passwordText.setText("");
	}
}
