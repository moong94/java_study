package array;

public class ArrayEx34 {

	public static void main(String[] args) {
		/*
		 * # ���� ���
		 * . ���� ������ �̸� ���
		 */

		String[] name = {"ȫ�浿", "�迵", "�ڹ�ŷ", "�κ�ö", "�ް���"};
		int[] score   = {    87,    42,    100,     11,     98};
		
		final int SIZE = 5;
		
		int idx = 0;
		int maxidx = 0;
		int maxscore = 0;
		int tmp = 0;
		String nametmp;
		
		while(idx < SIZE) {
			
			//�ʱⰪ ����
			maxscore = score[idx];
			
			for(int i = idx; i < SIZE; i++) {
				if(maxscore <= score[i]) {
					maxidx = i;
					maxscore = score[i];
				}
			}
			
			tmp = score[maxidx];
			score[maxidx] = score[idx];
			score[idx] = tmp;
			
			nametmp = name[maxidx];
			name[maxidx] = name[idx];
			name[idx] = nametmp;
			
			idx++;
		}
		//������ �Բ� ��� ���
		for(int i = 0; i < SIZE; i++) {
			System.out.println((i + 1) +"�� : " + name[i] + " ���� : " + score[i]);
		}

	}

}
