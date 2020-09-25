package array;

public class ArrayEx31 {

	public static void main(String[] args) {
		
		int test1[] = {1,2,3,2,1};		
		int test2[] = {1,3,4,4,2};
		int test3[] = {1,1,1,2,1};
		// 위 배열에서 중복안된숫자를 제거하시요 
		// 1) {1,2,2,1}
		// 2) {4,4}
		// 3) {1,1,1,1}

		int cnt = 0;
		//test1
		for(int i = 0; i < test1.length; i++) {
			cnt = 0;
			for(int j = 0; j < test1.length; j++) {
				if(test1[i] == test1[j] && test1[i] !=0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				for(int k = i; k < (test1.length - 1); k++) {
					test1[k] = test1[k + 1];
				}
				test1[test1.length - 1] = 0;
				i--;
			}
		}
		
		for(int i = 0; i < test1.length; i++) {
			if(test1[i] == 0) {
				continue;
			}
			System.out.print(test1[i] + " ");
		}
		System.out.println();
		
		//test2
		for(int i = 0; i < test2.length; i++) {
			cnt = 0;
			for(int j = 0; j < test2.length; j++) {
				if(test2[i] == test2[j] && test2[i] !=0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				for(int k = i; k < (test2.length - 1); k++) {
					test2[k] = test2[k + 1];
				}
				test2[test2.length - 1] = 0;
				i--;
			}
		}
		
		for(int i = 0; i < test2.length; i++) {
			if(test2[i] == 0) {
				continue;
			}
			System.out.print(test2[i] + " ");
		}
		System.out.println();
		
		//test3
		for(int i = 0; i < test3.length; i++) {
			cnt = 0;
			for(int j = 0; j < test3.length; j++) {
				if(test3[i] == test3[j] && test3[i] !=0) {
					cnt++;
				}
			}
			if(cnt == 1) {
				for(int k = i; k < (test3.length - 1); k++) {
					test3[k] = test3[k + 1];
				}
				test3[test3.length - 1] = 0;
				i--;
			}
		}
		
		for(int i = 0; i < test3.length; i++) {
			if(test3[i] == 0) {
				continue;
			}
			System.out.print(test3[i] + " ");
		}
		
	}

}
