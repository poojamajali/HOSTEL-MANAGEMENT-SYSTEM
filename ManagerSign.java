package javaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class ManagerSign extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	
	public ManagerSign() {
		setTitle("MANAGER SIGN IN PAGE");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1000);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setPreferredSize(new Dimension(800,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MANAGER SIGN IN");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_2.setBounds(642, 125, 435, 56);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("USERNAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(534, 220, 140, 33);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(786, 220, 220, 30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(534, 291, 140, 27);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(786, 299, 220, 33);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = textField.getText();
				String pass = passwordField.getText();
				int flag=0;
				
				
					if(user.equals("admin"))
							{
						if(pass.equals("admin123")) {
						flag=1;
						Manager_login m = new Manager_login();
						m.setVisible(true);
						
							}
							}
				
				
				if(flag==0)
				{
					JOptionPane.showMessageDialog(null, "WRONG USERNAME OR PASSWORD! TRY AGAIN");
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(348, 413, 140, 41);
		contentPane.add(btnNewButton);
		
		JButton btnGoBack = new JButton("GO BACK");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnGoBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGoBack.setBounds(589, 413, 140, 41);
		contentPane.add(btnGoBack);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\pooja\\Downloads\\images (1).png"));
		lblNewLabel_3.setBounds(0, 0, 1501, 811);
		contentPane.add(lblNewLabel_3);
		
		
		
	}
}
