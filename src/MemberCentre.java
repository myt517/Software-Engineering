import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class MemberCentre extends JPanel {

	JButton btnPrevious;
	JButton btnInitial;
	
	/**
	 * Create the panel.
	 */
	public MemberCentre() {
		setLayout(null);
		
		JLabel lblMemberCentre = new JLabel("Member Centre");
		lblMemberCentre.setFont(new Font("Arial", Font.BOLD, 20));
		lblMemberCentre.setBounds(220, 102, 158, 21);
		add(lblMemberCentre);
		
		JLabel lblDearMember = new JLabel("Dear Member,");
		lblDearMember.setFont(new Font("Arial", Font.BOLD, 18));
		lblDearMember.setBounds(38, 162, 135, 21);
		add(lblDearMember);
		
		JLabel lblYourPresentNumber = new JLabel("Your present number of stamps is:");
		lblYourPresentNumber.setFont(new Font("Arial", Font.BOLD, 18));
		lblYourPresentNumber.setBounds(38, 198, 330, 21);
		add(lblYourPresentNumber);
		
		JLabel lblStamps = new JLabel("10 stamps = 1 free meal");
		lblStamps.setForeground(Color.GRAY);
		lblStamps.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 18));
		lblStamps.setBounds(168, 262, 222, 21);
		add(lblStamps);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Arial", Font.PLAIN, 18));
		btnOk.setBounds(242, 318, 70, 29);
		add(btnOk);
		
		btnPrevious = new JButton("Return to previous");
		btnPrevious.setFont(new Font("Arial", Font.PLAIN, 16));
		btnPrevious.setBounds(15, 15, 168, 21);
		add(btnPrevious);
		
		btnInitial = new JButton("Return to initial");
		btnInitial.setFont(new Font("Arial", Font.PLAIN, 16));
		btnInitial.setBounds(15, 44, 168, 21);
		add(btnInitial);

	}

}
