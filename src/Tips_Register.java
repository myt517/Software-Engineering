import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Tips_Register extends JPanel {

	JButton btnMemberCentre;

	/**
	 * Create the panel.
	 */
	public Tips_Register() {
		setLayout(null);
		
		JLabel lblSuccessfullyRegister = new JLabel("Successfully Register!");
		lblSuccessfullyRegister.setFont(new Font("Arial", Font.BOLD, 18));
		lblSuccessfullyRegister.setBounds(102, 70, 217, 21);
		add(lblSuccessfullyRegister);
		
		JLabel lblYourMember = new JLabel("Your Membership number is:");
		lblYourMember.setFont(new Font("Arial", Font.BOLD, 18));
		lblYourMember.setBounds(28, 106, 278, 21);
		add(lblYourMember);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(50, 156, 97, 29);
		add(btnNewButton);
		
		btnMemberCentre = new JButton("Membership Centre");
		btnMemberCentre.setFont(new Font("Arial", Font.PLAIN, 18));
		btnMemberCentre.setBounds(162, 156, 189, 29);
		add(btnMemberCentre);

	}

}
