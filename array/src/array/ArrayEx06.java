package array;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};

		Scanner scan = new Scanner(System.in);
		
		// ����) �й��� �Է¹޾� ���� ���
		// 		��, �����й� �Է� �� ����ó��
		// ��)
		// �й� �Է� : 1002		���� : 11��
		// �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�.

		System.out.println("�й� �Է� : ");
		int sid = scan.nextInt();
		
		int cnt = 0;
		
		for(int i = 0; i < 5; i ++) {
			if(sid == hakbuns[i]) {
				System.out.println("���� : " + scores[i]);
			}
			else {
				cnt++;
			}
		}
		if(cnt == 5) {
			System.out.println("�������� �ʴ� �й�.");
		}
	}

}
