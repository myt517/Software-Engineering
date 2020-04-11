import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PayT2_Interface extends JPanel {

	/**
	 * Create the panel.
	 */
	public PayT2_Interface() {
		
		setLayout(null);
		
		JLabel lblSuccessfulPayment = new JLabel("Successful payment!");
		lblSuccessfulPayment.setFont(new Font("Calibri", Font.BOLD, 26));
		lblSuccessfulPayment.setBounds(85, 44, 269, 29);
		add(lblSuccessfulPayment);
		
		JLabel lblLeftVirtualStamps = new JLabel("Left Virtual Stamps: 6");
		lblLeftVirtualStamps.setFont(new Font("Calibri", Font.PLAIN, 21));
		lblLeftVirtualStamps.setBounds(107, 90, 231, 36);
		add(lblLeftVirtualStamps);
		
		JLabel lblTheTicketIs = new JLabel("The ticket is printing\u2026\u2026");
		lblTheTicketIs.setForeground(new Color(147, 112, 219));
		lblTheTicketIs.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblTheTicketIs.setBounds(107, 151, 203, 36);
		add(lblTheTicketIs);
	}

}
