package array_test;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// ���� 1) �Ʒ� �迭 a ���� ���� �Է��� ���� ���� b �� ���� 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// ��) 30 ==> b[5] = {10,20,40,50,0};

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		int input = scan.nextInt();
		
		int j = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(input == a[i]) {
				continue;
			}	
			b[j] = a[i];
			j++;
		}
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		
		// ���� 2) �Ʒ� �迭���� ���� �Է��� ��ȣ �� ���� d �� ���� 
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// ��) 1002 ==> d[6] = {1001, 40, 1003, 70 , 0, 0};

		System.out.print("��ȣ �Է� : ");
		int inputnum = scan.nextInt();
		int check = -1;
		int k = 0;
		
		for(int i = 0; i < c.length; i++) {
			if(i % 2 == 0) {
				if(inputnum == c[i]) {
					i += 2;
				}
			}
			d[k] = c[i];
			k++;
		}
		
		for(int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
	}

}
