package javaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Manager_login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager_login frame = new Manager_login();
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
	public Manager_login() {
		setTitle("MANAGER LOGIN");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("MENU");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("ADD STUDENT");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Student s = new Student();
				s.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("ADD MANAGER ");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagerAdd m = new ManagerAdd();
				m.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("DETAILS ");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Approve Leave Letters");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Approve a = new Approve();
				a.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Allocate Rooms");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rooms r = new Rooms();
				r.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Check FeedBack");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CheckF c = new CheckF();
				c.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MANAGER LOGIN");
		lblNewLabel.setBounds(181, 20, 191, 31);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(110, 116, 321, 237);
		contentPane.add(textArea);
		textArea.setText(" ");
		String s1 = "\nNUMBER OF STUDENTS IN HOSTEL = "+ student_list.studentArray.size();
		String s2 = "\nNUMBER OF MANAGERS IN HOSTEL = "+ manager_list.managerArray.size();
		String s3 = "\nNUMBER OF ROOMS IN HOSTEL = 10";
		textArea.append(s1);
		textArea.append(s2);
		textArea.append(s3);
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(541, 588, 154, 68);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REFRESH");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(" ");
				String s1 = "\nNUMBER OF STUDENTS IN HOSTEL = "+ student_list.studentArray.size();
				String s2 = "\nNUMBER OF MANAGERS IN HOSTEL = "+ manager_list.managerArray.size();
				String s3 = "\nNUMBER OF ROOMS IN HOSTEL = 10";
				textArea.append(s1);
				textArea.append(s2);
				textArea.append(s3);
			}
		});
		btnNewButton_1.setBounds(201, 393, 129, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblLeaveRequested = new JLabel("LEAVE REQUESTED");
		lblLeaveRequested.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLeaveRequested.setBounds(816, 20, 227, 31);
		contentPane.add(lblLeaveRequested);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(760, 105, 291, 237);
		contentPane.add(textArea_1);
		
		textArea_1.setText("LEAVE LETTERS REQUESTED = "+letter_list.letters.size()+"\n");
		for(letter l :letter_list.letters)
		{
			textArea_1.append(l.name+"\t"+l.reason+"\n");
		}
		
		JButton btnNewButton_1_1 = new JButton("REFRESH");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea_1.setText("LEAVE LETTERS REQUESTED = "+letter_list.letters.size()+"\n");
				for(letter l :letter_list.letters)
				{
					textArea_1.append(l.name+"\t"+l.reason+"\n");
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1_1.setBounds(828, 393, 129, 31);
		contentPane.add(btnNewButton_1_1);
	}
}
