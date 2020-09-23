package whileex;

import java.util.Scanner;

public class WhileEx10 {

	public static void main(String[] args) {
		/*
		 * # ATM[2단계]
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
		 * 3. 입금
		 * . 로그인 후 이용가능
		 * 4. 출금
		 * . 로그인 후 이용가능
		 * 5. 이체
		 * . 로그인 후 이용가능
		 * 6. 조회
		 * . 로그인 후 이용가능
		 * 7. 종료
		 */
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int log = -1;		// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//로그인
			if(sel == 1) {
				if(log == -1) {
					System.out.print("계좌 입력 : ");
					int id = scan.nextInt();
					if(id == dbAcc1) {
						System.out.print("비밀번호 입력 : ");
						int pw = scan.nextInt();
						if(pw == dbPw1) {
							System.out.println("로그인 되었습니다.");
							log = 1;
						}
						else {
							System.out.println("비밀번호 오류.");
						}
					}
					else if(id == dbAcc2) {
						System.out.print("비밀번호 입력 : ");
						int pw = scan.nextInt();
						if(pw == dbPw2) {
							System.out.println("로그인 되었습니다.");
							log = 2;
						}
						else {
							System.out.println("비밀번호 오류.");
						}
					}
					else {
						System.out.println("계좌 입력 오류.");
					}
				}
				else {
					System.out.println("로그아웃 후 이용.");
				}
			}
			
			
			//로그아웃
			else if(sel == 2) {
				if(log == 1 || log == 2) {
					System.out.println("로그아웃 되었습니다.");
					log = -1;
				}
				else {
					System.out.println("로그인 후 이용.");
				}
			}
			
			//입금 로그인 후 이용가능
			else if(sel == 3) {
				if(log == 1) {
					System.out.print("입금 금액 입력 : ");
					int addMoney1 = scan.nextInt();
					dbMoney1 += addMoney1;
				}
				else if(log == 2) {
					System.out.print("입금 금액 입력 : ");
					int addMoney2 = scan.nextInt();
					dbMoney2 += addMoney2;
				}
				else {
					System.out.println("로그인 후 이용.");
				}
			}
			
			//출금 로그인 후 이용가능
			else if(sel == 4) {
				if(log == 1) {
					System.out.print("출금 금액 입력 : ");
					int subMoney1 = scan.nextInt();
					if(subMoney1 > dbMoney1) {
						System.out.println("한도초과.");
					}
					else {
						dbMoney1 -= subMoney1;
					}
				}
				else if(log == 2) {
					System.out.print("출금 금액 입력 : ");
					int subMoney2 = scan.nextInt();
					if(subMoney2 > dbMoney2) {
						System.out.println("한도초과.");
					}
					else {
						dbMoney2 -= subMoney2;
					}
				}
				else {
					System.out.println("로그인 후 이용.");
				}
			}
			
			//이체 로그인 후 이용가능
			else if(sel == 5) {
				if(log == 1) {
					System.out.print("이체 계좌 입력 : ");
					int inputAcc = scan.nextInt();
					if(inputAcc == dbAcc2) {
						System.out.println("이체 금액 입력 : ");
						int sendMoney1 = scan.nextInt();
						
						if(sendMoney1 > dbMoney1) {
							System.out.println("한도 초과.");
						}
						else {
							dbMoney1 -= sendMoney1;
							dbMoney2 += sendMoney1;
						}
					}
					else {
						System.out.println("계좌 입력 오류.");
					}
				}
				if(log == 2) {
					System.out.print("이체 계좌 입력 : ");
					int inputAcc = scan.nextInt();
					if(inputAcc == dbAcc1) {
						System.out.println("이체 금액 입력 : ");
						int sendMoney2 = scan.nextInt();
						
						if(sendMoney2 > dbMoney2) {
							System.out.println("한도 초과.");
						}
						else {
							dbMoney2 -= sendMoney2;
							dbMoney1 += sendMoney2;
						}
					}
					else {
						System.out.println("계좌 입력 오류.");
					}
				}
				else {
					System.out.println("로그인 후 이용.");
				}
			}
			
			//조회 로그인 후 이용가능
			else if(sel == 6) {
				if(log == 1) {
					System.out.println("잔고 : " + dbMoney1);
				}
				else if(log == 2) {
					System.out.println("잔고 : " + dbMoney2);
				}
				else {
					System.out.println("로그인 후 이용.");
				}
			}
			
			//종료
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
