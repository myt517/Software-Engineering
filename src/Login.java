import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JPanel {
	private JTextField textField;
	private JPasswordField textField_1;
	
	JButton btnPrevious;
	JButton btnInitial;
	JButton btnDone;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		JLabel lblLogin = new JLabel("Log-in");
		lblLogin.setFont(new Font("Arial", Font.BOLD, 24));
		lblLogin.setBounds(243, 124, 101, 26);
		add(lblLogin);
		
		JLabel lblMembershipNumber = new JLabel("Membership number:");
		lblMembershipNumber.setFont(new Font("Arial", Font.PLAIN, 18));
		lblMembershipNumber.setBounds(59, 172, 181, 21);
		add(lblMembershipNumber);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPassword.setBounds(146, 235, 94, 21);
		add(lblPassword);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(243, 178, 173, 27);
		add(textField);
		
		textField_1 = new JPasswordField();
		textField_1.setColumns(10);
		textField_1.setBounds(243, 231, 173, 27);
		textField_1.setEchoChar('*'); 
		add(textField_1);
		
		btnDone = new JButton("Done");
		btnDone.setFont(new Font("Arial", Font.PLAIN, 18));
		btnDone.setBounds(247, 299, 83, 29);
		add(btnDone);
		
		btnPrevious = new JButton("Return to previous");
		btnPrevious.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPrevious.setBounds(15, 15, 173, 26);
		add(btnPrevious);
		
		btnInitial = new JButton("Return to initial");
		btnInitial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInitial.setFont(new Font("Arial", Font.PLAIN, 16));
		btnInitial.setBounds(15, 56, 173, 26);
		add(btnInitial);

	}
	
	public String[] read_login_information() {
		String str[]=new String[2];
		String account=this.textField.getText();
		String password=this.textField_1.getText();
		str[0]=account;
		str[1]=password;
		
		return str;

	}
	
	
	
	
	

}
