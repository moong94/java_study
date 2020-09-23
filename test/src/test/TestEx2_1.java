package test;

public class TestEx2_1 {

	public static void main(String[] args) {
//		# 문제2)  9의 배수중 십의 자리가 6인 첫번째 배수 출력
//		# 답 : 63

		int i = 0;
		while(true) {
			if((i % 9 == 0) && (i / 10 == 6)) {
				break;
			}
			i++;
		}
		System.out.println(i);
		
		
//		# 문제3) 8로 나누면 5가 남는수 중 150보다 적은수중에 에 가장 가까운수를 구하시요
//		# 답 149
		
		int j = 150;
		while(true) {
			if(j % 8 == 5) {
				break;
			}
			j--;
		}
		System.out.println(j);
		
		
//		# 문제4) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
//		# 답 6 (54,63,72,81,90,99)
		
		int cnt = 0;
				
		for(int k = 50; k <= 100; k++) {
			if(k % 9 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
//		# 문제5) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
//		# 답 980
		
		int num = 0;
		
		for(int l = 1000; l >= 100; l--) {
			if(l % 28 == 0) {
				num = l;
				break;
			}
		}
		System.out.println(num);
		
//	# 문제6) 8의 배수를 작은수부터 5개 출력
//	# 답 : 0,8,16,24,32
		
		int cnt2 = 0;
		int m = 0;
		
		while(cnt2 < 5) {
			if(m % 8 == 0) {
				System.out.print(m + ", ");
				cnt2++;
			}
			m++;
		}
		
		
		
		
		
	}

}
