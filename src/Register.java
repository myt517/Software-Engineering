import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Register extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField textField_2;
	JButton btnPrevious;
	JButton btnInitial;
	JButton btnDone;

	/**
	 * Create the panel.
	 */
	public Register() {
		setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Arial", Font.BOLD, 24));
		lblRegister.setBounds(241, 102, 109, 25);
		add(lblRegister);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Arial", Font.PLAIN, 18));
		lblName.setBounds(129, 159, 68, 21);
		add(lblName);
		
		JLabel lblNewLabel = new JLabel("Email/Tel:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(103, 195, 96, 21);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(100, 230, 84, 21);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(199, 155, 208, 27);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(199, 191, 208, 27);
		add(textField_1);
		
		textField_2 = new JPasswordField();
		textField_2.setColumns(10);
		textField_2.setBounds(199, 226, 208, 27);
		textField_2.setEchoChar('*'); 
		add(textField_2);
		
		btnDone = new JButton("Done");
		btnDone.setFont(new Font("Arial", Font.PLAIN, 18));
		btnDone.setBounds(254, 294, 84, 29);
		add(btnDone);
		
		btnPrevious = new JButton("Return to previous");
		btnPrevious.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPrevious.setBounds(15, 15, 159, 27);
		add(btnPrevious);
		
		btnInitial = new JButton("Return to initial");
		btnInitial.setFont(new Font("Arial", Font.PLAIN, 16));
		btnInitial.setBounds(15, 57, 159, 25);
		add(btnInitial);

	}
	
	public String[] read_register_information() {
		String str[]=new String[5];
		String account=this.textField.getText();
		String email=this.textField_1.getText();
		String password=this.textField_2.getText();
		String phoneNum="123456";
		str[0]=account;
		str[1]=password;
		str[2]=email;
		str[3]=phoneNum;
		str[4]="0";
		
		return str;

	}

}
