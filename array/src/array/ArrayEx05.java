package array;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		// �ε���            0   1   2   3   4
		int[] arr = {87, 11, 45, 98, 23};

		
		Scanner scan = new Scanner(System.in);
		
		// ����1) �ε����� �Է¹޾� ���� ���
		// ����1) �ε��� �Է� : 1	���� : 11��
		boolean opt = true;
		
		int index = 0;
		
		System.out.print("�ε��� �Է� : ");
		while(opt) {
			
			int inputnum = scan.nextInt();
			if(inputnum < 0 || inputnum > 5) {
				System.out.println("1~5������ ���� �Է�");
				System.out.print("�ε��� �Է� : ");
			}
			else {
				index = inputnum;
				opt =false;
			}
		}
		
		System.out.println(" ���� : " + arr[index] + "��");
		
		// ����2) ������ �Է¹޾� �ε��� ���
		// ����2) ���� �Է� : 11		�ε��� : 1
		System.out.println("���� �Է� : ");
		int score = scan.nextInt();
		
		int cnt=0;
		
		for(int i = 0; i < 5; i++) {
			if(score == arr[i]) {
				System.out.println("���ؽ� : " + i);
			}
			else {
				cnt++;
			}
		}
		if(cnt == 5) {
			System.out.println("�������� �ʴ� ����.");
		}
		
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
				
		// ����3) �й��� �Է¹޾� ���� ���
		// ����3) �й� �Է� : 1003	���� : 45��
		System.out.println("�й� �Է� : ");
		int sid = scan.nextInt();
		
		int cnt2 = 0;
		
		for(int i = 0; i < 5; i ++) {
			if(sid == hakbuns[i]) {
				System.out.println("���� : " + scores[i]);
			}
			else {
				cnt2++;
			}
		}
		if(cnt2 == 5) {
			System.out.println("�������� �ʴ� �й�.");
		}
		
		
	}

}
