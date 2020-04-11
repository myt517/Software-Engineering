import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcome_Interface extends JPanel {
	
	JButton btnStartToOrder;
	JButton btnAdministration;
	JButton btnNewButton;
	
	/**
	 * Create the panel.
	 */
	public Welcome_Interface() {
		
		setLayout(null);
	//	setBounds(100,100,600,400);
		// Start to order
		btnStartToOrder = new JButton("Start to Order");
		
		//this.btnNewButton = new JButton("New button");
		btnStartToOrder.setForeground(SystemColor.desktop);
		btnStartToOrder.setBackground(SystemColor.inactiveCaption);
		btnStartToOrder.setFont(new Font("Cambria Math", Font.PLAIN, 34));
		btnStartToOrder.setBounds(91, 178, 400, 60);
		add(this.btnStartToOrder);
		
		// Listener==============================================================	
			//	btnStartToOrder.addActionListener(new ActionListener() {
				//public void actionPerformed(ActionEvent e) {
					//Ordermenu om=new Ordermenu();
					//om.setVisable(true);
					//}});
				
				
			
		// Administration Log-in
		btnAdministration = new JButton("Administration");
		btnAdministration.setFont(new Font("Calibri", Font.PLAIN, 16));
		btnAdministration.setBounds(421, 345, 135, 27);
		add(btnAdministration);
				
		JLabel lblWelcomeToTotoro = new JLabel("Welcome to Totoro Ramen! ");
		lblWelcomeToTotoro.setForeground(SystemColor.desktop);
		lblWelcomeToTotoro.setFont(new Font("Bahnschrift", Font.PLAIN, 34));
		lblWelcomeToTotoro.setBounds(76, 94, 436, 66);
		add(lblWelcomeToTotoro);
				
		//Membership Log-in
		btnNewButton = new JButton("Membership Log-in");
		btnNewButton.setFont(new Font("Cambria", Font.PLAIN, 19));
		btnNewButton.setBackground(SystemColor.textHighlightText);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//					}
//				});
		btnNewButton.setBounds(153, 251, 252, 40);
		add(btnNewButton);
	}

}
