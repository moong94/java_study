package string;

import java.util.Random;
import java.util.Scanner;

public class StringEx10 {

	public static void main(String[] args) {

		/*
		* # 타자연습 게임[1단계]
		* 1. 문제를 섞는다.(shuffle)
 		* 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
 		* 예)
 		* 문제 : mysql
 		* 입력 : mydb
 		* 문제 : mysql
 		* 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
 		* 문제 : jsp
 		*/
		String[] words = {"java", "mysql", "jsp", "spring"};
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		//셔플
		for(int i = 0; i < 1000; i++) {
			int suffle = ran.nextInt(words.length);
			String tmp = words[0];
			words[0] = words[suffle];
			words[suffle] = tmp;
		}
		
		for(int i = 0; i < words.length; i++) {
			System.out.println("문제 : " + words[i]);
			System.out.print("입력 : ");
			String input = scan.next();
			
			if(words[i].equals(input)) {
				continue;
			}
			else {
				i--;
			}
		}
		
		
	}

}
