import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ALogin_Interface extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	JButton btnLogin;
	JButton btnResetPassword;
	JButton btnReturnini;
	/**
	 * Create the panel.
	 */
	public ALogin_Interface() {
		
		setLayout(null);
		setBounds(100,100,600,400);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 20));
		lblUsername.setBounds(108, 166, 117, 21);
		add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(209, 162, 195, 32);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 19));
		lblPassword.setBounds(108, 219, 100, 29);
		add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(209, 216, 195, 32);
		add(textField_1);
		textField_1.setColumns(10);
		
		//Log-in button
		btnLogin = new JButton("Log-in");
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 18));
		btnLogin.setBounds(138, 269, 113, 30);
		add(btnLogin);
		//Reset Password button
		btnResetPassword = new JButton("Reset Password");
		btnResetPassword.setFont(new Font("Arial", Font.PLAIN, 16));
		btnResetPassword.setBounds(306, 269, 170, 32);
		add(btnResetPassword);
		
		JLabel lblNewLabel = new JLabel("\u2014 Administer \u2014");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblNewLabel.setBounds(211, 94, 265, 32);
		add(lblNewLabel);
		
		btnReturnini = new JButton("Return to initial");
		btnReturnini.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnReturnini.setBounds(14, 13, 154, 27);
		add(btnReturnini);
	}
}
