package javaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class letter
{
	String name,reason,status;
	
	letter(String name,String reason)
	{
		this.name=name;
		this.reason=reason;
		this.status="N";
	}
	public String toString()
	{
		return name+reason+status;
	}
}

class letter_list
{
	private static letter_list single_instance = null;
	
	//public static room[] rooms = new room[10];
	public static ArrayList<letter> letters = new ArrayList();
	
	
	private letter_list() {}
	
	public static letter_list getInstance()
	{
		
		if(single_instance==null)
			single_instance=new letter_list();
		
		return single_instance;
	}
	

}
public class LeaveLetters extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeaveLetters frame = new LeaveLetters();
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
	public LeaveLetters() {
		setTitle("REQUEST FOR LEAVE");
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
		
		textField = new JTextField();
		textField.setBounds(406, 209, 303, 86);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(270, 126, 96, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblReason = new JLabel("REASON");
		lblReason.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblReason.setBounds(270, 199, 126, 30);
		contentPane.add(lblReason);
		String[] s = new String[20]; 
		int i=0;
		for(Registration m :store_details.RegStudents)
		{
			s[i]=m.user;
			i++;
		}
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(406, 126, 290, 43);
		comboBox.setModel(new DefaultComboBoxModel(s));
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("REQUEST FOR LEAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=comboBox.getSelectedItem().toString();
				String reason = textField.getText();
				
				letter_list.letters.add(new letter(name,reason));
				JOptionPane.showMessageDialog(null, "LEAVE REQUESTED!!");
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(391, 404, 211, 66);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(786, 404, 85, 21);
		contentPane.add(btnNewButton_1);
	}

}
