import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class AModify_Interface extends JPanel {
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	JButton btnEdit;
	JButton btnReturn;
	JButton btnReturnini;

	/**
	 * Create the panel.
	 */
	public AModify_Interface() {
		
		setLayout(null);
		setBounds(100, 100, 800, 500);
		
		JLabel lblFixPrice = new JLabel("Fix Price");
		lblFixPrice.setFont(new Font("Arial", Font.BOLD, 18));
		lblFixPrice.setBounds(53, 89, 95, 26);
		add(lblFixPrice);
		
		JLabel lblSoup = new JLabel("Soup:");
		lblSoup.setFont(new Font("Arial", Font.BOLD, 18));
		lblSoup.setBounds(72, 141, 80, 32);
		add(lblSoup);
		
		JLabel lblNoodles = new JLabel("Noodles:");
		lblNoodles.setFont(new Font("Arial", Font.BOLD, 18));
		lblNoodles.setBounds(53, 188, 100, 32);
		add(lblNoodles);
		
		JLabel lblTonkotsu = new JLabel("Tonkotsu");
		lblTonkotsu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTonkotsu.setBounds(180, 123, 95, 26);
		add(lblTonkotsu);
		
		JLabel lblShoyu = new JLabel("Shoyu");
		lblShoyu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblShoyu.setBounds(371, 123, 80, 26);
		add(lblShoyu);
		
		JLabel lblShio = new JLabel("Shio");
		lblShio.setFont(new Font("Arial", Font.PLAIN, 18));
		lblShio.setBounds(585, 130, 72, 18);
		add(lblShio);
		
		JLabel lblSoft = new JLabel("Soft");
		lblSoft.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSoft.setBounds(189, 188, 63, 21);
		add(lblSoft);
		
		JLabel lblMedium = new JLabel("Medium");
		lblMedium.setFont(new Font("Arial", Font.PLAIN, 18));
		lblMedium.setBounds(357, 184, 80, 26);
		add(lblMedium);
		
		JLabel lblFirm = new JLabel("Firm");
		lblFirm.setFont(new Font("Arial", Font.PLAIN, 19));
		lblFirm.setBounds(585, 192, 72, 18);
		add(lblFirm);
		
		JLabel lblSpringOnion = new JLabel("Spring onion:");
		lblSpringOnion.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSpringOnion.setBounds(138, 245, 113, 44);
		add(lblSpringOnion);
		
		JLabel lblPepper = new JLabel("Pepper:");
		lblPepper.setFont(new Font("Arial", Font.PLAIN, 18));
		lblPepper.setBounds(432, 253, 72, 28);
		add(lblPepper);
		// Soup
		textField = new JTextField();
		textField.setBounds(177, 152, 63, 24);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(357, 152, 63, 24);
		add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(585, 155, 63, 24);
		add(textField_2);
		textField_2.setColumns(10);
		////////////////////////////////////////////////Noodle
		textField_3 = new JTextField();
		textField_3.setBounds(177, 222, 63, 24);
		add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(357, 218, 63, 24);
		add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(585, 218, 63, 24);
		add(textField_5);
		textField_5.setColumns(10);
		///////////////////////////////////////////////////
		textField_6 = new JTextField();
		textField_6.setBounds(265, 256, 63, 24);
		add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(507, 256, 63, 24);
		add(textField_7);
		textField_7.setColumns(10);
		
		//Fix Price
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Arial", Font.PLAIN, 19));
		textField_8.setText("9.99");
		textField_8.setBounds(162, 89, 86, 24);
		add(textField_8);
		textField_8.setColumns(10);
		///////////////////////////////////////////
		JLabel lblAaddson = new JLabel("Adds-on");
		lblAaddson.setFont(new Font("Arial", Font.BOLD, 18));
		lblAaddson.setBounds(53, 280, 119, 26);
		add(lblAaddson);
		
		JLabel lblNori = new JLabel("Nori");
		lblNori.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNori.setBounds(105, 319, 72, 18);
		add(lblNori);
		
		JLabel lblChashu = new JLabel("Chashu");
		lblChashu.setFont(new Font("Arial", Font.PLAIN, 18));
		lblChashu.setBounds(259, 312, 72, 18);
		add(lblChashu);
		
		JLabel lblBoiledEgg = new JLabel("Boiled Egg");
		lblBoiledEgg.setFont(new Font("Arial", Font.PLAIN, 18));
		lblBoiledEgg.setBounds(431, 308, 113, 26);
		add(lblBoiledEgg);
		
		JLabel lblBanbooShoots = new JLabel("Banboo Shoots");
		lblBanbooShoots.setFont(new Font("Arial", Font.PLAIN, 18));
		lblBanbooShoots.setBounds(569, 310, 155, 22);
		add(lblBanbooShoots);
		
		textField_9 = new JTextField();
		textField_9.setText("1");
		textField_9.setBounds(98, 343, 63, 24);
		add(textField_9);
		textField_9.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setText("2");
		textField_11.setBounds(245, 343, 63, 24);
		add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(245, 380, 63, 24);
		add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setText("1");
		textField_13.setBounds(441, 347, 63, 24);
		add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(441, 380, 63, 24);
		add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setText("1");
		textField_15.setBounds(596, 345, 63, 24);
		add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(596, 380, 63, 24);
		add(textField_16);
		textField_16.setColumns(10);
		
		JLabel label = new JLabel("\u00A3");
		label.setFont(new Font("Arial", Font.PLAIN, 19));
		label.setBounds(334, 349, 72, 18);
		add(label);
		
		JLabel lblNewLabel = new JLabel("\u00A3");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 19));
		lblNewLabel.setBounds(174, 346, 72, 18);
		add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u00A3");
		label_1.setFont(new Font("Arial", Font.PLAIN, 19));
		label_1.setBounds(530, 348, 72, 18);
		add(label_1);
		
		JLabel label_2 = new JLabel("\u00A3");
		label_2.setFont(new Font("Arial", Font.PLAIN, 19));
		label_2.setBounds(663, 348, 72, 18);
		add(label_2);
		
		JLabel label_3 = new JLabel("\u00A3");
		label_3.setFont(new Font("Arial", Font.PLAIN, 20));
		label_3.setBounds(259, 92, 72, 18);
		add(label_3);
		//button
		btnEdit = new JButton("Edit");
		btnEdit.setFont(new Font("Arial", Font.PLAIN, 20));
		btnEdit.setBounds(342, 423, 113, 32);
		add(btnEdit);
		
		btnReturn = new JButton("Return to previous");
		btnReturn.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnReturn.setBounds(14, 13, 176, 26);
		add(btnReturn);
		

		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(98, 380, 74, 26);
		add(spinner);
		
		btnReturnini = new JButton("Return to initial");
		btnReturnini.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnReturnini.setBounds(14, 41, 176, 27);
		add(btnReturnini);
		
		JLabel lblNewLabel_1 = new JLabel("\u2014 Modify Menu \u2014");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel_1.setBounds(302, 41, 268, 44);
		add(lblNewLabel_1);
	}

}
