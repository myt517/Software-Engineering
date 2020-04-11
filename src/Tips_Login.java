import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Tips_Login extends JPanel {

	JButton btnMemberCentre;
	JButton btnOK;
	
	/**
	 * Create the panel.
	 */
	public Tips_Login() {
		setLayout(null);
		
		JLabel lblSuccessfullyLogin = new JLabel("Successfully Log-in!");
		lblSuccessfullyLogin.setFont(new Font("Arial", Font.BOLD, 22));
		lblSuccessfullyLogin.setBounds(83, 83, 230, 40);
		add(lblSuccessfullyLogin);
		
		btnOK = new JButton("OK");
		btnOK.setFont(new Font("Arial", Font.PLAIN, 18));
		btnOK.setBounds(48, 141, 75, 29);
		add(btnOK);
		
		btnMemberCentre = new JButton("Membership Centre");
		btnMemberCentre.setFont(new Font("Arial", Font.PLAIN, 18));
		btnMemberCentre.setBounds(155, 141, 197, 29);
		add(btnMemberCentre);

	}

}
