package whileex;

public class WhileEx03 {

	public static void main(String[] args) {

		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		int i = 1;
		int sum = 0;
		while(i <= 5) {
			sum += i;
			i += 1;
		}
		System.out.println(sum);
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		int j = 1;
		while(j <= 10) {
			if(j < 3 || j >=7) {
				System.out.print(j + ", ");
			}
			j += 1;
		}
		System.out.println();
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		j = 1;
		sum = 0;
		while(j <= 10) {
			if(j < 3 || j >=7) {
				sum += j;
			}
			j += 1;
		}
		System.out.println(sum);
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		j = 1;
		int cnt = 1;
		while(j <= 10) {
			if(j < 3 || j >=7) {
				cnt += 1;
			}
			j += 1;
		}
		System.out.println(cnt);

		
	}

}
