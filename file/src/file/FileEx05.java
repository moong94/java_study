package file;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class FileEx05 {

	public static void main(String[] args) {

		//# 파일 로드하기 : 연습문제

		String[] ids = null;
		String[] pws = null;
		int[] moneys = null;
		
		String fileName = "fileTest02.txt";
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		int size = 0;
		String data = "";
		
		if(file.exists()) {
			try {
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
				
				data = data.substring(0, data.length()-1);
				
				String[] temp = data.split("\n");
				size = temp.length;
				
				ids = new String[size];
				pws = new String[size];
				moneys = new int[size];
				
				for(int i=0; i<size; i++) {
					String[] info = temp[i].split("/");
					ids[i] = info[0];
					pws[i] = info[1];
					moneys[i] = Integer.parseInt(info[2]);
				}
				
				for(int i=0; i<size; i++) {
					System.out.println(ids[i] + ":" + pws[i] + ":" + moneys[i]);
				}

				fr.close();
				br.close();
			}
			catch(Exception e) {
				e.printStackTrace();
				
			}
		}
	}

}
