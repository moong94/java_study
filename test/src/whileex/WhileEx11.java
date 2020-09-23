package whileex;

import java.util.Scanner;

public class WhileEx11 {

	public static void main(String[] args) {
		/*
		 * # 베스킨라빈스31
		 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
		 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
		 * 3. br이 31을 넘으면 게임은 종료된다.
		 * 4. 승리자를 출력한다.
		 * 
		 * 예) 
		 * 1턴 : p1(2)	br(2)
		 * 2턴 : p2(1)	br(3)
		 * 3턴 : p1(3)	br(6)
		 * ...
		 */

		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;

		Scanner scan = new Scanner(System.in);
		
		while(br < 31) {
			boolean tf = true;
			
			if(turn % 2 == 0) {
				System.out.print((turn + 1) + "턴 : p1 입력 : ");
				while(tf) {
					int inputp1 = scan.nextInt();
					if(inputp1 > 3 || inputp1 < 1) {
						System.out.print("1~3사이의 숫자 다시 입력 : ");
					}
					else {
						br += inputp1;
						System.out.println((turn + 1) + "턴 : p1(" + inputp1 + ")   br(" + br + ")");
						turn++;
						tf = false;
					}
				}
			}
			else if(turn % 2 == 1) {
				System.out.print((turn + 1) + "턴 : p2 입력 : ");
				while(tf) {
					int inputp2 = scan.nextInt();
					if(inputp2 > 3 || inputp2 < 1) {
						System.out.print("1~3사이의 숫자 다시 입력 : ");
					}
					else {
						br += inputp2;
						System.out.println((turn + 1) + "턴 : p2(" + inputp2 + ")   br(" + br + ")");
						turn++;
						tf = false;
					}
				}
			}
			
		}
		int result = (turn % 2);
		if(result == 1) {
		System.out.print("승리자 : p2");
		}
		if(result == 0) {
			System.out.print("승리자 : p1");
		}
	}

}
