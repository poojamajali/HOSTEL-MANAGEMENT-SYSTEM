package javaProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JButton;


class room
{
	String name1,name2,name3;
	int roomno;
	room(){}
	room(String name1,String name2,String name3,int roomno)
	{
		this.name1=name1;
		this.name2=name2;
		this.roomno=roomno;
		this.name3=name3;
	}
	
	public String toString()
	{
		return name1+name2+name3+roomno;
	}
	
}

class room_list
{
	private static room_list single_instance = null;
	
	//public static room[] rooms = new room[10];
	public static ArrayList<room> rooms = new ArrayList();
	
	
	private room_list() {}
	
	public static room_list getInstance()
	{
		
		if(single_instance==null)
			single_instance=new room_list();
		
		return single_instance;
	}
	

}

public class Rooms extends JFrame {

	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rooms frame = new Rooms();
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
	public Rooms() {
		
		setTitle("ROOMS");
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1100);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("ROOM ALLOCATION");
		menuBar.add(mnNewMenu);
		
		try
		{
			room_list.rooms.get(0).roomno=1;
		}
		catch(IndexOutOfBoundsException e)
		{
			for(int i=0;i<10;i++)
			{
				room r=new room();
				r.roomno=i+1;
				room_list.rooms.add(r);
				//room_list.rooms[i]=r;
				
//				room_list.rooms[i].roomno=i+1;
			}
		}
		JMenuItem mntmNewMenuItem = new JMenuItem("ALLOCATE ROOMS RANDOMLY");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(room r : room_list.rooms)
				{
					r.name1=null;
					r.name2=null;
					r.name3=null;
				}
				for(stud s : student_list.studentArray)
				{
					s.room_no=0;
				}
				
				
				// initially one student per room
				int i=1;
				
				for(stud s : student_list.studentArray)
				{
					if(i<=10) {
					s.room_no=i;		
					room_list.rooms.get(i-1).name1=s.name;
					i++;}
					else if (i>10 && i<=20)
					{
						s.room_no=i-10;					
						room_list.rooms.get(i-10-1).name2=s.name;
						i++;
					}
					else
					{
						s.room_no=i-20;					
						room_list.rooms.get(i-20-1).name3=s.name;
						i++;
					}
					
					
				}
				
				JOptionPane.showMessageDialog(null, "ALLOCATED RANDOMLY!!");
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("ALLOCATE ROOMS MANUALLY");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManualAlloc m = new ManualAlloc();
				m.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("MUTUAL EXCHANGE");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MutualExchange m = new MutualExchange();
				m.setVisible(true);
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setPreferredSize(new Dimension(800,600));
		//pack();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(539, 166, 611, 571);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("DISPLAY ROOM DETAILS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(" ");
				textArea.setText("NAME1\tNAME2\tNAME3\tROOMNO\n");

				for(room r:room_list.rooms)
				{
					String name1=r.name1;
					String name2=r.name2;
					String name3 = r.name3;
					if(r.name1==null)
						name1="-";
					if(r.name2==null)
						name2="-";
					if(r.name3==null)
						name3="-";
					
					
					String data = name1+"\t"+name2+"\t"+name3+"\t"+r.roomno+"\n";
					textArea.append(data);
					
					
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(632, 71, 376, 69);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(123, 646, 139, 69);
		contentPane.add(btnNewButton_1);
	}
}
