package array_test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		int a[] = { 10, 4, 5, 3, 1 };
		// 문제 1) 위  배열를 이용해서  전체 합출력 ==> int a[5] = { 10, 4, 5, 3, 1 };
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		// 문제 2) 다음 리스트를 값을 입력하면 번호 출력 ==> int a[5] = { 10, 4, 5, 3, 1 };
		// 예) 5 ==> 2
		Scanner scan = new Scanner(System.in);
		
		System.out.print("값 입력 : ");
		int inputvalue = scan.nextInt();
		
		int check = -1;
		
		for(int i = 0; i < a.length; i++) {
			if(inputvalue == a[i]) {
				check = i;
			}
		}
		System.out.println(check);
		
		// 문제 3) 다음 리스트를 이용해서 a 의 값중 홀수만 b 에 저장(위치는 동일한위치에 저장)
		// 예) b = [0, 0, 5, 3, 1]
		int b[] = { 0,0,0,0,0, };

		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 1) {
				b[i] = a[i];
			}
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		// 문제 4) 다음 리스트를 이용해서 a 의 값중 홀수만 c 에 저장(위치는 앞에서 부터  저장)
	    // 3번문제와 조금 다름
		// 예) c = [5, 3, 1, 0, 0]
		int c[] = { 0,0,0,0,0 };
		
		int cnt = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 1) {
				c[cnt] = a[i];
				cnt++;
			}
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

	}

}
