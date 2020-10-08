package array_intensify;

public class ArrayEx04 {

	public static void main(String[] args) {
		/*
	    int [] a = {1,1,3,3,3,100,2,2,3,1,3};
		위 배열에서 똑같은 숫자의 개수가 가장 적은 숫자와 가장 많은 숫자 의  개수를  출력 
		예) 개수가 가장적은숫자 ==> 100
		예) 개수가 가장많은숫자 ==> 3
			
		가장 많은 갯수 출력 : 3 ===> 5개 
		가장 적은 갯수 출력 : 100 ===> 1개
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
		
		System.out.println("가장 많은 갯수 출력 : " + count[max_i] + " ===> " + count_count[max_i] + "개");
		System.out.println("가장 적은 갯수 출력 : " + count[min_i] + " ===> " + count_count[min_i] + "개");
		
		
		
		
	}

}
