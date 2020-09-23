package array;

public class ArrayEx07 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)

		int max = 0;
		int maxindex = -1;
		
		for(int i = 0; i < 5; i++) {
			if(scores[i] > max) {
				max = scores[i];
				maxindex = i;
			}
		}
		System.out.println(hakbuns[maxindex] + "번(" + max + "점)");
	}

}
