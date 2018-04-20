package Interfaces;


import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.sun.webkit.Timer;

import Base.*;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.text.DefaultCaret;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class Appli {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appli window = new Appli();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Appli() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JLabel lbUse = new JLabel("Username");
		lbUse.setBounds(141, 71, 88, 16);
		frame.getContentPane().add(lbUse);
		
		JLabel lbPass = new JLabel("Password");
		lbPass.setBounds(141, 123, 88, 16);
		frame.getContentPane().add(lbPass);
		
		JTextField username = new JTextField();
		username.setBounds(141, 91, 114, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		JTextField password = new JTextField();
		password.setBounds(141, 142, 114, 20);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JButton Login = new JButton("Login");
		Login.setBounds(151, 180, 98, 26);
		frame.getContentPane().add(Login);
		
		JPanel Animator = new JPanel();
		Animator.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		Animator.setForeground(Color.GRAY);
		
		Animator.setBounds(33, 12, 389, 39);
		frame.getContentPane().add(Animator);
		
		Animate2 box = new Animate2("MOH APPLICATION SYSTEM", 40);
		box.setBounds(33, 12, 389, 57);
		frame.getContentPane().add(box);
		box.setForeground(Color.GRAY);
		box.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		box.start();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//lbPOU.setVisible(false);
	
	

	Login.addActionListener(new ActionListener() {
	
		//PatientManager j = new PatientManager();
		
		public void actionPerformed(ActionEvent f) {
			
			if(username.getText().equals("R") && password.getText().equals("1")){
				
				
				AppType App= new AppType();
				App.setVisible(true);
				frame.setVisible(false);
				
			}else{
				JOptionPane.showMessageDialog(frame, "Username Or Password Incorrect");
				//SlbPOU.setVisible(true);
				
			}
			  
			
		}
	});
	
	}

public static void createFrame()
{
    EventQueue.invokeLater(new Runnable()
    {
        @Override
        public void run()
        {
            JFrame frame = new JFrame("Test");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            try 
            {
               UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
               e.printStackTrace();
            }
            JPanel panel = new JPanel();
            panel.setLayout((LayoutManager) new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setOpaque(true);
            JTextArea textArea = new JTextArea(15, 50);
            textArea.setWrapStyleWord(true);
            textArea.setEditable(false);
            textArea.setFont(Font.getFont(Font.SANS_SERIF));
            JScrollPane scroller = new JScrollPane(textArea);
            scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            JPanel inputpanel = new JPanel();
            inputpanel.setLayout(new FlowLayout());
            JTextField input = new JTextField(20);
            JButton button = new JButton("Enter");
            DefaultCaret caret = (DefaultCaret) textArea.getCaret();
            caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
            panel.add(scroller);
            inputpanel.add(input);
            inputpanel.add(button);
            panel.add(inputpanel);
            frame.getContentPane().add(BorderLayout.CENTER, panel);
            frame.pack();
            frame.setLocationByPlatform(true);
            frame.setVisible(true);
            frame.setResizable(false);
            input.requestFocus();
        }
    });
}
}
