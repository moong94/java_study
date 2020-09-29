package array_test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		//문제1) 1~백만 사이의 숫자를 입력받고 가운데 숫자 출력 
        //(단 ! 짝수자리의 수는 짝수자리라고 출력)
		// 예)  123 ==> 2
		// 예)  1234 ==> 짝수의 자리이다
		// 예)  1 ==> 1
		// 예)  1234567 ==> 4
		
		// 힌트 자리수를 구하고 배열을 만든다음 하나씩 저장 
		// 예) ==> 123 ==> 3 ==> arr[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = scan.nextInt();
		
		int inputtest = input;
		int cnt = 1;
		
		while(inputtest / 10 != 0) {
			inputtest /= 10;
			cnt++;
		}
		
		int arr[] = new int[cnt];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input % 10;
			input /= 10;
		}
		
		if(arr.length % 2 == 0) {
			System.out.println("짝수의 자리이다.");
		}
		else {
			System.out.println(arr[arr.length / 2]);
		}
	}

}
