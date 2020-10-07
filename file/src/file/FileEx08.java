package file;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class FileEx08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = { "qwer", "javaking", "abcd" };
		String[] pws = { "1111", "2222", "3333" };
		String[] items = { "사과", "바나나", "딸기" };

		final int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];

		String fileName = "jang.txt";

		int count = 0;
		int log = -1;

		while (true) {

			System.out.println("[MEGA SHOP]");
			System.out.println("[1]로그인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼핑");
			System.out.println("[4]장바구니");
			System.out.println("[5]저장");
			System.out.println("[6]로드");
			System.out.println("[0]종료");

			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();

			//로그인
			if (sel == 1) {
				
				int opt = -1;
				
				if(log != -1) {
					System.out.println("로그아웃 후 사용하세요.");
					continue;
				}
				
				System.out.print("로그인 아이디 입력 : ");
				String logid = scan.next();
				
				for(int i = 0; i < ids.length; i++) {
					if(logid.equals(ids[i])) {
						opt = i;
					}
				}
				
				if(opt == -1) {
					System.out.println("없는 아이디 입니다.");
					continue;
				}
				
				System.out.print("비밀번호 입력 : ");
				String logpw = scan.next();
				
				if(logpw.equals(pws[opt])) {
					System.out.println("로그인 되었습니다.");
					log = opt;
					continue;
				}
				else {
					System.out.println("비밀번호가 틀립니다.");
					continue;
				}
				
			}
			
			//로그아웃
			else if (sel == 2) {
				if(log == -1) {
					System.out.println("로그인 후 사용하세요.");
					continue;
				}
				else {
					System.out.println("로그아웃 되었습니다.");
					log = -1;
				}
			}
			
			//쇼핑
			else if (sel == 3) {
				if(log == -1) {
					System.out.println("로그인 후 사용하세요.");
					continue;
				}
				
				System.out.print("1. 사과 \n2. 바나나\n3. 딸기\n선택 : ");
				int choice = scan.nextInt();
				
				if(choice < 1 || choice > 3) {
					System.out.println("입력오류");
					continue;
				}
				else {
					jang[count][0] = log;
					jang[count][1] = choice;
					count++;
				}
				
			}
			
			//장바구니
			else if (sel == 4) {
				
				if(log == -1) {
					System.out.println("로그인 후 이용하세요.");
					continue;
				}
				
				int opt = 1;
				
				System.out.println(ids[log] + "의 장바구니");
				
				for(int i = 0; i < count; i++) {
					if(jang[i][0] == log) {
						System.out.print(opt + ". ");
						if(jang[i][1] == 1) {
							System.out.println("사과");
						}
						else if(jang[i][1] == 2) {
							System.out.println("바나나");
						}
						else if(jang[i][1] == 3) {
							System.out.println("딸기");
						}
						opt++;
					}
					else {
						continue;
					}
				}
			}
			
			//저장
			else if (sel == 5) {
//				jang[count][0] = log;
//				jang[count][1] = choice;
				
				FileWriter fw = null;
				
				String data1 = "qwer : ";
				String data2 = "javaking : ";
				String data3 = "abcd : ";
				String data = "";
				
				for(int i = 0; i < jang.length; i++) {
					if(jang[i][0] == 0) {
						if(jang[i][1] == 1) {
							data1 += "사과/";
						}
						else if(jang[i][1] == 2) {
							data1 += "바나나/";
						}
						else if(jang[i][1] == 3) {
							data1 += "딸기/";
						}
					}
					else if(jang[i][0] == 1) {
						if(jang[i][1] == 1) {
							data2 += "사과/";
						}
						else if(jang[i][1] == 2) {
							data2 += "바나나/";
						}
						else if(jang[i][1] == 3) {
							data2 += "딸기/";
						}
					}
					else if(jang[i][0] == 2) {
						if(jang[i][1] == 1) {
							data3 += "사과/";
						}
						else if(jang[i][1] == 2) {
							data3 += "바나나/";
						}
						else if(jang[i][1] == 3) {
							data3 += "딸기/";
						}
					}
					
				}
				data1 = data1.substring(0, data1.length() - 1);
				data2 = data2.substring(0, data2.length() - 1);
				data3 = data3.substring(0, data3.length() - 1);
				
				data += data1 + "\n" + data2 + "\n" + data3;
				
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
			else if (sel == 6) {
				
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;
				
				String data = "";
				
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					while(true) {
					String line = br.readLine();
						if(line == null) {
							break;
						}
						data += line + "\n";
					}
					
					System.out.println(data);
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
			
			//종료
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}
	}

}
