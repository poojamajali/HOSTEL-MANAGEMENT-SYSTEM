package javaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JLabel;
import java.awt.Font;

class feedback
{
	String reason;
	
	feedback(String r)
	{
		this.reason=r;
	}
	
	public String toString()
	{
		return reason;
	}
	
}

class f_list
{
	public static f_list single_instance = null;
	public static ArrayList<feedback> f = new ArrayList();
	
	public f_list() {}
	
	public static f_list getInstance()
	{
		if(single_instance==null)
			single_instance=new f_list();
		
		return single_instance;
	}
	

}
public class Feed extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Feed frame = new Feed();
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
	public Feed() {
		setTitle("FEEDBACK");
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
		textField.setBounds(576, 212, 297, 80);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("GIVE FEEDBACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reason = textField.getText();
				f_list.f.add(new feedback(reason));
				JOptionPane.showMessageDialog(null, "given");
				
			}
		});
		btnNewButton.setBounds(565, 381, 142, 42);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("WRITE YOUR FEEDBACK");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(664, 93, 236, 70);
		contentPane.add(lblNewLabel);
		
		btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnExit.setBounds(817, 381, 142, 42);
		contentPane.add(btnExit);
	}

}
