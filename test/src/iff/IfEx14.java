package iff;

import java.util.Random;
import java.util.Scanner;

public class IfEx14 {

	public static void main(String[] args) {
		/*
		 * # 가위(0)바위(1)보(2) 게임[2단계]
		 * # 가위바위보 게임[2단계]를
		 *   if - else if 구문으로 변경해보자.
		 */
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int com = ran.nextInt(3);
		
		System.out.println("0~2 사이의 숫자 입력 : ");
		int me = scan.nextInt();
		
		if(me == com) {
			System.out.println("비겼다.");
		}
		else if(me == 2 && com == 0) {
			System.out.println("내가 졌다.");
		}
		else if(me == 0 && com == 2) {
			System.out.println("내가 이겼다.");
		}
		else if(me > com) {
			System.out.println("내가 이겼다.");
		}
		else {
			System.out.println("내가 졌다.");
		}
	}
}
