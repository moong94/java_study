package file;

public class File_test {

	public static void main(String[] args) {
		String [][] student = {
				{"aaa","����","1001"}, 
				{"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} ,
				{"ddd" , "����","1004"}};
		String[][] score = {
				{"��ȣ" ,"����" , "����"},
				{"1001" ,"����","20"},
				{"1002" ,"����","50"},
				{"1003" ,"����","60"},
				{"1004" ,"����","17"},
				{"1001" ,"����","65"},
				{"1002" ,"����","15"},
				{"1003" ,"����","80"},
				{"1004" ,"����","70"},
				{"1001" ,"����","43"},
				{"1002" ,"����","90"},
				{"1003" ,"����","30"},
				{"1004" ,"����","70"}
		};
		
		//�л� ������ ������ ��� ������ �̴� 
		//student ==> 1.id 2.�ּ� 3.��ȣ
		//score ==> 1.��ȣ 2.���� 3.���� 4.���� ���� �̴� 
		//����1) ��ü ������ 1���� �л� �̸� ��� 
		
		//id, �ּ�, ��ȣ, ��������, ��������, ��������
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
				if(number[j].equals(score[i][0]) && score[i][1].equals("����")) {
					sort[j][3] = score[i][2];
				}
				else if(number[j].equals(score[i][0]) && score[i][1].equals("����")) {
					sort[j][4] = score[i][2];
				}
				else if(number[j].equals(score[i][0]) && score[i][1].equals("����")) {
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
		
		System.out.println("��ü ������ 1���� �л� �̸�  : " + sort[max_idx][0]);
	}

}
