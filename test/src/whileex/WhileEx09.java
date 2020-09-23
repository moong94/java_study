package whileex;

import java.util.Scanner;

public class WhileEx09 {

	public static void main(String[] args) {
		/*
		 * # ATM[2단계]
		 * 1. 입금
		 * . 입금할 금액을 입력받아, myMoney에 입금
		 * 2. 출금
		 * . 출금할 금액을 입력받아, myMoney에서 출금
		 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
		 * 3. 이체
		 * . yourAcc 계좌번호를 입력받아, 이체
		 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
		 * . 이체 후 yourMoney 잔액 증가
		 * 4. 조회
		 * . myMoney와 yourMoney 잔액 모두 출력
		 */
			
			Scanner scan = new Scanner(System.in);
			
			int myAcc = 1111;
			int myMoney = 50000;
		
			int yourAcc = 2222;
			int yourMoney = 70000;	
			
			boolean run = true;
			while(run) {
					
				System.out.println("1.입금");
				System.out.println("2.출금");
				System.out.println("3.이체");
				System.out.println("4.조회");
				System.out.println("0.종료");
				
				System.out.print("메뉴 선택 : ");
				int sel = scan.nextInt();
					
				//입금
				if(sel == 1) {
					System.out.print("입금 금액 입력 : ");
					int addMoney = scan.nextInt();
					myMoney += addMoney;
					System.out.println("잔액 : " + myMoney);
				}
				
				//출금
				else if(sel == 2) {
					System.out.print("출금 금액 입력 : ");
					int subMoney = scan.nextInt();
					if(subMoney > myMoney) {
						System.out.println("출금 불가.");
					}
					else {
						myMoney -= subMoney;
						System.out.println("잔액 : " + myMoney);
					}
				}
				
				//이체
				else if(sel == 3) {
					System.out.print("이체 계좌 입력 : ");
					int inputAcc = scan.nextInt();
					if(inputAcc != yourAcc) {
						System.out.println("계좌 입력 오류");
					}
					else {
						System.out.print("이체 금액 입력 : ");
						int payMoney = scan.nextInt();
						if(payMoney > myMoney) {
							System.out.println("이체 불가.");
						}
						else {
							yourMoney += payMoney;
							myMoney -= payMoney;
							System.out.println("잔액 : " + myMoney);
						}
					}
					
				}
				
				//조회
				else if(sel == 4) {
					System.out.println("myMoney : " + myMoney);
					System.out.println("yourMoney : " + yourMoney);
				}
				
				//프로그램 종료
				else if(sel == 0) {
					run = false;
					System.out.println("프로그램 종료");
			}
		}
	}
}
