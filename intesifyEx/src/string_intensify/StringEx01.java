package string_intensify;

public class StringEx01 {

	public static void main(String[] args) {
		String [][] student = {
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} , 
				{"ddd" , "강동","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		
		int[] sum = new int[4];
		
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 1; j < score[i].length; j++) {
				sum[i] += Integer.parseInt(score[i][j]);
			}
		}
		
		int check = 0;
		int checkopt = -1;
		
		for(int i = 0; i < sum.length; i++) {
			if(check < sum[i]) {
				check = sum[i];
				checkopt = i;
			}
		}
		
		System.out.println("1등 학생 ID : " + student[checkopt][0]);
		
		
	}

}
