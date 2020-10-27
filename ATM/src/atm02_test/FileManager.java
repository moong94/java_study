package atm02_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class FileManager {
	static FileManager instance = new FileManager();
	
	String fileName = "atmData.txt";
	
	boolean loadData() {
		boolean rs = false;
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		if(file.exists()) {
			rs = true;
			
			UserManager.instance.userList = null;
			
			try {
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				
				String strCnt = br.readLine();
				int count = Integer.parseInt(strCnt);
				
				UserManager.instance.userList = new User[count];
				UserManager.instance.userCount = 0;
				
				while(true) {
					String line = br.readLine();
					if(line == null) {
						break;
					}
					
					String[] info = line.split("/");
					int size = info.length;
					
					User user = null;
					if(size == 3) {
						user = new User(info[0], info[1], null, 0);
					}
					else {
						String id = info[0];
						String password = info[1];
						int accCount = Integer.parseInt(info[2]);
						Account[] accList = new Account[accCount];
						int j = 3;
						for(int i = 0; i < accCount; i++) {
							accList[i] = new Account();
							accList[i].number = info[j];
							accList[i].money = Integer.parseInt(info[j + 1]);
							j += 2;
						}
						user = new User(id, password, accList, accCount);
					}
					UserManager.instance.userList[UserManager.instance.userCount] = user;
					
					UserManager.instance.userCount = UserManager.instance.userCount + 1;
							
				}
				System.out.println("[메세지]파일을 로드하였습니다.");
			}
			catch(Exception e){
				e.printStackTrace();
			}
			finally {
				if(fr != null) {
					try {
						fr.close();
					}
					catch(IOException e){
					}
				}
				if(br != null) {
					try {
						br.close();
					}
					catch(IOException e) {
					}
				}
			}
		}
		return rs;
	}
	
	void saveData() {
		UserManager userManager = UserManager.instance;
		
		if(userManager.userCount == 0) {
			return;
		}
		
		String data = "";
		data += userManager.userCount;
		data += "\n";
		
		for(int i = 0; i < userManager.userCount; i++) {
			User user = userManager.userList[i];
			
			data += user.id;
			data += "/";
			data += user.password;
			data += "/";
			data += user.accCount;
			if(user.accCount > 0) {
				data += "/";
				
				for(int j = 0; j < user.accCount; j++) {
					Account acc = user.accList[j];
					
					data += acc.number;
					data += "/";
					data += acc.money;
					
					if(j != user.accCount - 1) {
						data += "/";
					}
				}
			}
			
			if(i != userManager.userCount - 1) {
				data += "\n";
			}
		}
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
			System.out.println("[메세지]파일을 저장하였습니다.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(fw != null) {
				try {
					fw.close();
				}
				catch(IOException e) {
					
				}
			}
		}
		
	}
	

}
