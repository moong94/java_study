package class_array;

import java.util.Random;

class RanNum{
	int num;
	boolean check;
}

public class Class_Array_�ߺ����� {

	public static void main(String[] args) {
		Random ran = new Random();
		
		// ����) RanNum Ŭ������ Ȱ���ؼ� �ߺ����ڱ��� ��� 
		//      num�� 1~5���̼��ڸ� �������� �����Ѵ�. (���� �ߺ����ڱ���)
		RanNum[] arr = new RanNum[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = new RanNum();
		}
		
		for(int i=0; i<5; i++) {
					
			int rNum = ran.nextInt(5);;
			if(arr[rNum].check == false) {
				arr[rNum].check = true;
				arr[rNum].num = i + 1;
			}
			else {
				i -= 1;
			}			
		}
		for(int i=0; i<5; i++) {
			System.out.print(arr[i].num + " ");
		}
	}

}
