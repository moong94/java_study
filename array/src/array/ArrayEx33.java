package array;

public class ArrayEx33 {

	public static void main(String[] args) {
		/*
		 * # �����ϱ�
		 * 1. �ε��� 0���� �������� �˻��Ѵ�.
		 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
		 * 3. �ε��� 1�����Ѵ�.
		 * 4. [1~3]�� ������ �ݺ��Ѵ�.
		 * ��)
		 * 10, 50, 30, 40, 80, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 30, 40, 10, 7
		 * 80, 50, 40, 30, 10, 7
		 */

		int[] score = {10, 50, 30, 40, 80, 7};
		
		final int SIZE = 6;
		
		int idx = 0;
		
		while(idx < SIZE) {
			int maxidx = 0;
			int max = 0;
			int tmp = 0;
			
			//�ʱⰪ ����
			max = score[idx];
			
			for(int i = idx; i < SIZE; i++) {	
				if(max <= score[i]) {
					max = score[i];
					maxidx = i;

				}
			}
			
			tmp = score[maxidx];
			score[maxidx] = score[idx];
			score[idx] = tmp;
	
			
			for(int i = 0; i < SIZE; i++) {
				System.out.print(score[i] + " ");
			}
			System.out.println();
			idx++;
			
			
		}
		

	}

}
