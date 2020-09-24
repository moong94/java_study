package array;

public class ArrayEx38 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		System.out.println(arr[0]);		// [I@7852e922
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		System.out.println(arr[1]);		// [I@4e25154f
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;

		System.out.println(arr[2]);		// [I@70dea4e
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------");
		
		int[] temp = arr[1];
		for(int i=0; i<temp.length; i++) {
			System.out.print(temp[i] + " ");
		}	

	}

}
