package com.oracle.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class MainFrameas extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameas frame = new MainFrameas();
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
	public MainFrameas() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrameas.class.getResource("/image/main.png")));
		setTitle("\u804C\u5DE5\u7CFB\u7EDF\u7BA1\u7406-\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1980, 1050);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		menu.setIcon(new ImageIcon(MainFrameas.class.getResource("/image/setting.png")));
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("\u67E5\u770B\u4E2A\u4EBA\u4FE1\u606F");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开个人信息
				PersonalInternalFrame personal=new PersonalInternalFrame();
				personal.setVisible(true);
				desktopPane.add(personal);
				personal.moveToFront();
			}
		});
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("\u4FEE\u6539\u5BC6\u7801");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开修改密码界面
				ChangePwdInternalFrame changepwd=new ChangePwdInternalFrame();
				changepwd.setVisible(true);
				desktopPane.add(changepwd);
				changepwd.moveToFront();
			}
		});
		menu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5207\u6362\u7528\u6237");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//切换用户
				dispose();
				JOptionPane.showMessageDialog(null, "退出成功，正跳转至登录界面！");
				new adminuserLoginFrame().setVisible(true);
			}
		});
		menu.add(menuItem_2);
		
		JMenu mnNewMenu = new JMenu("\u67E5\u770B\u8003\u52E4\u8BB0\u5F55");
		mnNewMenu.setIcon(new ImageIcon(MainFrameas.class.getResource("/image/notebook.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem_3 = new JMenuItem("\u51FA\u52E4\u8BB0\u5F55");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开考勤记录界面
				ChuqinInternalFrame cq=new ChuqinInternalFrame();
				cq.setVisible(true);
				desktopPane.add(cq);
				cq.moveToFront();
			}
		});
		mnNewMenu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u52A0\u73ED\u8BB0\u5F55");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开加班记录界面
				JiabanInternalFrame jb=new JiabanInternalFrame();
				jb.setVisible(true);
				desktopPane.add(jb);
				jb.moveToFront();
			}
		});
		mnNewMenu.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("\u51FA\u5DEE\u8BB0\u5F55");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开出差记录界面
				ChuchaiInternalFrame cc=new ChuchaiInternalFrame();
				cc.setVisible(true);
				desktopPane.add(cc);
				cc.moveToFront();
			}
		});
		mnNewMenu.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("\u8BF7\u5047\u8BB0\u5F55");
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开请假记录界面
				QingjiaInternalFrame qj=new QingjiaInternalFrame();
				qj.setVisible(true);
				desktopPane.add(qj);
				qj.moveToFront();
			}
		});
		mnNewMenu.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("\u7F3A\u52E4\u8BB0\u5F55");
		menuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开缺勤记录界面
				QueqinInterFrame qq=new QueqinInterFrame();
				qq.setVisible(true);
				desktopPane.add(qq);
				qq.moveToFront();
			}
		});
		mnNewMenu.add(menuItem_7);
		
		JMenu menu_1 = new JMenu("\u5173\u4E8E\u8003\u52E4\u53CD\u9988");
		menu_1.setIcon(new ImageIcon(MainFrameas.class.getResource("/image/phone.png")));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_8 = new JMenuItem("\u53CD\u9988\u8054\u7CFB\u65B9\u5F0F");
		menuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AboutUslnternalFramef aboutUs=new AboutUslnternalFramef();
				aboutUs.setVisible(true);
				//与之前不同，还需把内置窗口加到虚拟桌面上
				desktopPane.add(aboutUs);
				aboutUs.moveToFront();
			}
		});
		menu_1.add(menuItem_8);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MainFrameaf.class.getResource("/image/jfimg2.jpg")));
		lblNewLabel.setBounds(0, 0, 1914, 976);
		desktopPane.add(lblNewLabel);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

}
