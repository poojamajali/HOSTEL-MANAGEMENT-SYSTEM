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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ManualAlloc extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManualAlloc frame = new ManualAlloc();
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
	public ManualAlloc() {
		setTitle("MANUAL ALLOCATION");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setPreferredSize(new Dimension(800,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MANUAL ALLOCATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(528, 59, 312, 62);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(327, 164, 159, 24);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(528, 255, 176, 48);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		String[] s = new String[20]; 
		int i=0;
		for(stud m :student_list.studentArray)
		{
			s[i]=m.name;
			i++;
		}
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(528, 168, 176, 21);
		comboBox.setModel(new DefaultComboBoxModel(s));
		contentPane.add(comboBox);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("ENTER ROOM NO HERE:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(242, 255, 204, 48);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("ALLOCATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=comboBox.getSelectedItem().toString();
				for(stud s : student_list.studentArray)
				{
					if(s.name.equals(name))
					{
						
						for(room r: room_list.rooms)
						{
							if(r.name1==name)
								r.name1=null;
							if(r.name2==name)
								r.name2=null;
						}
						
						String num=textField_1.getText();
						int roomno=Integer.parseInt(num);
						if(room_list.rooms.get(roomno-1).name1==null)
							{
							
							
							  room_list.rooms.get(roomno-1).name1=s.name;
							  s.room_no=roomno;
							  JOptionPane.showMessageDialog(null, "ROOM1 ALLOCATION SUCCESSFULL");
							}
						else if(room_list.rooms.get(roomno-1).name2==null)
						{
							
							room_list.rooms.get(roomno-1).name2=s.name;
							  s.room_no=roomno;
							  JOptionPane.showMessageDialog(null, "ROOM2 ALLOCATION SUCCESSFULL");
						}
						else
						{
							JOptionPane.showMessageDialog(null, "THIS ROOM IS FULL!! TRY OTHER ROOM");
						}
						break;
						
					}
					
					
					
				}
				
			}
		});
		btnNewButton.setBounds(475, 398, 187, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(720, 398, 120, 48);
		contentPane.add(btnNewButton_1);
		
		
	}
}
