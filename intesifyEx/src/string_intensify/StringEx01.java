package string_intensify;

public class StringEx01 {

	public static void main(String[] args) {
		String [][] student = {
				{"aaa","����","1001"}, 
				{"bbb","����","1002" },
				{"ccc" ,"��ġ", "1003"} , 
				{"ddd" , "����","1004"}};
		String[][] score = {
				{"1001" ,"100" ,"20" , "30"},
				{"1002" ,"10" ,"60" , "60"},
				{"1003" ,"23" ,"63" , "31"},
				{"1004" ,"45" ,"30" , "35"},
		};
		
		int[] sum = new int[4];
		
		//�л� ������ ������ ��� ������ �̴� 
		//student ==> 1.id 2.�ּ� 3.��ȣ
		//score ==> 1.��ȣ 2.���� 3.���� 4.���� ���� �̴� 
		//����1) ��ü ������ 1���� �л� �̸� ���
		
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
		
		System.out.println("1�� �л� ID : " + student[checkopt][0]);
		
		
	}

}
