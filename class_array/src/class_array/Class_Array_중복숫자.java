package class_array;

import java.util.Random;

class RanNum{
	int num;
	boolean check;
}

public class Class_Array_중복숫자 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		// 문제) RanNum 클래스를 활용해서 중복숫자금지 출력 
		//      num에 1~5사이숫자를 랜덤으로 저장한다. (조건 중복숫자금지)
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
