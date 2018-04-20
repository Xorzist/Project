package Interfaces;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import Base.*;

import java.awt.Font;

public class AppType extends JFrame {
	public int getAppChoice() {
		return AppChoice;
	}

	public void setAppChoice(int appChoice) {
		AppChoice = appChoice;
	}

	int AppChoice;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppType frame = new AppType();
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
	public AppType() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInt = new JButton("Internship");
		btnInt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setAppChoice(1);
				
				Linke window=new Linke();
				window.frame.setVisible(true);
			}
		});
		btnInt.setBounds(75, 92, 118, 23);
		contentPane.add(btnInt);
		
		JButton btnSen = new JButton("Senior House Officer");
		btnSen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setAppChoice(2);
				Linke window=new Linke();
				window.frame.setVisible(true);
				
			}
		});
		btnSen.setBounds(235, 92, 131, 23);
		contentPane.add(btnSen);
		
		JLabel lblNewLabel = new JLabel("Choose Application Type");
		lblNewLabel.setBounds(152, 48, 144, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Ministry OF Health Application System");
		lblWelcomeToThe.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblWelcomeToThe.setBounds(51, 23, 359, 33);
		contentPane.add(lblWelcomeToThe);
	}
}
