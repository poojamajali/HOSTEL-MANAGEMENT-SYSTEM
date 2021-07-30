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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.ImageIcon;

class Registration
{
	String user,pass,usn,mob;
	
	Registration(){}
	Registration(String user,String pass,String usn,String mob)
	{
		this.user=user;
		this.pass=pass;
		this.usn=usn;
		this.mob=mob;
	}
	
	public String toString()
	{
		return user+pass+usn+mob;
	}
}
class store_details
{
	private static store_details single_instance = null;
	public static ArrayList<Registration> RegStudents = new ArrayList();
	
	private store_details() {}
	
	public static store_details getInstance()
	{
		if(single_instance==null)
			single_instance=new store_details();
		
		return single_instance;
	}
	

}

public class StudentLogin extends JFrame {
	
	//static public ArrayList<Registration> RegStudents = new ArrayList();

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;


	public StudentLogin() {
		setTitle("STUDENT LOGIN PAGE");
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
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(582, 52, 508, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(485, 148, 167, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PASSWORD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(485, 232, 167, 37);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.setColumns(10);
		textField.setBounds(756, 152, 216, 37);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.YELLOW);
		textField_1.setColumns(10);
		textField_1.setBounds(756, 236, 216, 37);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("USN");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(485, 305, 167, 37);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("MOB NO");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(485, 383, 167, 37);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.YELLOW);
		textField_2.setColumns(10);
		textField_2.setBounds(756, 309, 216, 37);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.YELLOW);
		textField_3.setColumns(10);
		textField_3.setBounds(756, 387, 216, 37);
		contentPane.add(textField_3);
		
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flag=0;
				String user = textField.getText();
				String pass =textField_1.getText();
				String usn = textField_2.getText();
				String mob = textField_3.getText();
				
				for(stud s:student_list.studentArray)
				{
					if(s.name.equals(user))
					{
						store_details.RegStudents.add(new Registration(user,pass,usn,mob));
						flag=1;
						JOptionPane.showMessageDialog(null, "REGISTERED!!");
					}
				}
				
				if(flag==0)
				{
					JOptionPane.showMessageDialog(null, "STUDENT IS NOT ADDED TO THE HOSTEL YET BY THE ADMIN! ");
				}
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(523, 515, 154, 86);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBounds(778, 515, 154, 86);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\pooja\\Downloads\\Login-Registration-icon (1).png"));
		lblNewLabel_3.setBounds(0, 0, 1486, 811);
		contentPane.add(lblNewLabel_3);
		
		
	}
}
