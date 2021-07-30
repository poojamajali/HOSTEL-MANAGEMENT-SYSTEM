package javaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;


class manager
{
	String name,mob,dob;
	
	manager()
	{}
	
	manager(String name,String mob,String dob)
	{
		this.name=name;
		this.mob=mob;
		this.dob=dob;
	}
	
	public String toString()
	{
		return name+mob+dob;
	}
}

class manager_list
{
	public static manager_list single_instance = null;
	public static ArrayList<manager> managerArray = new ArrayList();
	
	public manager_list() {}
	
	public static manager_list getInstance()
	{
		if(single_instance==null)
			single_instance=new manager_list();
		
		return single_instance;
	}
	

}

public class ManagerAdd extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_4;
	private JTextArea textArea;

	
	public ManagerAdd() {
		setTitle("MANAGER FORM");
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
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(175, 162, 80, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MOB NO");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(175, 230, 80, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DOB");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(175, 305, 80, 29);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(283, 162, 183, 43);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 230, 183, 43);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(283, 298, 49, 36);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(342, 298, 54, 36);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(406, 298, 54, 36);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(697, 144, 329, 283);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Add manager");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textField.getText();
				String mob =textField_1.getText();
				int dd = Integer.parseInt(textField_2.getText());
				int mm = Integer.parseInt(textField_3.getText());
				int yy = Integer.parseInt(textField_4.getText());
				String d=dd+"/"+mm+"/"+yy;
				
				manager_list.managerArray.add(new manager(name,mob,d));
				JOptionPane.showMessageDialog(null,"Manager Added");
				
				textArea.setText(" ");
				textArea.append("NAME\tMOB NO\n");
				
				for(manager m:manager_list.managerArray)
				{
					textArea.append(m.name+"\t"+m.mob);
				}
				
			}
		});
		btnNewButton.setBounds(196, 355, 136, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset manager ");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(376, 355, 171, 43);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("MANAGER DETAILS ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(265, 10, 196, 29);
		contentPane.add(lblNewLabel_3);
		
		btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(279, 437, 117, 51);
		contentPane.add(btnNewButton_2);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 2, 1486, 819);
		contentPane.add(lblNewLabel_4);
		
		
	}

}
