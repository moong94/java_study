package methodEx;

import java.util.Scanner;

class Theater{
	
	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	
	String name = "";				// 영화관 이름
	int cnt = 0;					// 예매 수
	int money = 0;					// 매출액
	
	
	void showMenu() {
		System.out.println("=== " + name + " ===");
		System.out.println("1.예매하기");
		System.out.println("2.종료하기");
	}
	
	void showSeat() {
		for(int i=0; i<seat.length; i++) {
			if(seat[i] == 0) {
				System.out.print(" [X] ");
			}else {
				System.out.print(" [O] ");
			}
		}
		System.out.println();
	}
	
	void choiceSeat() {
		// 좌석 현황 출력하기
		showSeat();
		
		System.out.print("좌선번호를 선택하세요[1 ~ 10] : ");
		int idx = scan.nextInt() - 1;
		
		if(seat[idx] == 0) {
			seat[idx] = 1;
			cnt += 1;
			System.out.println("예매를 완료하였습니다.");
		}else {
			System.out.println("이미 예매가 끝난 좌석입니다.");
		}
	}
	
	void showSales() {
		money = cnt * 12000;
		System.out.println("총 매출 금액 = " + money + "원");
	}
	
	void run() {
		while(true) {
			
			// 메뉴 출력
			showMenu();
			
			// 메뉴 선택하기
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			// 예매하기
			if(choice == 1) {
				choiceSeat();
			}
			// 종료하기
			else if(choice == 2) {
				showSeat();
				// 매출 현황 출력하기
				showSales();
				
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
}


public class Method_영화관좌석 {

	public static void main(String[] args) {
		/*
		 * # 영화관 좌석예매 : 클래스 + 메서드
		 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
		 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
		 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
		 * 4. 한 좌석당 예매 가격은 12000원이다.
		 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
		 * 예)
		 * seat = 0 0 0 0 0 0 0
		 * 
		 * 좌석선택 : 1
		 * seat = 0 1 0 0 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 
		 * 좌석선택 : 3
		 * seat = 0 1 0 1 0 0 0
		 * 이미 예매가 완료된 자리입니다.
		 * ----------------------
		 * 매출액 : 24000원
		 */

		Theater megabox = new Theater();
		megabox.name = "메가박스";
		
		megabox.run();
	}

}
