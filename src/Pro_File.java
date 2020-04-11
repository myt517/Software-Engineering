import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pro_File {
	
	/**
	 * ����д���ļ�����
	 */
	
	public void write_order(String[] orderList,String userID) {
		
		if(userID!="") {
			String fileName = userID+new SimpleDateFormat("yyyyMMdd").format(new Date())+".txt";//����order�ļ�����ʽ
			
			File file = null;
			FileWriter fw = null;
			
			try {
				file = new File("./Order/Member/"+fileName);
				
				if (!file.exists()) {
					file.createNewFile();

				}
				fw = new FileWriter(file,true);
				
				for (int i = 0; i < orderList.length; i++) {
					fw.write(orderList[i]+"\r\n");
				}
				fw.write("\r\n");
				fw.flush();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
            String fileName = userID+new SimpleDateFormat("yyyyMMdd").format(new Date())+".txt";//����order�ļ�����ʽ
			
			File file = null;
			FileWriter fw = null;
			
			try {
				file = new File("./Order/Ordinary/"+fileName);
				
				if (!file.exists()) {
					file.createNewFile();

				}
				fw = new FileWriter(file,true);
				
				for (int i = 0; i < orderList.length; i++) {
					fw.write(orderList[i]+"\r\n");
				}
				fw.write("\r\n");
				fw.flush();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}
	
	/**
	 * ��ȡ��Ա���ݿ���Ϣ����֤��Ա����
	 */
	public boolean menber_validation(String account, String password) {
		boolean status=false;
		try{
            BufferedReader br = new BufferedReader(new FileReader("./Menber/menber.txt"));
            String line=null;
            while((line=br.readLine())!=null) {
	            String [] arr2 = line.split(" ");	            
	            if(arr2[0].equals(account)&&arr2[1].equals(password)) {
	            	Data.setMenbership(arr2);
	            	status=true;
	            	break;
	            }
            }
            br.close();//�ر��ļ�
        }catch(FileNotFoundException e){

        }catch(IOException e){

        }
		
		return status;
	}
	
	/**
	 * ��Ա��Ϣд���ļ�����
	 */
	public boolean write_menber(String[] str) {
		boolean status=false;
		try {
			File file = new File("./Menber/menber.txt");
			
			if (!file.exists()) {
				file.createNewFile();

			}
			
			if(!this.menber_validation(str[0], str[1])) {		
			    status=true;
				FileWriter fw = new FileWriter(file,true);
			    for (int i = 0; i < str.length; i++) {
				    fw.write(str[i]+" ");
			    }
			    fw.write("\r\n");
			    fw.flush();
			    fw.close();
		    }else {
		    	status=false;
		    }
		}
			catch (IOException e) {
			    e.printStackTrace();
		    }
	    return status;    
	
	}

}

