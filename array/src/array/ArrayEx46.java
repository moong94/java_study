package array;

import java.util.Random;

public class ArrayEx46 {

	public static void main(String[] args) {
		/*
		 * # ��÷���� 1��Ʈ
		 * 1. 3�� �������� 3�� �����ϸ� ��÷�����̴�.
		 * 2. �������� 5���� ������ �����ϵ�,
		 *    ��÷������ �� ���� �����ǵ��� �����Ѵ�.
		 */

		Random ran = new Random();
		
		int[][] lottoSet = new int[5][7];

		int checkcnt = 0;
		int turn = 1;
		int con = 0;
		
		while(checkcnt != 1) {
			
			checkcnt = 0;
			con = 0;
			int check = 0;
			
			for(int i = 0; i < lottoSet.length; i++) {
				
				for(int j = 0; j < lottoSet[i].length; j++) {
					int rannum = ran.nextInt(100);
					lottoSet[i][j] = rannum;
				}
			
				//3�ڸ� ���� 3
				for(int k = 0; k < lottoSet[i].length - 2; k++) {
					check = 0;
					for(int l = k; l < k + 3; l++) {
						if(lottoSet[i][l] == 3) {
							check++;
						}
					}
					if(check == 3) {
						con = i;
						checkcnt++;
						
					}
					
				}	
			}
			turn++;
		}
		
		//���
		for(int i = 0; i < lottoSet.length; i++) {
			for(int j = 0 ; j < lottoSet[i].length; j++) {
				System.out.print(lottoSet[i][j] + " ");
				
			}
			if(con == i) {
				System.out.print("   ��÷!   ");
			}
			System.out.println();
		}
		
		System.out.println(turn + "��");
		
	}

}
