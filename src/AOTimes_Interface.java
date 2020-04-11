import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class AOTimes_Interface extends JPanel {
	//private JTable table;
		private JTable Souptbl;
		private JTable Noodletbl;
		private JTable SOtbl;
		private JTable Otherstbl;
		
		// ¿â´æ
		private String[][] SoupData = {{"Tonkotsu","2"},{"Shoyu","3"},{"Shio","5"}};
		private String[] SoupTitle = {"Soup","Times"};
		
		private String[][] NoodleData = {{"Soft","2"},{"Medium","3"},{"Firm","5"}};
		private String[] NoodleTitle = {"Noodles","Times"};
		
		private String[][] SOData = {{"No","2"},{"A little","3"},{"A lot","5"}};
		private String[] SOTitle = {"Spring Onion","Times"};
		
		private String[][] OthersData = {{"Nori","2"},{"Chashu","3"},{"Boiled Egg","5"},{"Banboo shoots","5"}};
		private String[] OthersTitle = {"Others","Times"};
		
		private JLabel lblSoup;
		private JLabel lblNoodles;
		private JLabel lblSpringOinon;
		private JLabel lblOthers;
		private JLabel lblNewLabel;
		JButton btnBack;
		JButton btnYes;
		JButton btnReturnini;
		

	/**
	 * Create the panel.
	 */
	public AOTimes_Interface() {

		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		JLabel lblTimesOfOrder = new JLabel("\u2014 Times of Order \u2014");
		lblTimesOfOrder.setFont(new Font("Arial", Font.PLAIN, 27));
		lblTimesOfOrder.setBounds(262, 52, 275, 40);
		add(lblTimesOfOrder);
		
		//Soup table
		Souptbl = new JTable(SoupData, SoupTitle);
		Souptbl.setFillsViewportHeight(true);
		Souptbl.setEnabled(false);
		Souptbl.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		Souptbl.setBackground(new Color(245, 245, 245));
		Souptbl.setFont(new Font("Calibri", Font.PLAIN, 19));
		Souptbl.setBounds(66, 135, 275, 48);
	//	Souptbl.getColumnModel().getColumn(0).setPreferredWidth(100);
		add(Souptbl);
		
		//Noodles table
		Noodletbl = new JTable(NoodleData, NoodleTitle);
		Noodletbl.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		Noodletbl.setBackground(new Color(245, 245, 245));
		Noodletbl.setFont(new Font("Calibri", Font.PLAIN, 19));
		Noodletbl.setBounds(66, 234, 275, 48);
		add(Noodletbl);
		
		//Spring Onion table
		SOtbl = new JTable(SOData, SOTitle);
		SOtbl.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		SOtbl.setBackground(new Color(245, 245, 245));
		SOtbl.setFont(new Font("Calibri", Font.PLAIN, 19));
		SOtbl.setBounds(66, 365, 275, 48);
		add(SOtbl);
		
		//Others table
		Otherstbl = new JTable(OthersData,OthersTitle);
		Otherstbl.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
		Otherstbl.setBackground(new Color(245, 245, 245));
		Otherstbl.setFont(new Font("Calibri", Font.PLAIN, 20));
		Otherstbl.setBounds(450, 134, 275, 64);
		add(Otherstbl);
		
		//Label
		lblSoup = new JLabel("Soup");
		lblSoup.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
		lblSoup.setBounds(166, 93, 72, 29);
		add(lblSoup);
		
		lblNoodles = new JLabel("Noodles");
		lblNoodles.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
		lblNoodles.setBounds(139, 197, 99, 29);
		add(lblNoodles);
		
		lblSpringOinon = new JLabel("Spring Oinon");
		lblSpringOinon.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
		lblSpringOinon.setBounds(139, 320, 172, 40);
		add(lblSpringOinon);
		
		lblOthers = new JLabel("Others");
		lblOthers.setFont(new Font("Bahnschrift", Font.PLAIN, 23));
		lblOthers.setBounds(549, 92, 89, 29);
		add(lblOthers);
		
		lblNewLabel = new JLabel("The most popular level of spiciness is  5 .");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		lblNewLabel.setBounds(367, 246, 389, 48);
		add(lblNewLabel);
		
		JRadioButton rdbtnGenerateThisReport = new JRadioButton("Generate this report.");
		rdbtnGenerateThisReport.setFont(new Font("Calibri", Font.PLAIN, 22));
		rdbtnGenerateThisReport.setBounds(480, 303, 228, 29);
		add(rdbtnGenerateThisReport);
		
		JRadioButton rdbtnSendItTo = new JRadioButton("Send it to my Email.");
		rdbtnSendItTo.setFont(new Font("Calibri", Font.PLAIN, 22));
		rdbtnSendItTo.setBounds(480, 348, 268, 29);
		add(rdbtnSendItTo);
		
		//Button
		btnYes = new JButton("Yes");
		btnYes.setFont(new Font("Calibri", Font.PLAIN, 21));
		btnYes.setBounds(538, 386, 113, 27);
		add(btnYes);
		
		btnBack = new JButton("Return to previous");
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnBack.setBounds(14, 13, 193, 27);
		add(btnBack);
		
		//Show date
		JLabel lblDate = new JLabel("Date: 2020 3.9-3.15");
		lblDate.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblDate.setBounds(549, 211, 172, 36);
		add(lblDate);
		
		btnReturnini = new JButton("Return to initial");
		btnReturnini.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnReturnini.setBounds(14, 50, 164, 27);
		add(btnReturnini);
		
//		btnBack.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AdminSystem_Interface ot=new AdminSystem_Interface();
//				ot.setVisible(true);
//			}
//		});
		
	}

}
