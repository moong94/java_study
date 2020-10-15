package methodEx;

import java.util.Scanner;
import java.util.Random;

class Test3 {
	void scoreSave(int scores[]){
		Random ran = new Random();
		
		for(int i = 0 ; i < scores.length; i++) {
			int randomNum = ran.nextInt(100) + 1;
			scores[i] = randomNum;
			System.out.print(scores[i] + " ");
		}
	}
	
	void scoreSum(int scores[]) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.print("���� : " + sum);
	}
	
	void scoreAvg(int scores[]) {
		double sum = 0;
		double avg;
		for(int i = 0; i < scores.length; i++) {
			sum += (double)scores[i];
		}
		avg = sum / scores.length;
		System.out.print("��� : " + avg);
	}
	
	void scoresPass(int scores[]) {
		int passCount = 0;
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] >= 60) {
				passCount++;
			}
		}
		System.out.println("�հ��� �� : " + passCount);
	}
	
	void IndextoScores(int scores[], int idx) {
		System.out.println("���� : " + scores[idx]);
	}
	
	void ScorestoIndex(int scores[], int input) {
		int check = -1;
		
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == input) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("�����Է� ����");
		}
		else {
			System.out.println("�ε��� : " + check);
		}
	}
	
	void HakbuntoScore(int hakbuns[], int scores[]) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean opt = true;
		while(opt) {
			
			System.out.print("�й� �Է� : ");
			int inputHakbun = scan.nextInt();
			
			int check = -1;
		
			for(int i = 0; i < hakbuns.length; i++) {
				if(hakbuns[i] == inputHakbun) {
					check = i;
				}
			}
		
			if(check == -1) {
				System.out.println("���� �й��Դϴ�.");
				opt = false;
			}
	
			else {
				System.out.println("���� : " + scores[check]);
			}
		
		}
	}
	
	void first(int hakbuns[], int scores[]) {
		int max = 0;
		int maxIdx = -1;
		
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				maxIdx = i;
			}
		}
		System.out.println("1�� �л� : " + hakbuns[maxIdx] + "(" + scores[maxIdx] + "��)");
		
	}

}

public class MethodEx03 {

	public static void main(String[] args) {
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = new int[5];

		Test3 test = new Test3();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		// ����1) scores�迭�� 1~100�� ������ ���� ������ 5�� ����
		// �� 1) 87, 11, 92, 14, 47
		test.scoreSave(scores);
		System.out.println();
			
		// ����2) �������� ������ ��� ���
		// �� 2) ����(251) ���(50.2)
		test.scoreSum(scores);
		test.scoreAvg(scores);
		System.out.println();

		// ����3) ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		// �� 3) 2��
		test.scoresPass(scores);

		// ����4) �ε����� �Է¹޾� ���� ���
		// ����4) �ε��� �Է� : 1 ���� : 11��
		
		System.out.print("�ε��� �Է� : ");
		int inputIdx = scan.nextInt();
		
		test.IndextoScores(scores, inputIdx);

		// ����5) ������ �Է¹޾� �ε��� ���
		// ����5) ���� �Է� : 11 �ε��� : 1

		System.out.print("���� �Է� : ");
		int inputScore = scan.nextInt();
		
		test.ScorestoIndex(scores, inputScore);
		
		// ����6) �й��� �Է¹޾� ���� ���
		// ����6) �й� �Է� : 1003 ���� : 45��
		
		test.HakbuntoScore(hakbuns, scores);
		
		
		// ����7) �й��� �Է¹޾� ���� ���
		// ��, �����й� �Է� �� ����ó��
		// �� 7)
		// �й� �Է� : 1002 ���� : 11��
		// �й� �Է� : 1000 �ش��й��� �������� �ʽ��ϴ�.
		
		test.HakbuntoScore(hakbuns, scores);

		// ����8) 1���л��� �й��� ���� ���
		// ����8) 1004��(98��)
		
		test.first(hakbuns, scores);
		
		
		
	}

}
