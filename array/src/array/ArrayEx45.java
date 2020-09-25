package array;

import java.util.Scanner;

public class ArrayEx45 {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 [장바구니]
		 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
		 * 	1) 사과
		 *  2) 바나나
		 *  3) 딸기
		 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
		 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
		 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
		 * 예)
		 * {
		 * 		{0, 1},				qwer회원 			> 사과구매
		 * 		{1, 2},				javaking회원 		> 바나나구매
		 * 		{2, 1},				abcd회원			> 사과구매
		 * 		{0, 3},				qwer회원			> 딸기구매
		 * 		...
		 * }
		 */

		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int MAX_SIZE = 100;
		int[][] jang = new int[MAX_SIZE][2];
		
		int count = 0;
		
		
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int log = -1;
		
		while(true) {
			
			int error = 0;
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			//로그인
			if(sel == 1) {
				if(log == -1) {
					System.out.print("회원 ID입력 : ");
					String id = scan.next();
					
					for(int i = 0; i < ids.length; i++) {
						if(id.equals(ids[i])) {
							System.out.print("비밀번호 입력 : ");
							String pw = scan.next();
							
							if(pw.equals(pws[i])) {
								System.out.println("로그인 되었습니다.");
								log = i;
							}
							else {
								System.out.println("비밀번호가 틀립니다.");
								continue;
							}
						}
						else {
							error++;
							if(error == ids.length) {
								System.out.println("존재하지 않는 ID입니다.");
								continue;
							}
						}
					}
							
				}
				else {
					System.out.println("로그아웃 후 이용해주세요.");
					continue;
				}
				
			}
			
			//로그아웃
			else if(sel == 2) {
				if(log == -1) {
					System.out.println("로그인 후 이용하세요.");
					continue;
				}
				else {
					System.out.println("로그아웃 되었습니다.");
					log = -1;
					continue;
				}
			}
			
			//쇼핑
			else if(sel == 3) {
				if(log == -1) {
					System.out.println("로그인 후 이용하세요.");
					continue;
				}
				else {
					for(int i = 0; i < items.length; i++) {
						System.out.println((i + 1) + ")" + items[i]);
					}
					System.out.print("구매할 물품 번호 입력 : ");
					int purchase = scan.nextInt();
					if(purchase < 1 || purchase > 3) {
						System.out.println("입력 오류");
						continue;
					}
					else {
						System.out.println(ids[log] + "회원			> " + items[purchase - 1] + "구매");
						jang[count][0] = log;
						jang[count][1] = purchase;
						count++;
					}
				}
			}
			
			//장바구니
			else if(sel == 4) {
				if(count == 0) {
					System.out.println("구매 내역이 존재하지 않습니다.");
					continue;
				}
				System.out.println("==========장바구니 목록==========");
				for(int i = 0; i < count; i++) {
					System.out.println(ids[jang[i][0]] + "회원			> " + items[jang[i][1] - 1] + "구매");					
				}
				
			}
			
			//종료
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}


	}

}
