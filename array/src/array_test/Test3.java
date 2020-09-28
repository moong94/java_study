package array_test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 문제 1) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int a[] = { 10,20,30,40,50 };
		// 예)  60 ==> a[5] = {20,30,40,50,60};

		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = scan.nextInt();
		
		for(int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		a[a.length - 1] = input;
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		// 문제 2) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int b[] = { 10,20,30,40,50 };
		// 예) 60 ==> b[5] = {60,10,20,30,40};
		
		int tmp[] = null;
		
		tmp = b;
		b = new int[b.length];
		
		System.out.print("입력 : ");
		int input2 = scan.nextInt();
		
		for(int i = 1; i < b.length; i++) {
			b[i] = tmp[i - 1];
		}
		b[0] = input2;
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
	}

}
