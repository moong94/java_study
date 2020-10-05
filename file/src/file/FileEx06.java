package file;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileEx06 {

	public static void main(String[] args) {
		
		// # 파일 컨트롤러[1단계] : 벡터

		Scanner scan = new Scanner(System.in);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		int[] vector = null;
		int count = 0;
		
		String fileName = "vector.txt";
		
		while(true) {
			
			System.out.println("[벡터 컨트롤러]");
			System.out.println("[1]추가하기");
			System.out.println("[2]삭제하기");
			System.out.println("[3]저장하기");
			System.out.println("[4]로드하기");
			System.out.println("[5]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//추가
			if(sel == 1) {
				if(count == 0) {
					vector = new int[count + 1];
				}
				else if(count > 0) {
					int[] tmp = vector;
					vector = new int[count + 1];
					
					for(int i = 0; i < count; i++) {
						vector[i] = tmp[i];
					}
					tmp = null;
				}
				System.out.print("데이터 입력 : ");
				int input = scan.nextInt();
				
				vector[count] = input;
				count++;
				
				for(int i = 0; i < vector.length; i++) {
					System.out.print(vector[i] + " ");
						
				}
				
			}
			
			//삭제
			else if(sel == 2) {
				
				int opt = -1;
				
				if(count == 0) {
					System.out.println("삭제할 데이터가 없습니다.");
					continue;
				}
				else {
					System.out.print("삭제할 데이터 입력 : ");
					int delnum = scan.nextInt();
					
					for(int i = 0; i < count; i++) {
						if(vector[i] == delnum) {
							opt = i;
						}
					}
					if(opt == -1) {
						System.out.println("입력한 데이터는 없는 데이터 입니다.");
						continue;
					}
					else if(opt == 0 && count == 1) {
						vector = null;
						count--;
						continue;
					}
					else {
						int tmp2[] = vector;
						vector = new int[count - 1];
						for(int i = 0; i < opt; i++) {
							vector[i] = tmp2[i];
						}
						for(int i = opt; i < count - 1; i++) {
							vector[i] = tmp2[i + 1];
						}
						count--;
					}
					
				}
				for(int i = 0; i < vector.length; i++) {
					System.out.print(vector[i] + " ");
				}
			}
			
			//저장
			else if(sel == 3) {
				FileWriter fw = null;
				
				String data = "";
				
				if(count == 0) {
					System.out.println("저장할 데이터가 없습니다.");
					continue;
				}
				
				for(int i = 0; i < count; i++) {
					data += vector[i] + " ";
				}
				data = data.substring(0, data.length() - 1);
				
				try {
					fw = new FileWriter(fileName);
					
					fw.write(data);
					fw.close();
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			//로드
			else if(sel == 4) {}
			
			//종료
			else if(sel == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}

	}

}
