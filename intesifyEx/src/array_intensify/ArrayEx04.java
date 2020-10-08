package array_intensify;

public class ArrayEx04 {

	public static void main(String[] args) {
		/*
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		�� �迭���� �Ȱ��� ������ ������ ���� ���� ���ڿ� ���� ���� ���� ��  ������  ��� 
		��) ������ ������������ ==> 100
		��) ������ ���帹������ ==> 3
			
		���� ���� ���� ��� : 3 ===> 5�� 
		���� ���� ���� ��� : 100 ===> 1��
	 */
		int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		
		int [] count = new int[a.length];
		int count_length = 0;
		
		for(int i = 0; i < a.length; i++) {
			int check = 0;
			for(int j = 0; j < i; j++) {
				if(a[j] == a[i]) {
					check = 1;
					break;
				}
			}
			if(check == 0) {
				count[count_length] = a[i];
				count_length++;
			}
			
		}
	
		int[] count_count = new int[count_length];
		
		for(int i = 0; i < count_length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(count[i] == a[j]) {
					count_count[i]++;
				}
			}
		}
		
		int max = -1;
		int max_i = -1;
		int min = a.length;
		int min_i = -1;
		
		for(int i = 0; i < count_length; i++) {
			if(max < count_count[i]) {
				max = count_count[i];
				max_i = i;
			}
			if(min > count_count[i]) {
				min = count_count[i];
				min_i = i;
			}
		}
		
		System.out.println("���� ���� ���� ��� : " + count[max_i] + " ===> " + count_count[max_i] + "��");
		System.out.println("���� ���� ���� ��� : " + count[min_i] + " ===> " + count_count[min_i] + "��");
		
		
		
		
	}

}
