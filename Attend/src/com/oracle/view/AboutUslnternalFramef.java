package com.oracle.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AboutUslnternalFramef extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUslnternalFramef frame = new AboutUslnternalFramef();
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
	public AboutUslnternalFramef() {
		getContentPane().setBackground(Color.GRAY);
		setFrameIcon(new ImageIcon(AboutUslnternalFramef.class.getResource("/image/phone.png")));
		setTitle("\u8054\u7CFB\u65B9\u5F0F");
		setClosable(true);
		setIconifiable(true);
		setBounds((1980-450)/2, 200, 450, 300);
		
		JLabel label = new JLabel("\u8054\u7CFB\u65B9\u5F0F");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		
		JLabel lblQq = new JLabel("QQ\uFF1A");
		lblQq.setForeground(Color.WHITE);
		lblQq.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("2233");
		textField.setColumns(10);
		
		JLabel lblVx = new JLabel("VX\uFF1A");
		lblVx.setForeground(Color.WHITE);
		lblVx.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 15));
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText("222333");
		textField_1.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(180)
							.addComponent(label))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(108)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblVx)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_1))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblQq)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(118, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(37)
					.addComponent(label)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQq)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblVx)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(133, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
	}
}
