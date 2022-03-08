package GClassroomActivity27;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class GUI implements ActionListener{
	
	private static JLabel usernameLabel;
	private static JLabel passwordLabel;
	private static JTextField userTextfield;
	private static JPasswordField passwordField;
	private static JButton loginBtn;
	private static JLabel successLabel;
	

	public static void main(String[] args) {


		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 500, 500);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setBackground(new Color(255, 160, 122));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		JLabel formLabel = new JLabel("LOGIN ");
		formLabel.setVerticalAlignment(SwingConstants.TOP);
		formLabel.setHorizontalAlignment(SwingConstants.CENTER);
		formLabel.setBounds(10, 36, 464, 37);
		formLabel.setFont(new Font("Sitka Heading", Font.BOLD, 43));
		panel.add(formLabel);
		
		usernameLabel = new JLabel("USERNAME");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		usernameLabel.setBounds(42, 118, 109, 14);
		panel.add(usernameLabel);
		
		passwordLabel = new JLabel("PASSWORD");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		passwordLabel.setBounds(42, 184, 109, 14);
		panel.add(passwordLabel);
		
		userTextfield = new JTextField();
		userTextfield.setBounds(175, 105, 223, 37);
		panel.add(userTextfield);
		userTextfield.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(175, 170, 223, 37);
		panel.add(passwordField);
		
		loginBtn = new JButton("Login");
		loginBtn.setForeground(new Color(255, 255, 255));
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 17));
		loginBtn.setBackground(new Color(147, 112, 219));
		loginBtn.setBounds(187, 261, 109, 37);
		loginBtn.addActionListener(new GUI());
		panel.add(loginBtn);
		
		successLabel = new JLabel("");
		successLabel.setBounds(0, 331, 474, 37);
		successLabel.setHorizontalAlignment(SwingConstants.CENTER);
		successLabel.setFont(new Font("Sitka Text", Font.BOLD, 30));
		panel.add(successLabel);
		

		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String username = userTextfield.getText();
		String password = passwordField.getText();
		System.out.println("Username: " +username + "\nPassword: " + password);
		
		
		if(username.equals("user") && password.equals("password")) {
			successLabel.setText("LOGIN SUCCESSFUL!");
		}
		else {
			successLabel.setText("WRONG INPUT!");
			
		}
		
	}

}
