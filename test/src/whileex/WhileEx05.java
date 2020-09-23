package whileex;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
		/*
		 * # 영수증 출력[2단계]
		 * 1. 5번 주문을 받는다.
		 * 2. 주문이 끝난 후, 돈을 입력받는다.
		 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
		 * 
		 * 예)
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 1
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 2
		 * 메뉴 선택 : 3
		 * 총 금액 = 31300원
		 * 현금 입력 : 32000
		 * === 롯데리아 영수증 ===
		 * 1. 불고기 버거 : 2개
		 * 2. 새우    버거 : 2개
		 * 3. 콜         라 : 1개
		 * 4. 총   금   액 : 31300원
		 * 5. 잔         돈 : 700원
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		int i = 1;
		int sum = 0;
		int choice1 = 0 , choice2 = 0, choice3 = 0;
		
		while(i <= 5) {
			System.out.print("메뉴 선택 : ");
			int num = scan.nextInt();
			if(num == 1) {
				sum += price1;
				choice1 += 1;
			}
			else if(num == 2) {
				sum += price2;
				choice2 += 1;
			}
			else if(num == 3) {
				sum += price3;
				choice3 += 1;
			}
			i += 1;
		}
		System.out.println("총 금액 : " + sum + "원");
		
		System.out.print("현금 입력 : ");
		int pay = scan.nextInt();
		if(pay < sum) {
			while(pay <= sum) {
				System.out.println("현금이 부족합니다. 다시 입력해주세요.");
				pay = scan.nextInt();
			}
		}
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1.불고기 버거 : " + choice1 + "개");
		System.out.println("2.새우    버거 : " + choice2 + "개");
		System.out.println("3.콜          라 : " + choice3 + "개");
		System.out.println("4.총    금   액 : " + sum + "원");
		System.out.println("5.잔          액 : " + (pay - sum) + "원");
		
	}

}
