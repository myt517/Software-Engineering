import java.util.*;
public class Member {

	private String account;
	private String password;
	private String phone;
	private int stamp;

	public String getAccount(){
		return account;
	}

	public void setAccount(String account){
	 	this.account=account;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
	 	this.password=password;
	}

	public String getPhone(){
		return phone;
	}

	 public void setPhone(String phone){
	 	this.phone=phone;
	 }

	 public int getStamp(){
		return stamp;
	}

	 public void setStamp(int stamp){
	 	this.stamp=stamp;
	 }

	public void Members() {

		Scanner in =new Scanner(System.in);
		System.out.println("----Member Centre----");
		System.out.println("Your present number of stamps is "+stamp);
		System.out.println("10 stamps = a free meal");

	}

	public void creatMember() {

		Scanner in =new Scanner(System.in);

		System.out.println("----Register----");
		System.out.println("Please input your E-mail/Tel:");
		int phone=in.nextInt();
		System.out.println("Please input your Password:");
		int password=in.nextInt();

		System.out.println("Successfully Register!");
		System.out.println("Your Membership number is : "+account);
		
	}

	public void login(String account,String password) {

		//设置登录验证函数
		this.setAccount(account);
		this.setPassword(password);
		
		}
	


}

