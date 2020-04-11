import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;

public class Start_Window extends JFrame implements ActionListener{

	private JPanel contentPane;
	private CardLayout cl;
	
	private Pro_File pro_file=new Pro_File();
	private Order order;
	private Member member;
	
	
	private Welcome_Interface panel1;
    private Menu_Interface panelM1;
    private Membership panelM2;
    private MemberCentre panelM3;
    private Register panelR1;
    private Tips_Register panelR2;
    private Login panelL1;
    private Tips_Login panelL2;
    private ALogin_Interface panelA1;
    private AdminSystem_Interface panelA2;
	private AModify_Interface panelA3;
	private AOTimes_Interface panelA4;
    //private AdminST_Interface panel8;
	private AdminET_Interface panelA5;
	//payment
	private PayT1_Interface panelP1;//9
	private PayT2_Interface panelP2;
	private PayT3_Interface panelP3;
	
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start_Window frame = new Start_Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Start_Window() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 800, 500);
		
		this.contentPane = new JPanel();
		this.cl = new CardLayout(0, 0);
		this.panel1=new Welcome_Interface();
		this.panelM1=new Menu_Interface();  
		this.panelM2=new Membership();
		this.panelR1=new Register();
		this.panelM3=new MemberCentre();
		this.panelR2=new Tips_Register();
		this.panelL1=new Login();
		this.panelL2=new Tips_Login();
		// Admin 
		this.panelA1=new ALogin_Interface();	
		this.panelA2=new AdminSystem_Interface();
		this.panelA3=new AModify_Interface();
		this.panelA4=new AOTimes_Interface();
		this.panelA5=new AdminET_Interface();
		//this.panel8=new AdminST_Interface();
		this.panelP1=new PayT1_Interface();
		this.panelP2=new PayT2_Interface();
		this.panelP3=new PayT3_Interface();
		

		this.panel1.btnStartToOrder.addActionListener(this);
		this.panel1.btnAdministration.addActionListener(this);
		this.panel1.btnNewButton.addActionListener(this);//membership login
		
		this.panelM1.btnFinishOrder.addActionListener(this); //Menu to Membership
		this.panelM1.btnPrevious.addActionListener(this); //Menu back to Previous
		this.panelM2.btnPrevious.addActionListener(this); //Membership back to Previous
		this.panelM2.btnInitial.addActionListener(this);//Membership back to Initial
		this.panelM2.btnYes.addActionListener(this); //Login Membership
		this.panelM2.btnNo.addActionListener(this); //Skip authentication
		this.panelM2.btnRegister.addActionListener(this); //Membership to Register
		this.panelR1.btnPrevious.addActionListener(this); //Register back to Previous
		this.panelR1.btnInitial.addActionListener(this);//Register back to Initial
		this.panelR1.btnDone.addActionListener(this);//Finish Register,jump to tips 
		this.panelM3.btnPrevious.addActionListener(this); //Membership back to Previous
		this.panelM3.btnInitial.addActionListener(this);//Membership back to Initial
		this.panelR2.btnMemberCentre.addActionListener(this); //Register to MembershipCentre
		this.panelL1.btnPrevious.addActionListener(this); //Login back to Previous
		this.panelL1.btnInitial.addActionListener(this); //Login back to Previous
		this.panelL1.btnDone.addActionListener(this);
		this.panelL2.btnMemberCentre.addActionListener(this); //Login to MembershipCentre
		this.panelL2.btnOK.addActionListener(this);
		
			//--------admin
		this.panelA1.btnLogin.addActionListener(this);//Admin Log-in
		this.panelA1.btnReturnini.addActionListener(this);//return initial
		this.panelA2.btnNewButton.addActionListener(this);//modify
		this.panelA2.btnViewStats.addActionListener(this);//view stats
		this.panelA2.btnReturnini.addActionListener(this);
		this.panelA2.btnReturnpre.addActionListener(this);
		
				//modify
		this.panelA3.btnEdit.addActionListener(this);
		this.panelA3.btnReturn.addActionListener(this);
		this.panelA3.btnReturnini.addActionListener(this);
					//double check
		this.panelA5.btnYes.addActionListener(this);
		this.panelA5.btnBack.addActionListener(this);
				//Viewstat
		this.panelA4.btnBack.addActionListener(this);
		this.panelA4.btnYes.addActionListener(this);
		this.panelA4.btnReturnini.addActionListener(this);
		
		
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		this.contentPane.setLayout(this.cl);
			
		this.contentPane.add(this.panel1,"start");
		this.contentPane.add(this.panelM1,"m1");
		this.contentPane.add(this.panelM2,"m2");
		this.contentPane.add(this.panelM3,"m3");
		this.contentPane.add(this.panelR1,"r1");
		this.contentPane.add(this.panelR2,"r2");
		this.contentPane.add(this.panelL1,"l1");
		this.contentPane.add(this.panelL2,"l2");
		

			//admin panel-----------------
		this.contentPane.add(this.panelA1,"a1");
		this.contentPane.add(this.panelA2,"a2");
		this.contentPane.add(this.panelA3,"a3");
		this.contentPane.add(this.panelA4,"a4");
		this.contentPane.add(this.panelA5,"a5");
		
	//	this.contentPane.add(this.panel8);
		
			//payment panel----------------
		this.contentPane.add(this.panelP1,"p1");
		this.contentPane.add(this.panelP2,"p2");
		this.contentPane.add(this.panelP3,"p3");
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton eventSource = (JButton) e.getSource();
		if(eventSource.equals(this.panel1.btnStartToOrder)) {
			Data.setAll();//将数据库中的菜品信息读入data中
			this.cl.show(this.contentPane,"m1");
		}else if(eventSource.equals(this.panel1.btnNewButton)) {
			this.cl.show(this.contentPane,"l1");
		}else if(eventSource.equals(this.panelM1.btnFinishOrder)) {
			this.panelM1.read_selection();//将用户选择结果存入data中
			this.panelM1.setTotalprice(Data.getTotalPrice());
			this.order=new Order();
			this.order.creatOrder();//生成订单
			String[] orderList = this.order.getOrderList();	
			System.out.println(this.order);//打印订单
			this.cl.show(this.contentPane,"m2");
		}else if(eventSource.equals(this.panelM1.btnPrevious)) {
			this.cl.previous(this.contentPane);
		}else if(eventSource.equals(this.panelM2.btnPrevious)) {
			this.cl.previous(this.contentPane);
		}else if(eventSource.equals(this.panelM2.btnInitial)) {
			this.cl.show(this.contentPane,"start");
		}else if(eventSource.equals(this.panelM2.btnYes)) {
			String str[]=this.panelM2.read_login_information();	
			if(this.pro_file.menber_validation(str[0], str[1])) {
				String[] orderList = this.order.getOrderList();	
				this.pro_file.write_order(orderList, Data.getUsername());
				this.cl.show(this.contentPane,"l2");
			}else {
				
				
				//用户登录失败时，加上一个提示信息
			}
			 
		}else if(eventSource.equals(this.panelM2.btnNo)) {
			this.cl.show(this.contentPane,"p1");
		}else if(eventSource.equals(this.panelM2.btnRegister)) {
			this.cl.show(this.contentPane,"r1");
		}else if(eventSource.equals(this.panelR1.btnPrevious)) {
			this.cl.previous(this.contentPane);
		}else if(eventSource.equals(this.panelR1.btnInitial)) {
			this.cl.show(this.contentPane,"start");
		}else if(eventSource.equals(this.panelR1.btnDone)) {
			String[] str=this.panelR1.read_register_information();
			if(this.pro_file.write_menber(str)) {
				this.cl.show(this.contentPane,"r2");
			}
			
			
		}else if(eventSource.equals(this.panelM3.btnPrevious)) {
			this.cl.previous(this.contentPane);
		}else if(eventSource.equals(this.panelM3.btnInitial)) {
			this.cl.show(this.contentPane,"start");
		}else if(eventSource.equals(this.panelR2.btnMemberCentre)) {
			this.cl.show(this.contentPane,"m3");
		}else if(eventSource.equals(this.panelL1.btnDone)) {
			String str[]=this.panelL1.read_login_information();	
			if(this.pro_file.menber_validation(str[0], str[1])) {
				this.member=new Member();
				this.cl.show(this.contentPane,"l2");
			}else {
				
				
				//用户登录失败时，加上一个提示信息
			}
		}else if(eventSource.equals(this.panelL1.btnPrevious)) {
			this.cl.previous(this.contentPane);
		}else if(eventSource.equals(this.panelL1.btnInitial)) {
			this.cl.show(this.contentPane,"start");
		}else if(eventSource.equals(this.panelL2.btnMemberCentre)) {
			this.cl.show(this.contentPane,"m3");
		}else if(eventSource.equals(this.panelL2.btnOK)) {
			this.cl.show(this.contentPane,"p1");
//		}else if(eventSource.equals(this.panel2.btnNewButton)) {//membership log-in
//			this.cl.previous(this.contentPane);
			
		}else if(eventSource.equals(this.panel1.btnAdministration)){//administration log-in
			this.cl.show(this.contentPane,"a1");
			
		}else if(eventSource.equals(this.panelA1.btnReturnini)){//welcome page
			this.cl.show(this.contentPane,"start");
			
		}else if(eventSource.equals(this.panelA1.btnLogin)){//admin page
			this.cl.show(this.contentPane,"a2");
			
		}else if(eventSource.equals(this.panelA2.btnNewButton)){//modify menu
			this.cl.show(this.contentPane,"a3");
			
		}else if(eventSource.equals(this.panelA2.btnViewStats)){//view stats
			this.cl.show(this.contentPane,"a4");
			
		}else if(eventSource.equals(this.panelA2.btnReturnini)){//welcome page
			this.cl.show(this.contentPane,"start");
			
		}else if(eventSource.equals(this.panelA2.btnReturnpre)){//previous-login
			this.cl.show(this.contentPane,"a1");
			
		}else if(eventSource.equals(this.panelA3.btnEdit)){//double check modify menu----update data
			this.cl.show(this.contentPane,"a5");
			
		}else if(eventSource.equals(this.panelA3.btnReturnini)){//welcome page
			this.cl.show(this.contentPane,"start");
			
		}else if(eventSource.equals(this.panelA5.btnYes)){//modify menu----update data
			this.cl.show(this.contentPane,"a3");
			
		}else if(eventSource.equals(this.panelA5.btnBack)){//double check modify menu----back to modify page
			this.cl.show(this.contentPane,"a3");
			
		}else if(eventSource.equals(this.panelA3.btnReturn)){//modify menu----back to admin page
			this.cl.previous(this.contentPane);
		
		}else if(eventSource.equals(this.panelA4.btnBack)){//view stats----back to admin page
			this.cl.show(this.contentPane,"a2");
			
		}else if(eventSource.equals(this.panelA4.btnYes)){//view stats----back to admin page
			//this.cl.previous(this.contentPane);
			//执行选定的操作
			
		}else if(eventSource.equals(this.panelA4.btnReturnini)){//view stats----back to welcome page
			this.cl.show(this.contentPane,"start");
			
		}
		
	}

}
