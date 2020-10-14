package classEx;

import java.util.Random;

class Ex06{
	int[] answer = {1, 3, 4, 2, 5};		// ������
	int[] hgd = new int[5];				// �л����
	
	int cnt = 0;						// ���� ���� ����
	int score = 0;						// ����
}

public class Class_OMR {

	public static void main(String[] args) {
		/*
		 * # OMRī�� : Ŭ���� + ����
		 * 1. �迭 answer�� ���蹮���� �������̴�.
		 * 2. �迭 hgd�� 1~5 ������ ���� ���� 5���� �����Ѵ�.
		 * 3. answer�� hgd ���� ���� ����ǥ�� ����Ѵ�.
		 * 4. �� ������ 20���̴�.
		 * ��)
		 * answer = {1, 3, 4, 2, 5}
		 * hgd    = {1, 1, 4, 4, 3}
		 * ����ǥ     = {O, X, O, X, X}
		 * ����        = 40��
		 */
		Ex06 omr = new Ex06();
		
		Random ran = new Random();
		
		System.out.print("answer \t= ");
		for(int i = 0; i < omr.answer.length; i++) {
			System.out.print(omr.answer[i] + " ");
		}
		System.out.println();
		
		System.out.print("hge \t= ");
		for(int i = 0 ; i < omr.hgd.length; i++) {
			omr.hgd[i] = ran.nextInt(5) + 1;
			System.out.print(omr.hgd[i] + " ");
		}
		System.out.println();
		
		
		System.out.print("����ǥ \t= ");
		for(int i = 0; i < omr.answer.length; i++) {
			if(omr.answer[i] == omr.hgd[i]) {
				System.out.print("O ");
				omr.cnt++;
			}
			else {
				System.out.print("X ");
			}
		}
		System.out.println();
		
		omr.score = omr.cnt * 20;
		System.out.println("���� \t= " + omr.score + "��");

	}

}
