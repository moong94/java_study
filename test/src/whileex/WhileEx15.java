package whileex;

import java.util.Random;

public class WhileEx15 {

	public static void main(String[] args) {
		/*
		 * # 랜덤학생
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.
		 */

		Random ran = new Random();
		
		int i = 0;
		int isave = 0;
		int sum = 0;
		int max = 0;
		int passed = 0;
		
		while(i < 10) {
			
			int num = ran.nextInt(100) + 1;
			
			if(num >= 60) {
				passed++;
			}
			if(max <= num) {
				max = num;
				isave = i + 1;
				
			}
			System.out.println((i+1) + "번째 학생 성적 : " + num);
			sum += num;
			i++;
		}
		System.out.println("전교생 총점 : " + sum);
		System.out.println("전교생 평균 : " + (sum / 10));
		System.out.println("1등 학생 번호 : " + isave);
		System.out.println("1등 학생 성적 : " + max);
		System.out.println("합격자 수 : " + passed);
		
	}

}
