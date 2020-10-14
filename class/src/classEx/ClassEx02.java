package classEx;

import java.util.Scanner;

class Ex04 {
	int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
	int[] scores = new int[5];
}


public class ClassEx02 {

	public static void main(String[] args) {

		Ex04 e = new Ex04();
		// ����1) scores�迭�� 1~100�� ������ ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47

		e.scores[0] = 87;
		e.scores[1] = 11;
		e.scores[2] = 92;
		e.scores[3] = 14;
		e.scores[4] = 47;
		
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)

		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < e.scores.length; i++) {
			sum += e.scores[i];
		}
		avg = sum / (double)e.scores.length;
		System.out.println("���� (" + sum + ") ���(" + avg + ")");
		
		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		
		int count = 0;
		for(int i = 0; i < e.scores.length; i++) {
			if(e.scores[i] >= 60) {
				count++;
			}
		}
		
		System.out.println(count + "��");
		
		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��

		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ε��� �Է� : ");
		int input_idx = scan.nextInt();
		
		System.out.println("���� : " + e.scores[input_idx] + "��");
		
		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1

		System.out.print("���� �Է� : ");
		int input_score = scan.nextInt();
		
		int idx = -1;
		for(int i = 0; i < e.scores.length; i++) {
			if(e.scores[i] == input_score) {
				idx = i;
			}
		}
		System.out.println("�ε��� : " + idx);
		
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 92��

		System.out.print("�й� �Է� : ");
		int input_id = scan.nextInt();
		
		idx = -1;
		for(int i = 0; i < e.hakbuns.length; i++) {
			if(e.hakbuns[i] == input_id) {
				idx = i;
			}
		}
		System.out.println("���� : " + e.scores[idx]);
		
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		
		System.out.print("�й� �Է� : ");
		input_id = scan.nextInt();
		
		idx = -1;
		for(int i = 0; i < e.hakbuns.length; i++) {
			if(e.hakbuns[i] == input_id) {
				idx = i;
			}
		}
		if(idx == -1) {
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
			
		}
		else{
			System.out.println("���� : " + e.scores[idx]);
		}
		
		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1003��(92��)
		
		int max = 0;
		int maxidx = -1;
		
		for(int i = 0; i < e.scores.length; i++) {
			if(max < e.scores[i]) {
				max = e.scores[i];
				maxidx = i;
			}
		}
		
		System.out.println(e.hakbuns[maxidx] + "��(" + max +"��)");
		


	}

}
