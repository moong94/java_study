package array_test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// ����1)  �ε���(���ȣ)�� �Է��ϸ� �����
		int a[] = { 10,20,30,40,50 };
		// ��) 3 ==> 40
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ε��� �Է� : ");
		int idx = scan.nextInt();
		
		System.out.println(a[idx])
		;

		// ����2) �Ʒ��迭�� ����ū�� ��� 
		int b[] = { 12,54,23,87,1 };
		// ��) 87
		
		int max = 0;
		
		for(int i = 0; i < b.length - 1; i++) {
			if(b[i] > b[i + 1]) {
				max = b[i];
			}
		}
		System.out.println(max);
		

		// ����3) �Ʒ� �迭�� Ȧ���� ���� ��� 
		int c[] = { 12,54,23,87,1 };
		// ��) Ȧ���� ���� : 3
		
		int cnt = 0;
		
		for(int i = 0; i < c.length; i++) {
			if(c[i] % 2 == 1) {
				cnt++;
			}
		}
		
		System.out.println("Ȧ���� ���� : " + cnt);


		// ����4) �Ʒ��迭�� �Ųٷ� ���� 
		int d[] = { 1,2,3,4,5 };
		int e[] = { 0,0,0,0,0 };
		//��) e[5] = {5,4,3,2,1};
		
		int elen = e.length;
		
		for(int i = 0; i < d.length; i++) {
			e[elen - 1] = d[i];
			elen--;
		}
		
		for(int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}

	}

}
