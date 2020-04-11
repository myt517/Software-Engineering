import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminET_Interface extends JPanel {
	JButton btnYes;
	JButton btnBack;
	/**
	 * Create the panel.
	 */
	public AdminET_Interface() {

		setLayout(null);
		setBounds(100, 100, 600, 400);
		
		JLabel lblAreYouSure = new JLabel("Are you sure to edit ?");
		lblAreYouSure.setFont(new Font("Arial", Font.PLAIN, 24));
		lblAreYouSure.setBounds(172, 135, 340, 40);
		add(lblAreYouSure);
		
		btnYes = new JButton("Yes");
		btnYes.setFont(new Font("Arial", Font.PLAIN, 20));
		btnYes.setBounds(143, 212, 113, 27);
		add(btnYes);
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBack.setBounds(306, 212, 113, 27);
		add(btnBack);
		
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AModify_Interface ot=new AModify_Interface();
//				ot.setVisible(true);
//			} });
//		
//		btnYes.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AModify_Interface ot=new AModify_Interface();
//				ot.setVisible(true);
//				//对应数据更改
//			} });
	}

}
