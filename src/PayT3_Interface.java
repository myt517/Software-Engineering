import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PayT3_Interface extends JPanel {

	/**
	 * Create the panel.
	 */
	public PayT3_Interface() {
		
		setLayout(null);
		setBounds(100,100,600,400);
		
		JLabel lblSuccessfulPayment = new JLabel("Successful payment!");
		lblSuccessfulPayment.setFont(new Font("Calibri", Font.BOLD, 28));
		lblSuccessfulPayment.setBounds(159, 157, 299, 40);
		add(lblSuccessfulPayment);
		
		JLabel lblNewLabel = new JLabel("The ticket is printing\u2026\u2026");
		lblNewLabel.setForeground(new Color(147, 112, 219));
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblNewLabel.setBounds(175, 243, 255, 40);
		add(lblNewLabel);
	}

}
