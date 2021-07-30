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
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Approve extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Approve frame = new Approve();
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
	public Approve() {
		setTitle("APPROVE LETTERS");
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
		
		String[] s = new String[20];
		String[] s1 = new String[20];
		int i=0;
		for(letter r : letter_list.letters )
		{
			s[i]=r.name;
			s1[i]=r.reason;
			i++;
		}
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(320, 148, 225, 33);
		comboBox.setModel(new DefaultComboBoxModel(s));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(148, 148, 72, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblReason = new JLabel("REASON");
		lblReason.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblReason.setBounds(148, 305, 72, 33);
		contentPane.add(lblReason);
		
		JButton btnNewButton = new JButton("DISPLAY REASON");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=comboBox.getSelectedItem().toString();
				for(letter r : letter_list.letters)
				{
					if(name.equals(r.name))
					{
						textField.setText(r.reason);
						break;
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(245, 219, 167, 38);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(316, 314, 229, 49);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("APPROVE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=comboBox.getSelectedItem().toString();
				
				for(int i=0;i<letter_list.letters.size();i++)
				{
					
					if(name.equals(letter_list.letters.get(i).name))
					{
						letter_list.letters.remove(i);
					}
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(256, 408, 167, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(554, 429, 85, 21);
		contentPane.add(btnNewButton_2);
		
		
		
	}

}
