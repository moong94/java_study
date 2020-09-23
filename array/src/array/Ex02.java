package array;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int arr[] = {1001, 20, 1002, 45, 1003, 54};
		// 학번과 점수가 한쌍이다 1001:20 , 1002:45  , 1003:54
		
		Scanner scan =new Scanner(System.in);
		
		// 문제1) 학번을 입력하면 점수 출력 
		System.out.print("학번 입력 : ");
		int num = scan.nextInt();
		
		for(int i = 0; i < 6; i++) {
			if(arr[i] == num) {
				System.out.println(arr[i + 1]);
			}
		}		
		
		// 문제2) 점수를 입력하면 학번 출력 
		System.out.print("점수 입력 : ");
		int num2 = scan.nextInt();
		
		for(int i = 0; i < 6; i++) {
			if(arr[i] == num2) {
				System.out.println(arr[i - 1]);
			}
		}		

		int score[] = {1001, 20,43 , 1002 , 54,2 , 1003,76,6};
		
		// 학번과 국어 수학 점수이다 
		// 예) 1001 == (20 , 43)
		//    1002 == (54 , 2)
		//    1003 == (76 , 6)
		// 문제3)  점수의 합을 입력하면 번호 출력 
		// 예)  63 ==> 1001 
		// 예)  56 ==> 1002
		// 예)  82 ==> 1003
		System.out.print("점수의 합 입력 : ");
		int sum = scan.nextInt();
		
		for(int i = 0; i < 3; i++) {
			if(score[i+1] + score[i+2] == sum) {
				System.out.println("학번 : " + score[i]);
			}
		}
		

	}

}
