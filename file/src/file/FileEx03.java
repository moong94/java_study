package file;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx03 {

	public static void main(String[] args) {
		// ��ö��/20,�̸���/30,�̿���/40
		
		String[] names = {"��ö��", "�̸���", "�̿���"};
		int[]     ages = {	   20,     30,     40};
				
		String fileName = "fileTest01.txt";
				
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileName);
			for(int i = 0; i < names.length; i++) {
				fw.write(names[i] + "/" + ages[i]);
				if(i != names.length - 1) {
					fw.write(",");
				}
			}
			fw.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
