package array;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};

		Scanner scan = new Scanner(System.in);
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.

		System.out.println("학번 입력 : ");
		int sid = scan.nextInt();
		
		int cnt = 0;
		
		for(int i = 0; i < 5; i ++) {
			if(sid == hakbuns[i]) {
				System.out.println("성적 : " + scores[i]);
			}
			else {
				cnt++;
			}
		}
		if(cnt == 5) {
			System.out.println("존재하지 않는 학번.");
		}
	}

}
