package com.oracle.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.oracle.model.adminuser;
import com.oracle.service.adminuserService;
import com.oracle.service.impl.adminuserServiceimpl;

public class PersonalInternalFrame extends JInternalFrame {
	public static String user_name=null;
	private JTextField idText;
	private JTextField nameText;
	private JTextField sexText;
	private JTextField ageText;
	private JTextField profText;
	private JTextField usernameText;
	private JTextField passwordText;
	
	adminuserService as = new adminuserServiceimpl();
	adminuser adminuser=new adminuser();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalInternalFrame frame = new PersonalInternalFrame();
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
	public PersonalInternalFrame() {
		setClosable(true);
		setBackground(Color.GRAY);
		getContentPane().setForeground(Color.WHITE);
		setFrameIcon(new ImageIcon(PersonalInternalFrame.class.getResource("/image/add1.png")));
		setBounds(700, 200, 502, 396);
		
		JLabel lblNewLabel = new JLabel("\u4E2A\u4EBA\u4FE1\u606F");
		lblNewLabel.setIcon(new ImageIcon(PersonalInternalFrame.class.getResource("/image/add1.png")));
		lblNewLabel.setFont(new Font("黑体", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\u7F16\u53F7\uFF1A");
		lblNewLabel_1.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_1.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_2.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_3 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("黑体", Font.BOLD, 18));
		
		JLabel lblNewLabel_4 = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel_4.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_4.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_5 = new JLabel("\u5C97\u4F4D\uFF1A");
		lblNewLabel_5.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_5.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_6 = new JLabel("\u8D26\u53F7\uFF1A");
		lblNewLabel_6.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_6.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_7 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_7.setFont(new Font("黑体", Font.BOLD, 18));
		lblNewLabel_7.setForeground(Color.WHITE);
		
		idText = new JTextField();
		idText.setEditable(false);
		idText.setColumns(10);
		
		nameText = new JTextField();
		nameText.setEditable(false);
		nameText.setColumns(10);
		
		sexText = new JTextField();
		sexText.setEditable(false);
		sexText.setColumns(10);
		
		ageText = new JTextField();
		ageText.setEditable(false);
		ageText.setColumns(10);
		
		profText = new JTextField();
		profText.setEditable(false);
		profText.setColumns(10);
		
		usernameText = new JTextField();
		usernameText.setEditable(false);
		usernameText.setColumns(10);
		
		passwordText = new JTextField();
		passwordText.setEditable(false);
		passwordText.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(168)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(110)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(nameText))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(idText, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(sexText))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ageText))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_5)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(profText))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_6)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(usernameText))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_7)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(passwordText)))))
					.addContainerGap(176, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(idText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(nameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(sexText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(ageText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5)
						.addComponent(profText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(usernameText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(passwordText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(52, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		adminuser a=as.login(user_name);
		idText.setText(Integer.toString(a.getId()));
		nameText.setText(a.getName());
		sexText.setText(a.getSex());
		ageText.setText(a.getAge());
		profText.setText(a.getProf());
		usernameText.setText(a.getUsername());
		passwordText.setText(a.getPassword());
		
	}
	
}
