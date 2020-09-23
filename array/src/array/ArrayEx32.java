package array;

import java.util.Scanner;

public class ArrayEx32 {

	public static void main(String[] args) {
		/*
		 * # ATM[4단계] : 전체 기능구현
		 * 1. 회원가입
		 * . id와 pw를 입력받아 가입
		 * . 가입 시 돈 1000원 부여
		 * . id 중복체크
		 * 2. 회원탈퇴
		 * . 로그인시에만 이용가능
		 * 3. 로그인
		 * . id와 pw를 입력받아 로그인
		 * . 로그아웃 상태에서만 이용가능
		 * 4. 로그아웃
		 * . 로그인시에만 이용가능
		 * 5. 입금
		 * . 로그인시에만 이용가능
		 * 6. 이체
		 * . 로그인시에만 이용가능
		 * 7. 잔액조회
		 * . 로그인시에만 이용가능
		 */
		Scanner scan = new Scanner(System.in);
		
		int MAX = 5;
		
		int[] arId = new int[MAX];
		int[] arPw = new int[MAX];
		int[] arMoney = new int[MAX];
		
		int count = 0;
		int log = -1;		//-1:로그아웃, 0~5: 각각 로그인
		
		String menu = "=== 메가IT ATM ===\n";
		menu += "1.회원가입\n2.회원탈퇴\n3.로그인\n4.로그아웃\n";
		menu += "5.입금\n6.이체\n7.잔액조회\n0.종료";
		
		while(true) {
			
			for(int i = 0; i < MAX; i++) {
				System.out.print(arId[i] + " ");
			}
			System.out.println();
			for(int i = 0; i < MAX; i++) {
				System.out.print(arPw[i] + " ");
			}
			
			System.out.println(menu);
			System.out.print("입력 : ");
			int sel = scan.nextInt();
			
			//회원가입
			if(sel == 1) {
				int check = 1;
				if(count == 5) {
					System.out.println("더 이상 가입 할 수 없습니다.");
					continue;
				}
				System.out.print("가입 ID 입력 : ");
				int id = scan.nextInt();
				
				for(int i = 0; i < MAX; i++) {
					if(id == arId[i]) {					
						check = -1;
					}
				}
				if(check == -1) {
					System.out.println("이미 등록 된 ID입니다.");
				}
				else {
					System.out.println("가입자 비밀번호 입력 : ");
					int pw = scan.nextInt();
						
					arId[count] = id;
					arPw[count] = pw;
					arMoney[count] = 1000;
					count++;
				}	
			}
			
			//회원탈퇴
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("회원탈퇴하시겠습니까? (1)예, (2)아니오");
					int yn = scan.nextInt();
					
					if(yn == 1) {
						arId[log] = 0;
						arPw[log] = 0;
						for(int i = log; i < MAX - 1; i++) {
							arId[i] = arId[i + 1];
							arPw[i] = arPw[i + 1];
						}
						arId[4] = 0;
						arPw[4] = 0;
						count--;
						log = -1;
					}
					else if(yn == 2) {
						continue;
					}
				}
				else {
					System.out.println("로그인 후 이용해주세요.");
					
				}
				
			}
			
			//로그인
			else if(sel == 3) {
				
				int cnt = 0;
				
				if(log != -1) {
					System.out.println("로그아웃 후 이용하세요.");
				}
				else {
				System.out.print("로그인 ID 입력 : ");
				int logId = scan.nextInt();
				for(int i = 0; i < MAX; i++) {
					if(logId == arId[i]) {
						System.out.print("비밀번호 입력 : ");
						int logPw = scan.nextInt();
						
						if(logPw == arPw[i]) {
							log = i;	
							break;
						}
						else {
							System.out.println("비밀번호 입력 오류");
							break;
						}
					}
					else if(cnt == 4){
						System.out.println("존재하지 않는 ID입니다.");
						continue;
					}
					cnt++;
				}
				}
			}
			
			//로그아웃
			else if(sel == 4) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
				}
				else {
					System.out.println("로그아웃 하시겠습니까? (1)예, (2)아니오");
					int yn = scan.nextInt();
					
					if(yn == 1) {
						log = -1;
						
					}
					else if(yn == 2) {
						
					}
					
				}
				
			}
			
			//입금
			else if(sel == 5) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
				}
				else {
					System.out.print("입금 금액 입력 : ");
					int insert = scan.nextInt();
					
					arMoney[log] += insert;
				}
				
			}
			
			//이체
			else if(sel == 6) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
				}
				else {
					System.out.print("이체할 ID 입력 : ");
					int acId = scan.nextInt();
					
					for(int i = 0; i < MAX; i++) {
						if(acId == arId[log]) {
							System.out.println("자신에게는 이체할 수 없습니다.");
							break;
						}
						else if(acId == arId[i]) {
							System.out.println("이체 금액 입력 : ");
							int acMoney = scan.nextInt();
							
							if(arMoney[log] < acMoney) {
								System.out.println("잔고가 부족합니다.");
								break;
							}
							else {
								arMoney[log] -= acMoney;
								arMoney[i] += acMoney;
								break;
							}
						}
					}
				}
			}
			
			//잔액조회
			else if(sel == 7) {
				if(log == -1) {
					System.out.println("로그인 후 이용해주세요.");
					continue;
				}
				else {
					System.out.println("잔액 : " + arMoney[log]);
					continue;
				}
				
			}
			
			//종료
			else if(sel == 0) {
				break;
			}
		}


	}

}
