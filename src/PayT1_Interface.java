import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PayT1_Interface extends JPanel {

	/**
	 * Create the panel.
	 */
	public PayT1_Interface() {
		
		setLayout(null);
		setBounds(100,100,600,400);
		
		JLabel lblSorryYourVisual = new JLabel("Sorry, your Visual Stamps are not enough (6).");
		lblSorryYourVisual.setFont(new Font("Calibri", Font.PLAIN, 24));
		lblSorryYourVisual.setBounds(75, 125, 489, 61);
		add(lblSorryYourVisual);
		
		JLabel lblTotal = new JLabel("TOTAL: 40\u00A3 ");
		lblTotal.setFont(new Font("Arial", Font.BOLD, 19));
		lblTotal.setBounds(218, 199, 133, 30);
		add(lblTotal);
		
		JLabel lblPayVia = new JLabel("Pay via:");
		lblPayVia.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPayVia.setBounds(120, 276, 72, 18);
		add(lblPayVia);
		
		JButton btnCash = new JButton("Cash");
		btnCash.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCash.setBounds(206, 268, 85, 27);
		add(btnCash);
		
		JButton btnCard = new JButton("Card");
		btnCard.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCard.setBounds(328, 268, 85, 27);
		add(btnCard);
	}

}
