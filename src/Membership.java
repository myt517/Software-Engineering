import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Membership extends JPanel {
	private JTextField textField;
	private JPasswordField textField_1;
	JButton btnPrevious;
	JButton btnInitial;
	JButton btnYes;
	JButton btnNo;
	JButton btnRegister;
    
	
	/**
	 * Create the panel.
	 */
	public Membership() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("If you are our membership,");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(167, 81, 241, 36);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("please enter your membership number and password:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(54, 110, 496, 49);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Membership number:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(44, 189, 180, 19);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(128, 223, 101, 19);
		add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(239, 184, 211, 27);
		add(textField);
		
		textField_1 = new JPasswordField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(239, 218, 211, 27);
		textField_1.setEchoChar('*'); 
		add(textField_1);
		
		btnYes = new JButton("Yes");
		btnYes.setFont(new Font("Arial", Font.PLAIN, 18));
		btnYes.setBounds(154, 292, 89, 27);
		add(btnYes);
		
		btnNo = new JButton("No thanks");
		btnNo.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNo.setBounds(301, 292, 124, 27);
		add(btnNo);
		
		btnRegister = new JButton("Join the loyalty scheme");
		btnRegister.setFont(new Font("Arial", Font.PLAIN, 16));
		btnRegister.setBounds(367, 358, 196, 27);
		add(btnRegister);
		
		btnPrevious = new JButton("Return to previous");
		btnPrevious.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPrevious.setBounds(15, 15, 169, 21);
		add(btnPrevious);
		
		btnInitial = new JButton("Return to initial");
		btnInitial.setFont(new Font("Arial", Font.PLAIN, 16));
		btnInitial.setBounds(15, 44, 169, 21);
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
