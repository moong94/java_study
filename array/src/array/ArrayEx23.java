package array;

import java.util.Scanner;

public class ArrayEx23 {

	public static void main(String[] args) {
		/*
		 * # ATM[3단계]
		 * 1. 가입
		 * . 계좌번호와 비밀번호를 입력받아 가입
		 * . 계좌번호 중복검사
		 * 2. 탈퇴
		 * . 계좌번호를 입력받아 탈퇴
		 */
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int cnt = 2;
		
		
		
		boolean run = true;
		while(run) {
			
			for(int i = 0; i < 5; i++) {
				System.out.print(accs[i] + " ");
			}
			System.out.println();
			for(int i = 0; i < 5; i++) {
				System.out.print(pws[i] + " ");
			}
			System.out.println();
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				int rel = -1;
				int acccheck = -1;
				
				System.out.println("계좌번호 입력 : ");
				int inputacc = scan.nextInt();
				
				if(cnt == 0) {
					accs[cnt] = inputacc;
				}
				
				for(int i = 0; i < cnt; i++) {
					
					if(inputacc == accs[i]) {
						System.out.println("중복된 계좌번호입니다.");
						rel = 0;
						break;
						
					}
					else {
						acccheck++;
					}
				}
				if(acccheck == (cnt - 1)) {
					accs[cnt] = inputacc;
				}
				if(rel == -1) {
				System.out.println("비밀번호 입력 : ");
				int inputpw = scan.nextInt();
				
				pws[cnt] = inputpw;
				
				cnt++;
				}
			}
			else if(sel == 2) {
				int check = 0;
				int pos = cnt;
				
				if(cnt == 0) {
					System.out.println("계좌가 존재하지 않습니다.");
					continue;
				}
				System.out.println("탈퇴할 계좌번호 입력 : ");
				int acc = scan.nextInt();
				
				for(int i = 0; i < cnt; i++) {
					if(acc == accs[i]) {
						accs[i] = 0;
						pws[i] = 0;
						for(int j = 0; j < cnt - i; j++) {
							accs[i] = accs[i + 1];
							pws[i] = pws[i + 1];
						} 
						accs[cnt - 1] = 0;
						pws[cnt - 1] = 0;
						cnt--;
						System.out.println("탈퇴되었습니다.");
						break;
					}
					else {
						check++;
					}
					
				}
				if(check == cnt && cnt != 0 && check != pos) {
					System.out.println("존재하지 않는 계좌번호입니다.");
				}
				
			}		
		}
			
	}

}


