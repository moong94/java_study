package array;

public class ArrayEx48 {

	public static void main(String[] args) {
		
		/*
		 * # 2�����迭[����]
		 * ���� : ��
		 * ���� : ���
		 * ���� : ���
		 * ö�� : ���
		 * ö�� : ���
		 */

		int jangCount = 5;
		
		
		String[][] jang = {
			{"ö��", "���"},
			{"����", "��"},
			{"ö��", "���"},
			{"����", "���"},
			{"����", "���"}
		};
		
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
		//�̸� ������ ����
		for(int i = 0; i < jang.length; i++) {
			int check = -1;
			for(int j = i + 1; j < jang.length; j++) {
				if(jang[i][0].compareTo(jang[j][0]) > 0) {
					
					check = j;
				}
				
			}
			if(check != -1) {
				String tmp[] = null;
			
				tmp = jang[i];
				jang[i] = jang[check];
				jang[check] = tmp;
			
			}
			
			
		}
		
		System.out.println();
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
		
		//item ����
		for(int i = 0; i < jang.length; i++) {
			int check = -1;
			for(int j = i + 1; j < jang.length; j++) {
				if(jang[i][1].compareTo(jang[j][1]) > 0) {
					
					check = j;
				}
				
			}
			if(check != -1) {
				String tmp[] = null;
			
				tmp = jang[i];
				jang[i] = jang[check];
				jang[check] = tmp;
			
			}
			
			
		}
		
		System.out.println();
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}

}
