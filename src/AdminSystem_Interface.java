import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminSystem_Interface extends JPanel {
	JButton btnNewButton;
	JButton btnViewStats;
	JButton btnReturnini;
	JButton btnReturnpre;
	/**
	 * Create the panel.
	 */
	public AdminSystem_Interface() {

		setLayout(null);
		setBounds(100, 100, 600, 400);
		
		JLabel lblWelcomeToAdim = new JLabel("Welcome to Admin System!");
		lblWelcomeToAdim.setFont(new Font("Arial", Font.PLAIN, 28));
		lblWelcomeToAdim.setBounds(106, 104, 364, 59);
		add(lblWelcomeToAdim);
		
		btnNewButton = new JButton("Modify Menu");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 23));
		btnNewButton.setBounds(159, 180, 245, 43);
		add(btnNewButton);
		
		
		btnViewStats = new JButton("View Stats");
		btnViewStats.setFont(new Font("Arial", Font.PLAIN, 23));
		btnViewStats.setBounds(159, 236, 245, 43);
		add(btnViewStats);
		
		btnReturnpre = new JButton("Return to previous");
		btnReturnpre.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnReturnpre.setBounds(14, 13, 191, 27);
		add(btnReturnpre);
		
		btnReturnini = new JButton("Return to initial");
		btnReturnini.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnReturnini.setBounds(14, 46, 167, 27);
		add(btnReturnini);
		
		
	}
}
