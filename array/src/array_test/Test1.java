package array_test;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		int a[] = { 10, 4, 5, 3, 1 };
		// ���� 1) ��  �迭�� �̿��ؼ�  ��ü ����� ==> int a[5] = { 10, 4, 5, 3, 1 };
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		// ���� 2) ���� ����Ʈ�� ���� �Է��ϸ� ��ȣ ��� ==> int a[5] = { 10, 4, 5, 3, 1 };
		// ��) 5 ==> 2
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�� �Է� : ");
		int inputvalue = scan.nextInt();
		
		int check = -1;
		
		for(int i = 0; i < a.length; i++) {
			if(inputvalue == a[i]) {
				check = i;
			}
		}
		System.out.println(check);
		
		// ���� 3) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
		// ��) b = [0, 0, 5, 3, 1]
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
		// ���� 4) ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����(��ġ�� �տ��� ����  ����)
	    // 3�������� ���� �ٸ�
		// ��) c = [5, 3, 1, 0, 0]
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
