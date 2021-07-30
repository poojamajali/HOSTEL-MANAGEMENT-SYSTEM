package javaProject;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



//import gui.Us;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

class stud
{
	String name,email,usn,mob,dob,branch;
	int year,room_no;
	double fees_paid;
	
	stud()
	{
		room_no=0;
	}
	
	stud(String name,String email,String usn,String mob,String dob,String branch,int year)
	{
		this.name=name;
		this.branch=branch;
		this.email=email;
		this.usn=usn;
		this.mob=mob;
		this.dob=dob;
		this.year=year;
	}
	
	public String toString()
	{
		return name+":"+ email +":"+ mob +":"+branch+":"+dob+":"+year+":"+usn+room_no;
	}
}

class student_list
{
	public static student_list single_instance = null;
	public static ArrayList<stud> studentArray = new ArrayList();
	
	public student_list() {}
	
	public static student_list getInstance()
	{
		if(single_instance==null)
			single_instance=new student_list();
		
		return single_instance;
	}
	

}
public class Student extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	
	public Student() {
		
		
		setTitle("STUDENT FORM");
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
		
		
		JLabel lblNewLabel = new JLabel("STUDENT RECORD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(500, 24, 153, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(234, 80, 62, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("MOBILE");
		lblNewLabel_3.setBounds(234, 214, 73, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("BRANCH");
		lblNewLabel_4.setBounds(234, 285, 62, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("YEAR");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(234, 149, 62, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("EMAIL");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(553, 80, 45, 13);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("USN");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(553, 139, 45, 13);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("DOB");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(553, 214, 45, 13);
		contentPane.add(lblNewLabel_8);
		
		
		
		textField = new JTextField();
		textField.setBounds(381, 77, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(381, 211, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CS", "ECE", "CIVIL", "MECH", "EEE", "A&R", "BIOTECH", "ARCH"}));
		comboBox.setBounds(381, 281, 62, 21);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_1.setBounds(381, 147, 45, 21);
		contentPane.add(comboBox_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(647, 77, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(647, 136, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(652, 211, 45, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(717, 211, 45, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(788, 211, 45, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(1019, 106, 401, 668);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("ADD STUDENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flag=0;
				String name = textField.getText();
				String mob =textField_2.getText();
				String email = textField_3.getText();
				String usn = textField_4.getText();
				int dd = Integer.parseInt(textField_5.getText());
				int mm = Integer.parseInt(textField_6.getText());
				int yy = Integer.parseInt(textField_7.getText());
				String d=dd+"/"+mm+"/"+yy;
				
				String branch =comboBox.getSelectedItem().toString();
				String y = comboBox_1.getSelectedItem().toString();
				int year = Integer.parseInt(y);
				
				for(stud i : student_list.studentArray)
				{
					if((i.usn).equals(usn))
					{
						JOptionPane.showMessageDialog(null,"Student Already Exists");
						flag=1;
						break;
					}
				}
				stud s=new stud(name,email,usn,mob,d,branch,year);
				
				
				
					
				
				
				if(flag==0) {
				
				
					student_list.studentArray.add(s);
					JOptionPane.showMessageDialog(null,"Student Added");
					
					}
					
				
				
				
			}
		});
		btnNewButton.setBounds(381, 373, 120, 21);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				textField_5.setText(" ");
				textField_6.setText(" ");
				textField_7.setText(" ");
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setBounds(539, 373, 114, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DISPLAY STUDENT LIST");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("STUDENT LIST \n");
				
				for(stud i : student_list.studentArray) {
					
					String data = i.usn +", " + i.name+", " + i.room_no+  "\n";
					textArea.setLineWrap(true);
					textArea.append(data);
					
				}
				
			}
		});
		btnNewButton_2.setBounds(681, 373, 183, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("STUDENT LIST");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(1128, 62, 167, 13);
		contentPane.add(lblNewLabel_9);
		
		JButton btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_3.setBounds(553, 457, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\pooja\\Downloads\\stud (1).gif"));
		lblNewLabel_10.setBounds(0, 0, 1486, 807);
		contentPane.add(lblNewLabel_10);
	}
}
