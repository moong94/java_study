package iff;

import java.util.Random;
import java.util.Scanner;

public class TestEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		//0 : 가위     1 : 바위    2 : 보
		System.out.println("가위바위보 저장");
		System.out.println("(0:가위)     (1:바위)     (2:보)");

		int meleft = -1;
		int meright = -1;
		
		int melast = -1;
		int comlast = -1;		//최종 선택
		
		boolean opt = true;
		
		while(opt) {
			System.out.print("왼손 : ");
			meleft = scan.nextInt();
			if(meleft < 0 || meleft > 2) {
				System.out.print("0~2로 다시 입력 :");
			}
			else {
				opt = false;
			}
		}
		boolean opt2 = true;
		while(opt2) {
			System.out.print("오른손 : ");
			meright = scan.nextInt();
			if(meright < 0 || meright > 2) {
				System.out.print("0~2로 다시 입력 :");
			}
			else {
				opt2 = false;
			}
		}
		
		int comleft = ran.nextInt(3);
		int comright = ran.nextInt(3);
		
		//보여주기
		System.out.println("(0:가위)     (1:바위)     (2:보)");
		System.out.println("me 왼손 : " + meleft + ", 오른손 : " + meright);
		System.out.println("com 왼손 : " + comleft + ", 오른손 : " + comright);
		
		//듈 즁 하나만 저장
		System.out.println("하나 빼기");
		
		boolean opt3 = true;
		while (opt3) {
		System.out.println("me 손 고르기 (1) 왼손, (2) 오른손 : ");
			int meran = scan.nextInt();
			if(meran < 1 || meran > 2) {
				System.out.println("잘못 된 입력");
			}
			else {
				opt3 = false;
				if(meran == 1) {
					melast = meleft;
				}
				else if(meran == 2) {
					melast = meright;
				}
			}
		}
		
		//컴퓨터 랜덤 선택
		int comran = ran.nextInt(2);
		
		if(comran == 0) {
			comlast = comleft;
		}
		else if(comran == 1) {
			comlast = comright;	
		}
		
		System.out.println("결과");
		
		
		System.out.println("(0:가위)     (1:바위)     (2:보)");
		System.out.println("me : " + melast + ", com : " + comlast);
		if(melast == comlast) {
			System.out.println("비겼다.");
		}
		else if(comlast == 2 && melast == 0) {
			System.out.println("이겼다.");
		}
		else if(comlast == 0 && melast == 2) {
			System.out.println("졌다.");
		}
		else if(comlast > melast) {
			System.out.println("졌다.");
		}
		else if(comlast < melast) {
			System.out.println("이겼다.");
		}
	}

}
