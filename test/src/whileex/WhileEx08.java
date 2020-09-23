package whileex;

import java.util.Scanner;

public class WhileEx08 {

	public static void main(String[] args) {
		/*
		 * # ATM[2단계]
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
		 */

		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;			// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.print("Id 입력 : ");
					int logAcc = scan.nextInt();
					if(logAcc == dbAcc1) {
						System.out.print("Pw 입력 : ");
						int logPw = scan.nextInt();
						if(logPw == dbPw1) {
							System.out.println("로그인");
							log = 1;
						}
					}
					if(logAcc == dbAcc2) {
						System.out.print("Pw 입력 : ");
						int logPw = scan.nextInt();
						if(logPw == dbPw2) {
							System.out.println("로그인");
							log = 2;
						}
						
					}
				}
				else {
					System.out.println("로그아웃 후 이용.");
				}
			}
			else if(sel == 2) {
				if(log == 1 || log == 2) {
					System.out.println("로그아웃 되었습니다.");
					log = -1;
				}
				else {
					System.out.println("로그인 후 이용.");
				}
			}
			
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}

}
