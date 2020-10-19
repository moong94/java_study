package class_array;

import java.util.Scanner;

class Seat{
	boolean check;
	void showData() {
		if(check == true) {
			System.out.print("■ ");
		}
		else {
			System.out.print("□ ");
		}
	}
}

public class Class_Array_자리예매 {

	public static void main(String[] args) {
		boolean run = true;
		Seat [] seatList = new Seat[8];
		for(int i = 0; i < seatList.length; i++) {
			seatList[i] = new Seat(); 
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			for(int i = 0; i< seatList.length; i++) {
				seatList[i].showData();
			}
			System.out.println();
			System.out.println("번호를 입력하세요 >> ");
			int sel = scan.nextInt();
			if(seatList[sel].check == false) {
				seatList[sel].check = true;
			}
		}
	}

}
