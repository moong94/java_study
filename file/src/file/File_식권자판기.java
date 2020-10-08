package file;

import java.util.Scanner;

public class File_식권자판기 {

	public static void main(String[] args) {
		// 식권 자판기 프로그램 		
		// 1) 관리자   2) 사용자 
		//관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
		//사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
	    //	       2)뒤로가기
		// 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장출력 
		//화면 
		// 식권 가격 : 3200원 
		// 식권 	  : ??매  (매진시 매진) 
		// 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
		// 1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개
		
		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		
		while(true) {
			
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("3)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					
					//식권 충전
					if(choice == 1) {
						System.out.print("충전 갯수 입력 : ");
						int inputticket = scan.nextInt();
						
						tickets += inputticket;
						System.out.println("충전 완료.");
						System.out.println("현재 남은 티켓 수 : " + tickets);
						
					}
					
					//잔돈 충전
					else if(choice == 2) {
						System.out.print("충전 할 잔 돈 입력 : ");
						int input_money = scan.nextInt();
						
						int check = -1;
						for(int i = 0; i < money.length; i++) {
							
							if(input_money == money[i]) {
								check = i;
								break;
							}
						}
						if(check == -1) {
							System.out.println("(50000원, 10000원, 5000원, 1000원, 500원, 100원 권 만 사용 가능)");
							continue;
						}
						else {
							System.out.print("투입 개수 입력 : ");
							int input_charge = scan.nextInt();
							
							charges[check] += input_charge;
							
							System.out.println("====잔고 상황====");
							for(int i = 0; i < money.length; i++) {
								System.out.print(money[i] + "원\t");
							}
							System.out.println();
							for(int i = 0; i < charges.length; i++) {
								System.out.print(charges[i] + "개\t");
							}
							System.out.println();
						}
						
					}
					
					//뒤로가기
					else if(choice == 3) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)구입");
					System.out.println("2)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					
					//구입
					if(choice == 1) {
						System.out.print("입금액 입력 : ");
						int input_money = scan.nextInt();
						
						System.out.print("구매할 식권 개수 입력 (장 당 3200원) : ");
						int purchase_ticket = scan.nextInt();
						
						
						int sum = 3200 * purchase_ticket;
						
						if(sum > input_money) { 
							System.out.println("입금액이 부족합니다.");
							continue;
						}
						
						int change = input_money - sum;
						
						if(purchase_ticket > tickets) {
							System.out.println("식권이 " + tickets + "장 남아 있어 구매 불가합니다.");
							continue;
						}
						
						System.out.println("식권을 " + purchase_ticket + "장 구매하셨습니다.");
						System.out.println("잔돈 : " + change + "원");
						
						for(int i = 0; i < money.length; i++) {
							if((change / money[i]) != 0 && (change / money[i]) <= charges[i]) {
								System.out.println(money[i] + "원 권 " + (change / money[i]) + "장\t");
								charges[i] -= (change / money[i]);
								change %= money[i];
							}
						}
						
						
						
					}
					
					//뒤로가기
					else if(choice == 2) {
						break;
					}
				}
			}
		}
	}

}
