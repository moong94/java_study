package string;

import java.util.Random;
import java.util.Scanner;

public class StringEx12 {

	public static void main(String[] args) {
		/*
		 * # 타자연습 게임[2단계]
		 * 1. 문제를 섞는다.(shuffle)
		 * 2. 순서대로 문제를 출제하고, 문제를 다 맞추면 게임 종료
		 * 3. 단 문제를 출제할 때, 단어의 랜덤한 위치 한 곳만 *로 출력
		 * 예)
		 * 문제 : mys*l
		 * 입력 : mysql	<--- 정답을 맞추면, 다음 문제 제시
		 * 문제 : *sp
		 * 입력 : jsp
		 * ...
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
			System.out.print("문제 : ");
			
			int star = ran.nextInt(words[i].length());
			
			String temp = "";
			
			for(int j = 0; j < words[i].length();j++) {
				if(j == star) {
					temp += "*";
				}
				else {
					temp += words[i].charAt(j);
				}
			}
			System.out.println(temp);
			
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
