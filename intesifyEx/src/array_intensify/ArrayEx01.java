package array_intensify;

public class ArrayEx01 {

	public static void main(String[] args) {
		/*
		 * # 2차원 반복문
		 * 1   2  3  4  5
		 * 10  9  8  7  6
		 * 11 12 13 14 15
		 * 20 19 18 17 16
		 * 21 22 23 24 25
		 */
		int num = 1;
	
		int [][] arr = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 1) {
				for(int j = 4; j >= 0; j--) {
					arr[i][j] = num;
					num++;
				}
			}
			else {
				for(int k = 0; k < 5; k++) {
					arr[i][k] = num;
					num++;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
