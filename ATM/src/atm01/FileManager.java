package atm01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.print.attribute.SetOfIntegerSyntax;

public class FileManager {
	
	static FileManager instance = new FileManager();
	
	String fileName = "ATM.txt";
	String data = "";
	
	void setData() {
		data = "";
		int count = UserManager.instance.userCnt;
		data += count;
		data += "\n";
		
		for(int i=0; i<count; i++) {
			data += UserManager.instance.user[i].id;
			data += "\n";
			data += UserManager.instance.user[i].pw;
			data += "\n";
			data += UserManager.instance.user[i].accCnt;
			data += "\n";
			
			if(UserManager.instance.user[i].accCnt == 0) {
				data += "0\n";
			}else {
				for(int j=0; j<UserManager.instance.user[i].accCnt; j++) {
					data += UserManager.instance.user[i].acc[j].number;
					data += "/";
					data += UserManager.instance.user[i].acc[j].money;
					if(j != UserManager.instance.user[i].accCnt-1) {
						data += ",";
					}
				}
				data += "\n";
			}
			
		}
	}
	
	void save() {
		setData();
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fw != null) {try {fw.close();} catch (IOException e) {}}
		}
	}
	
	void load() {
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			if(file.exists()) {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while(true) {
					String line = br.readLine();
					if(line == null) {
						break;
					}
					data += line;
					data += "\n";
				}
				
				String[] tmp = data.split("\n");
				UserManager.instance.userCnt = Integer.parseInt(tmp[0]);
				UserManager.instance.user = new User[UserManager.instance.userCnt];
				for(int i=0; i<UserManager.instance.userCnt; i++) {
					UserManager.instance.user[i] = new User();
				}
				
				int j = 0;
				for(int i=1; i<tmp.length; i+=4) {
					String id = tmp[i];
					String pw = tmp[i+1];
					int accCnt = Integer.parseInt(tmp[i+2]);
					UserManager.instance.user[j].id = id;
					UserManager.instance.user[j].pw = pw;
					UserManager.instance.user[j].accCnt = accCnt;
					String accInfo = tmp[i+3];
					if(accCnt == 1) {
						String[] temp = accInfo.split("/");
						int acc = Integer.parseInt(temp[0]);
						int money = Integer.parseInt(temp[1]);
						UserManager.instance.user[j].acc[0] = new Account();
						UserManager.instance.user[j].acc[0].number = acc;
						UserManager.instance.user[j].acc[0].money = money;
					}
					if(accCnt > 1){
						String[] temp = accInfo.split(",");
						for(int k=0; k<temp.length; k++) {
							String[] parse = temp[k].split("/");
							int acc = Integer.parseInt(parse[0]);
							int money = Integer.parseInt(parse[1]);
							UserManager.instance.user[j].acc[k] = new Account();
							UserManager.instance.user[j].acc[k].number = acc;
							UserManager.instance.user[j].acc[k].money = money;
						}
					}
					j += 1;
				}
			}else {
				UserManager.instance.setDummy();
				setData();
				save();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {try {fr.close();} catch (IOException e) {}}
			if(br != null) {try {br.close();} catch (IOException e) {}}
		}
	}
}





