package file;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileEx07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = 5;		//계정 갯수 & 비밀번호 갯수 최대 5개
		int count = 0;		//저장되어있는 계정 갯수
		int log = -1;		//로그인 계정 위치
		
		String[] accs = new String[size];
		String[]  pws = new String[size];
		int[]  moneys = new int[size];
		
		String fileName = "ATM.txt";
		
		while(true) {
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금");
			System.out.println("[6]출금");
			System.out.println("[7]이체");
			System.out.println("[8]잔액조회");
			System.out.println("[9]저장");
			System.out.println("[10]로드");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//회원가입(5이상 사용불가)
			if(sel == 1) {
				
				int opt = -1;
				
				while(true) {
					//회원가입 아이디 초과
					if(count == 5) {
						System.out.println("더 이상 회원가입을 할 수 없습니다.");
						continue;
					}
						System.out.print("가입할 아이디 : ");
						String inputacc = scan.next();
					
						for(int i = 0; i < count; i++) {
							if(inputacc.equals(accs[i])) {
								opt = 1;
							}
						}
					if(opt == 1) {
						System.out.println("이미 사용중인 아이디 입니다.");
						break;
					}
						else {
						System.out.println("비밀번호 입력 : ");
						String inputpw = scan.next();
					
						accs[count] = inputacc;
						pws[count] = inputpw;
						count++;
						System.out.println("회원가입이 완료되었습니다.");
						break;
					}
				}
				
			}
			
			//회원탈퇴(계정 없으면 사용 불가)
			else if(sel == 2) {
				
				int opt = -1;
				
				while(true) {
					//탈퇴할 아이디 없을 때
					if(count == 0) {
						System.out.println("삭제할 계정이 없습니다.");
						break;
					}
					System.out.print("탈퇴할 아이디 입력 : ");
					String inputdelacc = scan.next();
					
					for(int i = 0; i < count; i++) {
						if(inputdelacc.equals(accs[i])) {
							opt = i;
						}
					}
					
					if(opt == -1) {
						System.out.println("없는 계정입니다.");
						break;
					}
					
					System.out.print("탈퇴할 계정의 비밀번호 입력 : ");
					String inputdelpw = scan.next();
					
					if(inputdelpw.equals(pws[opt])) {
						
						System.out.println(accs[opt] + "계정이 삭제되었습니다.");
						
						String[] tmpac = accs;
						accs = new String[count];
						String[] tmppw = pws;
						pws = new String[count];
						int[] tmpmoney = moneys;
						moneys = new int[count];
						
						int j = 0;
						
						for(int i = 0; i < count; i++) {
							if(i == opt) {
								continue;
							}
							accs[j] = tmpac[i];
							pws[j] = tmppw[i];
							moneys[j] = tmpmoney[i];
							j++;
						}
						
						count--;
						break;
					}
					else {
						System.out.println("비밀번호가 틀립니다.");
						break;
					}
				
				}
			}
			
			//로그인(log -1일때만)
			else if(sel == 3) {
				
				while(true) {
					
					int opt = -1;
				
					if(log != -1) {
						System.out.println("로그인 후 이용하세요.");
						break;
					}
					System.out.print("로그인 할 아이디 입력 : ");
					String logacc = scan.next();
					
					if(count == 0) {
						System.out.println("로그인 불가");
						break;
					}
					for(int i = 0; i < count; i++) {
						if(logacc.equals(accs[i])) {
							opt = i;
						}
					}
					
					if(opt == -1) {
						System.out.println("존재하지 않는 아이디 입니다.");
						break;
					}
					
					System.out.print(accs[opt] + "비밀번호 입력 : ");
					String logpw = scan.next();
					
					if(logpw.equals(pws[opt])) {
						System.out.println("로그인 되었습니다.");
						log = opt;
						break;
					}
					else {
						System.out.println("비밀번호가 틀립니다.");
						break;
					}
				}
			}
			
			//로그아웃(log -1이 아닐 때만)
			else if(sel == 4) {
				while(true) {
					if(log == -1) {
						System.out.println("로그인 후 사용하세요.");
						break;
					}
					
					System.out.println("로그아웃 되었습니다.");
					log = -1;
					break;
				}
				
			}
			
			//입금(로그인 상태에서만)
			else if(sel == 5) {
				while(true) {
					if(log == -1) {
						System.out.println("로그인 후 사용하세요.");
						break;
					}
					
					System.out.print("입금 할 금액 입력 : ");
					int inputmoney = scan.nextInt();
					
					moneys[log] += inputmoney;
					
					System.out.println(inputmoney + "원 입금되었습니다.");
					System.out.println("잔액 : " + moneys[log]);
					break;
				}
			}
			
			//출금(로그인 상태에서만)
			else if(sel == 6) {
				while(true) {
					if(log == -1) {
						System.out.println("로그인 후 사용하세요.");
						break;
					}
					
					System.out.print("출금할 금액 입력 : ");
					int outputmoney = scan.nextInt();
					
					if(moneys[log] < outputmoney) {
						System.out.println("한도초과입니다.");
						break;
					}
					
					System.out.println(outputmoney + "원 출금되었습니다.");
					moneys[log] -= outputmoney;
					System.out.println("잔액 : " + moneys[log]);
					break;
				}
				
			}
			
			//이체(로그인 상태에서만)
			else if(sel == 7) {
				while(true) {
					
					int opt = -1;
					
					if(log == -1) {
						System.out.println("로그인 후 사용하세요.");
						break;
					}
					
					System.out.print("이체할 계정 입력 : ");
					String aacc = scan.next();
					
					for(int i = 0; i < count; i++) {
						if(aacc.equals(accs[i])) {
							opt = i;
						}
					}
					
					if(opt == -1) {
						System.out.println("없는 계정입니다.");
						break;
					}
					
					System.out.print("이체할 금액 입력 : ");
					int amoney = scan.nextInt();
					
					if(moneys[log] < amoney) {
						System.out.println("한도 초과 입니다.");
						break;
					}
					
					moneys[log] -= amoney;
					moneys[opt] += amoney;
					
					System.out.println(accs[opt] + "계정으로 " + amoney + "원 이체되었습니다.");
					System.out.println("잔액 : " + moneys[log]);
					break;
					
				}
				
			}
			
			//잔액 조회(로그인 상태에서만)
			else if(sel == 8) {
				while(true) {
					if(log == -1) {
						System.out.println("로그인 후 사용 가능합니다.");
						break;
					}
					
					System.out.println("잔액 : " + moneys[log]);
					break;
				}
				
			}
			
			//저장(모든 계정 & 비밀번호 & 잔액)
			else if(sel == 9) {
				
				if(count == 0) {
					System.out.println("저장할 값이 없습니다.");
					continue;
				}
				
				FileWriter fw = null;
				
				String data = "";
				
				for(int i = 0; i < count; i++) {
					data += accs[i] + "/" + pws[i] + "/" + String.valueOf(moneys[i]) + "\n";
				}
				
				data = data.substring(0, data.length() - 1);
				
				try {
					fw = new FileWriter(fileName);
					fw.write(data);
					fw.close();
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
			}
			
			//로드(모든 계정 & 비밀번호 & 잔액)
			else if(sel == 10) {
				File file = new File(fileName);
				FileReader fr = null;
				BufferedReader br = null;
				
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
							
							data += line + "\n";
						}
						
						data = data.substring(0, data.length() -1);
						System.out.println(data);
						
						fr.close();
						br.close();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
				else {
					System.out.println("로드할 파일이 없습니다.");
					continue;
				}
				
			}
			
			//종료
			else if(sel == 0) {
				System.out.println("종료합니다.");
				break;
			}
			
		}
	}

}
