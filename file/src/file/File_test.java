package file;

public class File_test {

	public static void main(String[] args) {
		String [][] student = {
				{"aaa","신촌","1001"}, 
				{"bbb","강남","1002" },
				{"ccc" ,"대치", "1003"} ,
				{"ddd" , "강동","1004"}};
		String[][] score = {
				{"번호" ,"과목" , "점수"},
				{"1001" ,"국어","20"},
				{"1002" ,"국어","50"},
				{"1003" ,"국어","60"},
				{"1004" ,"국어","17"},
				{"1001" ,"수학","65"},
				{"1002" ,"수학","15"},
				{"1003" ,"수학","80"},
				{"1004" ,"수학","70"},
				{"1001" ,"영어","43"},
				{"1002" ,"영어","90"},
				{"1003" ,"영어","30"},
				{"1004" ,"영어","70"}
		};
		
		//학생 정보와 성적이 담긴 데이터 이다 
		//student ==> 1.id 2.주소 3.번호
		//score ==> 1.번호 2.국어 3.수학 4.영어 점수 이다 
		//문제1) 전체 성적이 1등인 학생 이름 출력 
		
		//id, 주소, 번호, 국어점수, 수학점수, 영어점수
		String sort[][] = new String[student.length][6];
		
		String number[] = new String[student.length];
		
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				sort[i][j] = student[i][j];
			}
		}
		
		for(int i = 0; i < student.length; i++) {
			number[i] = student[i][2];
		}
		
		for(int i = 1; i < score.length; i++) {
			for(int j = 0; j < number.length; j++) {
				if(number[j].equals(score[i][0]) && score[i][1].equals("국어")) {
					sort[j][3] = score[i][2];
				}
				else if(number[j].equals(score[i][0]) && score[i][1].equals("수학")) {
					sort[j][4] = score[i][2];
				}
				else if(number[j].equals(score[i][0]) && score[i][1].equals("영어")) {
					sort[j][5] = score[i][2];
				}
			}
		}
		
		for(int i = 0; i < sort.length; i++) {
			for(int j = 0; j < sort[i].length; j++) {
				System.out.print(sort[i][j] + "\t");
			}
			System.out.println();
		}
		
		int sum[] = new int[student.length];
		
		for(int i = 0; i < sum.length; i++) {
			for(int j = 3; j < sort[i].length; j++) {
				sum[i] += Integer.parseInt(sort[i][j]);
			}
		}
		
		int max = 0;
		int max_idx = -1;
		
		for(int i = 0; i < sum.length; i++){		
			if(max < sum[i]) {
				max = sum[i];
				max_idx = i;
			}
		}
		
		System.out.println("전체 성적이 1등인 학생 이름  : " + sort[max_idx][0]);
	}

}
