package array;

public class ArrayEx01 {


/*
 * # 배열(array)
 * 1. "같은 종류"의 데이터를 "여러개" 저장하기 위한 기술
 * 2. 사용법
 * 		int num = 10;
 * 		int[] arr = new int[방의 개수];
 * 		int arr[] = new int[방의 개수];
 * 3. 인덱스(index)
 * 		0부터 시작하는 방번호(index)가 부여된다.
 * 4. 주소 변수
 */
	public static void main(String[] args) {
		// 1.일반변수(값 저장)
				int num = 0;
				num = 10;
				System.out.println("num = " + num);
				
				// 2.주소변수(주소 저장)
				int[] arr = null;						// null(주소가 없음)
				arr = new int[5];
				System.out.println("arr = " + arr);		// [I@15db9742
				
				System.out.println(arr[0]);				// 0
				System.out.println(arr[1]);				// 0
				System.out.println(arr[2]);				// 0
				System.out.println(arr[3]);				// 0
				System.out.println(arr[4]);				// 0
				System.out.println();
				
				// java.lang.ArrayIndexOutOfBoundsException: 5
				// System.out.println(arr[5]);
				
				arr[0] = 10;
				arr[1] = 20;
				arr[2] = 30;
				arr[3] = 40;
				arr[4] = 50;
				
				for(int i=0; i<5; i++) {
					System.out.println(arr[i]);
				}
				System.out.println();

	}

}
