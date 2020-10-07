package string_intensify;

import java.util.Scanner;
import java.util.Random;

public class StringEx05 {

	public static void main(String[] args) {
		// 문제) 영어단어 맞추기
		// 영어단어가 전부 * 로 표시된다.
		// 영어단어를 입력받고 틀릴때마다 랜덤으로 한글자씩 벗겨진다. (점수는 5점씩 감점)
		// (조건) 만약에 같은 철자가 여러개면 한번에 벗겨진다.
		// 전부 벗겨지거나 맞추면 종료
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
			
		int score = 100;
		String word = "performance";
		String meaning = "공연";
		int size = word.length();
		int check[] = new int[size]; // 힌트 체크를 통해서 확인할수있다.
		int count = 0;

		while (true) {
			
			if(score == 0) {
				System.out.println("0점입니다!");
				break;
			}
			
			System.out.println("현재 점수  : " + score);
			System.out.println("뜻 : " + meaning);
			System.out.print("문제 : ");
			for (int i = 0; i < size; i++) {
				System.out.print("*");

			}
			System.out.println();
			System.out.println("영어단어를 입력하세요 >>> (힌트 체크는 hint입력)");
			String me = scan.next();

			if(me.equals("hint")) {
				System.out.print("힌트 : ");
				for(int i = 0 ; i < size; i++) {
					if(check[i] == 1) {
						System.out.print(word.charAt(i));
					}
					else {
						System.out.print("*");
					}
				}
				System.out.println();
				continue;
			}
					
			else if(me.equals(word)) {
				System.out.println("정답 ! 점수 : " + score);
				break;
			}
			
			
			if(count == 9) {
				score -= 5;
				continue;
			}
			
			else {
				while(true) {
					int reveal = ran.nextInt(size);
							
					if(check[reveal] == 1) {	
						continue;
					}
					else {
						char ch = word.charAt(reveal);
							for(int i = 0; i < size; i++) {
								if(word.charAt(i) == ch) {
									check[i] = 1;
								}
							}
						break;
					}
				}
				
				score -= 5;
			}
			
			count++;
			
		}
	}

}
