package file;

import java.util.Random;

public class File_�渶���� {

	public static void main(String[] args) {
		// # �渶 ����
		// 5������ ���� �������� �ѹ��� �����Ÿ� �̵������ϴ� 
		// �̵��ѰŸ��� ���� 20�̻��̸� ���� 
		// ��� ��� 
		// ����) ��! ���õ��� ����ó��
		
		int horse[][] = new int[5][20];
		Random ran = new Random();
		int max = 20;
		int rank[] = new int[5];
		int total[] = new int[5];
		int count = 0;
		
		while(count < rank.length) {
			
			for(int i = 0; i < horse.length; i++) {
				int move = ran.nextInt(5);
				total[i] += move;
			}
			
			int ex = 0;
			int check = -1;
			
			for(int i = 0; i < total.length; i++) {
				if(total[i] >= max) {
					check = i;
					ex++;
				}
			}

			if(ex > 1) {
				count = 0;
				for(int i = 0; i < total.length; i++) {
					total[i] = 0;
				}
				continue;
			}
			
			else if(ex == 1) {
				rank[count] = check;
				count++;
			}
			
		}
		
		for(int i = 0; i < rank.length; i++) {
			System.out.println(rank[i]);
		}
		
		
	}

}
