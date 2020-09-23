package array;

import java.util.Random;

public class ArrayEx08 {

	public static void main(String[] args) {
		/*
		 * # OMRī��
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

		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		int score = 0;
		
		Random ran = new Random();
		
		for(int i = 0; i < 5; i++) {
			
			int num = ran.nextInt(5) + 1;
			hgd[i] = num;
		
			if(hgd[i] == answer[i]) {
				score += 20;
			}
		}
		System.out.print("answer = { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(answer[i] + " ");
		}
		System.out.println("}");
		
		System.out.print("hgd =    { ");
		for(int i = 0; i < 5; i++) {
			System.out.print(hgd[i] + " ");
		}
		System.out.println("}");

		System.out.print("����ǥ =    { ");
		for(int i = 0; i < 5; i++) {
			if(answer[i] == hgd[i]) {
				System.out.print("O ");
			}
			else
				System.out.print("X ");
		}
		System.out.println("}");
		
		System.out.println("���� = " + score + "��");
	}

}
