package com.oracle.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MainFrameaf extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameaf frame = new MainFrameaf();
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
	public MainFrameaf() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrameaf.class.getResource("/image/main.png")));
		setTitle("\u7BA1\u7406\u5458\u7CFB\u7EDF\u7BA1\u7406-\u4E3B\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1980, 1050);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		mnNewMenu.setIcon(new ImageIcon(MainFrameaf.class.getResource("/image/setting.png")));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("\u67E5\u770B\u7BA1\u7406\u5458\u4FE1\u606F");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开个人信息窗口
				PersonalInternalFrame personal=new PersonalInternalFrame();
				personal.setVisible(true);
				desktopPane.add(personal);
				personal.moveToFront();
			}
		});
		
		mnNewMenu.add(menuItem);
		
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
		mnNewMenu.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("\u5207\u6362\u7528\u6237");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//切换用户
				
				dispose();
				JOptionPane.showMessageDialog(null, "退出成功，正跳转至登录界面！");
				new adminuserLoginFrame().setVisible(true);
			}
		});
		mnNewMenu.add(menuItem_2);
		
		JMenu menu = new JMenu("\u804C\u5DE5\u7BA1\u7406");
		menu.setIcon(new ImageIcon(MainFrameaf.class.getResource("/image/add2.png")));
		menuBar.add(menu);
		
		JMenuItem menuItem_3 = new JMenuItem("\u6DFB\u52A0\u804C\u5DE5\u4FE1\u606F");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开添加职工的界面
				AddWorkersInernalFrame addworkers=new AddWorkersInernalFrame();
				addworkers.setVisible(true);
				desktopPane.add(addworkers);
				addworkers.moveToFront();
			}
		});
		menu.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("\u67E5\u770B\u7BA1\u7406\u804C\u5DE5");
		menuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开查看职工的界面
				ShowWorkersInernalFrame showworkers=new ShowWorkersInernalFrame();
				showworkers.setVisible(true);
				//与之前不同，还需把内置窗口加到虚拟桌面上
				desktopPane.add(showworkers);
				showworkers.moveToFront();
			}
		});
		menu.add(menuItem_4);
		
		JMenu menu_2 = new JMenu("\u8003\u52E4\u7BA1\u7406");
		menu_2.setIcon(new ImageIcon(MainFrameaf.class.getResource("/image/notebook.png")));
		menuBar.add(menu_2);
		
		JMenuItem menuItem_6 = new JMenuItem("\u67E5\u770B\u7BA1\u7406\u51FA\u52E4\u8BB0\u5F55");
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//点击打开出勤管理界面
				ManageChuqinInternalFrame managecq=new ManageChuqinInternalFrame();
				managecq.setVisible(true);
				//与之前不同，还需把内置窗口加到虚拟桌面上
				desktopPane.add(managecq);
				managecq.moveToFront();
				
			}
		});
		menu_2.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("\u67E5\u770B\u7BA1\u7406\u52A0\u73ED\u8BB0\u5F55");
		menuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开加班管理界面
				ManageJiabanInternalFrame managejb=new ManageJiabanInternalFrame();
				managejb.setVisible(true);
				//与之前不同，还需把内置窗口加到虚拟桌面上
				desktopPane.add(managejb);
				managejb.moveToFront();
			}
		});
		menu_2.add(menuItem_7);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u67E5\u770B\u7BA1\u7406\u51FA\u5DEE\u8BB0\u5F55");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开出差管理界面
				ManageChuchaiInternalFrame managecc=new ManageChuchaiInternalFrame();
				managecc.setVisible(true);
				//与之前不同，还需把内置窗口加到虚拟桌面上
				desktopPane.add(managecc);
				managecc.moveToFront();
			}
		});
		menu_2.add(mntmNewMenuItem);
		
		JMenuItem menuItem_8 = new JMenuItem("\u67E5\u770B\u7BA1\u7406\u8BF7\u5047\u8BB0\u5F55");
		menuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开请假管理界面
				ManageQingjiaInternalFrame manageqj=new ManageQingjiaInternalFrame();
				manageqj.setVisible(true);
				//与之前不同，还需把内置窗口加到虚拟桌面上
				desktopPane.add(manageqj);
				manageqj.moveToFront();
			}
		});
		menu_2.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("\u67E5\u770B\u7BA1\u7406\u7F3A\u52E4\u8BB0\u5F55");
		menuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开缺勤管理界面
				ManageQueqinInternalFrame manageqq=new ManageQueqinInternalFrame();
				manageqq.setVisible(true);
				//与之前不同，还需把内置窗口加到虚拟桌面上
				desktopPane.add(manageqq);
				manageqq.moveToFront();
			}
		});
		menu_2.add(menuItem_9);
		
		JMenu menu_1 = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		menu_1.setIcon(new ImageIcon(MainFrameaf.class.getResource("/image/phone.png")));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_5 = new JMenuItem("\u8054\u7CFB\u65B9\u5F0F");
		menuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				//打开关于我们 ，的窗口
				AboutUslnternalFramef aboutUs=new AboutUslnternalFramef();
				aboutUs.setVisible(true);
				//与之前不同，还需把内置窗口加到虚拟桌面上
				desktopPane.add(aboutUs);
				aboutUs.moveToFront();
			}
		});
		menu_1.add(menuItem_5);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MainFrameaf.class.getResource("/image/jfimg.jpg")));
		lblNewLabel.setBounds(0, 0, 1914, 976);
		desktopPane.add(lblNewLabel);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
      

	}
}
