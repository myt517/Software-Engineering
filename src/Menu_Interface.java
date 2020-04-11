import javax.swing.JPanel;
import java.awt.event.ItemListener ;
import java.awt.event.ItemEvent  ;
import java.util.*;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class Menu_Interface extends JPanel implements ItemListener{
	JButton btnPrevious;
	JButton btnFinishOrder;
	JLabel lblNewLabel_1;
	private JLabel lblTotalPrice;
	private JLabel lblTotalPrice_1;
	private ArrayList<JRadioButton> spiciness_options=new ArrayList<JRadioButton>();
	private ArrayList<JCheckBox> addon_options=new ArrayList<JCheckBox>();
	private ArrayList<JCheckBox> add_choice=new ArrayList<JCheckBox>();
	private ArrayList<JRadioButton> Soup=new ArrayList<JRadioButton>();
	private ArrayList<JRadioButton> Noodles=new ArrayList<JRadioButton>();
	private ArrayList<JRadioButton> Spring_onion=new ArrayList<JRadioButton>();
	/**
	 * Create the panel.
	 */
	public Menu_Interface() {
		setLayout(null);
		
		btnPrevious = new JButton("Return to previous");
		btnPrevious.setBounds(0, 0, 192, 31);
		btnPrevious.setFont(new Font("Arial", Font.PLAIN, 20));
		add(btnPrevious);
		
		JLabel lblNewLabel = new JLabel("Personalize your dish");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel.setBounds(155, 27, 294, 50);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("fixed price: 9.9 ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(18, 65, 177, 21);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Soup:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(18, 99, 81, 21);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Noodles:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(18, 135, 81, 21);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Spring onion:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(18, 171, 119, 21);
		add(lblNewLabel_4);
		
		JLabel lblSpic = new JLabel("Spiciness:");
		lblSpic.setForeground(Color.RED);
		lblSpic.setFont(new Font("Arial", Font.PLAIN, 18));
		lblSpic.setBounds(19, 238, 130, 21);
		add(lblSpic);
		
		JLabel lblNewLabel_5 = new JLabel("Add-ons:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(18, 274, 86, 21);
		add(lblNewLabel_5);
		
		lblTotalPrice = new JLabel("Total price:");
		lblTotalPrice.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTotalPrice.setBounds(18, 335, 96, 31);
		add(lblTotalPrice);
		
		JRadioButton chckbxNewCheckBox = new JRadioButton("Tonkotsu");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(134, 95, 149, 29);
		add(chckbxNewCheckBox);
		
		JRadioButton chckbxNewCheckBox_1 = new JRadioButton("Soft");
		chckbxNewCheckBox_1.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox_1.setBounds(134, 131, 149, 29);
		add(chckbxNewCheckBox_1);
		
		JRadioButton chckbxNewCheckBox_2 = new JRadioButton("No please");
		chckbxNewCheckBox_2.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox_2.setBounds(134, 167, 149, 29);
		add(chckbxNewCheckBox_2);
		
		JRadioButton chckbxShoyu = new JRadioButton("Shoyu");
		chckbxShoyu.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxShoyu.setBounds(293, 95, 149, 29);
		add(chckbxShoyu);
		
		JRadioButton chckbxNewCheckBox_3 = new JRadioButton("Medium");
		chckbxNewCheckBox_3.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox_3.setBounds(293, 131, 149, 29);
		add(chckbxNewCheckBox_3);
		
		JRadioButton chckbxJustALittle = new JRadioButton("Just a little");
		chckbxJustALittle.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxJustALittle.setBounds(293, 167, 149, 29);
		add(chckbxJustALittle);
		
		JRadioButton chckbxNewCheckBox_4 = new JRadioButton("Shio");
		chckbxNewCheckBox_4.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox_4.setBounds(440, 95, 149, 29);
		add(chckbxNewCheckBox_4);
		
		JRadioButton chckbxFirm = new JRadioButton("Firm");
		chckbxFirm.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxFirm.setBounds(440, 131, 149, 29);
		add(chckbxFirm);
		
		JRadioButton chckbxNewCheckBox_5 = new JRadioButton("A lot!");
		chckbxNewCheckBox_5.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox_5.setBounds(440, 167, 149, 29);
		add(chckbxNewCheckBox_5);
		
		this.Soup.add(chckbxNewCheckBox);
		this.Soup.add(chckbxShoyu);
		this.Soup.add(chckbxNewCheckBox_4);
		this.Noodles.add(chckbxNewCheckBox_1);
		this.Noodles.add(chckbxNewCheckBox_3);
		this.Noodles.add(chckbxFirm);
		this.Spring_onion.add(chckbxNewCheckBox_2);
		this.Spring_onion.add(chckbxJustALittle);
		this.Spring_onion.add(chckbxNewCheckBox_5);

		JCheckBox rdbtnNewRadioButton = new JCheckBox("Nori");
		rdbtnNewRadioButton.setFont(new Font("Arial", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBounds(115, 203, 130, 29);
		add(rdbtnNewRadioButton);
		
		JCheckBox rdbtnChashu = new JCheckBox("Chashu");
		rdbtnChashu.setFont(new Font("Arial", Font.PLAIN, 18));
		rdbtnChashu.setBounds(275, 203, 149, 29);
		add(rdbtnChashu);
		
		JCheckBox rdbtnBoiledEgg = new JCheckBox("Boiled egg");
		rdbtnBoiledEgg.setFont(new Font("Arial", Font.PLAIN, 18));
		rdbtnBoiledEgg.setBounds(431, 203, 177, 29);
		add(rdbtnBoiledEgg);
		
		this.add_choice.add(rdbtnNewRadioButton);
		this.add_choice.add(rdbtnChashu);
		this.add_choice.add(rdbtnBoiledEgg);
		
		JRadioButton chckbxNewCheckBox_6 = new JRadioButton("0(No)");
		chckbxNewCheckBox_6.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox_6.setBounds(115, 234, 81, 29);
		add(chckbxNewCheckBox_6);
		
		JRadioButton checkBox = new JRadioButton("1");
		checkBox.setFont(new Font("Arial", Font.PLAIN, 18));
		checkBox.setBounds(197, 234, 55, 29);
		add(checkBox);
		
		JRadioButton radioButton = new JRadioButton("2");
		radioButton.setFont(new Font("Arial", Font.PLAIN, 18));
		radioButton.setBounds(259, 234, 62, 29);
		add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("3");
		radioButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		radioButton_1.setBounds(325, 234, 55, 29);
		add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("4");
		radioButton_2.setFont(new Font("Arial", Font.PLAIN, 18));
		radioButton_2.setBounds(387, 234, 62, 29);
		add(radioButton_2);
		
		JRadioButton rdbtnmax = new JRadioButton("5(Max)");
		rdbtnmax.setFont(new Font("Arial", Font.PLAIN, 18));
		rdbtnmax.setBounds(454, 234, 177, 29);
		add(rdbtnmax);
		
		this.spiciness_options.add(chckbxNewCheckBox_6);
		this.spiciness_options.add(checkBox);
		this.spiciness_options.add(radioButton);
		this.spiciness_options.add(radioButton_1);
		this.spiciness_options.add(radioButton_2);
		this.spiciness_options.add(rdbtnmax);
		
		JCheckBox chckbxExtraNori = new JCheckBox("Extra Nori: 1 ");
		chckbxExtraNori.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxExtraNori.setBounds(11, 295, 138, 29);
		add(chckbxExtraNori);
		
		JCheckBox chckbxExtraBoiledEgg = new JCheckBox("Extra Boiled egg: 1");
		chckbxExtraBoiledEgg.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxExtraBoiledEgg.setBounds(155, 295, 182, 29);
		add(chckbxExtraBoiledEgg);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Bamboo shoots: 1");
		chckbxNewCheckBox_7.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox_7.setBounds(339, 295, 177, 29);
		add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxExtraChashu = new JCheckBox("Extra Chashu: 2");
		chckbxExtraChashu.setFont(new Font("Dialog", Font.PLAIN, 18));
		chckbxExtraChashu.setBounds(518, 295, 160, 29);
		add(chckbxExtraChashu);
		
		this.addon_options.add(chckbxExtraNori);
		this.addon_options.add(chckbxExtraBoiledEgg);
		this.addon_options.add(chckbxNewCheckBox_7);
		this.addon_options.add(chckbxExtraChashu);
		
		btnFinishOrder = new JButton("Finish my order");
		btnFinishOrder.setFont(new Font("Arial", Font.PLAIN, 20));
		btnFinishOrder.setBounds(198, 356, 182, 29);
		add(btnFinishOrder);
		
		lblTotalPrice_1 = new JLabel("");
		lblTotalPrice_1.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTotalPrice_1.setBounds(115, 335, 81, 31);
		add(lblTotalPrice_1);
		
		for(int i=0;i<3;i++) {
			JRadioButton temp_radioButton0=this.Soup.get(i);
			temp_radioButton0.addItemListener(this);
		}
		for(int i=0;i<3;i++) {
			JRadioButton temp_radioButton1=this.Noodles.get(i);
			temp_radioButton1.addItemListener(this);
		}
		for(int i=0;i<3;i++) {
			JRadioButton temp_radioButton2=this.Spring_onion.get(i);
			temp_radioButton2.addItemListener(this);
		}
		for(int i=0;i<3;i++) {
			JCheckBox temp_checkBox0=this.add_choice.get(i);
			temp_checkBox0.addItemListener(this);
		}
		for(int i=0;i<6;i++) {
			JRadioButton temp_radioButton=this.spiciness_options.get(i);
			temp_radioButton.addItemListener(this);
		}
		for(int i=0;i<4;i++) {
			JCheckBox temp_checkBox=this.addon_options.get(i);
			temp_checkBox.addItemListener(this);
		}
		
		

	}
	
	 public void itemStateChanged(ItemEvent e){      
	    this.read_selection();	
	    this.setTotalprice(Data.getTotalPrice());
	}
	
	public void setTotalprice(double total_price) {
		this.lblTotalPrice_1.setText(String.valueOf(total_price));
	}
	
	public void read_selection() {

		//读取Soup
		for(int i=0;i<3;i++) {
			JRadioButton temp_radioButton0=this.Soup.get(i);
			if(temp_radioButton0.isSelected()) {
				Data.setDishChoice(0, i+1);
				break;
			}
		}
		
		//读取Noodle
		for(int i=0;i<3;i++) {
			JRadioButton temp_radioButton1=this.Noodles.get(i);
			if(temp_radioButton1.isSelected()) {
				Data.setDishChoice(1, i+1);
				break;
			}
		}
		
		//读取Spring onions
		for(int i=0;i<3;i++) {
			JRadioButton temp_radioButton2=this.Spring_onion.get(i);
			if(temp_radioButton2.isSelected()) {
				Data.setDishChoice(2, i+1);
				break;
			}
		}
		
		//读取add_choice
		for(int i=0;i<3;i++) {
			JCheckBox temp_checkBox0=this.add_choice.get(i);
			if(temp_checkBox0.isSelected()) {
				Data.setBasicAddsChoice(i, true);
			}
		}
			
				
		//读取spiciness
		for(int i=0;i<6;i++) {
			JRadioButton temp_radioButton=this.spiciness_options.get(i);
			if(temp_radioButton.isSelected()) {
				Data.setSpiciness(i);
				break;
			}
		}
		
		//读取add_ons
		for(int i=0;i<4;i++) {
			JCheckBox temp_checkBox=this.addon_options.get(i);
			if(temp_checkBox.isSelected()) {
				Data.setAddonsnum(i, 1);
			}
		}
		
	}
}
