package javaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MutualExchange extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MutualExchange frame = new MutualExchange();
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
	public MutualExchange() {
		setTitle("MUTUAL EXCHANGE");
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
		
		String[] s = new String[20]; 
		int i=0;
		for(stud m :student_list.studentArray)
		{
			s[i]=m.name;
			i++;
		}
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(617, 123, 214, 43);
		comboBox.setModel(new DefaultComboBoxModel(s));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("MUTUAL EXCHNAGE 2 PEOPLE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(565, 43, 340, 54);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(384, 121, 102, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("NAME 2");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(384, 210, 102, 43);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(617, 210, 214, 43);
		comboBox_1.setModel(new DefaultComboBoxModel(s));
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("EXCHANGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name1=comboBox.getSelectedItem().toString();
				String name2=comboBox_1.getSelectedItem().toString();
				int room1=0,room2=0;
				
				
				for(stud s : student_list.studentArray)
				{
					if(name1.equals(s.name))
						room1=s.room_no;
					if(name2.equals(s.name))
						room2=s.room_no;
						
				}
				
			
				System.out.println(name1+name2);
				
					for(stud s : student_list.studentArray)
					{
						if(name1.equals(s.name))
							s.room_no=room2;
						if(name2.equals(s.name))
							s.room_no=room1;
							
					}
					// search for name1 and make it as temp
				for(room r : room_list.rooms)
				{
					if(name1.equals(r.name1))
					{
						r.name1="temp";
					}
					if(name1.equals(r.name2))
					{
						r.name1="temp";
					}
						
				}
				
				for(room r : room_list.rooms)
				{
					if(name2.equals(r.name1))
					{
						r.name1=name1;
					}
					if(name2.equals(r.name2))
					{
						r.name1=name1;
					}
						
				}
				String temp="temp";
				for(room r : room_list.rooms)
				{
					if(temp.equals(r.name1))
					{
						r.name1=name2;
					}
					if(temp.equals(r.name2))
					{
						r.name1=name2;
					}
						
				}
				
					
					JOptionPane.showMessageDialog(null, "MUTUAL EXCHANGE DONE!!");
				}
				
				
				
				
				
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(457, 359, 169, 54);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(751, 359, 169, 54);
		contentPane.add(btnExit);
	}
}
