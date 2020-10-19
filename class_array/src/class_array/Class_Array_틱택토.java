package class_array;

import java.util.Scanner;

class Tic{
	int [] line = new int[3];
	void printLine() {
		for(int i = 0; i < 3; i++) {
			if(line[i] == 0) {
				System.out.print("[ ]");
			}else if(line[i] == 1) {
				System.out.print("[o]");
			}else if(line[i] == 2) {
				System.out.print("[x]");
			}
		}
		System.out.println();
	}
}

public class Class_Array_ƽ���� {

	public static void main(String[] args) {
		boolean run = true;
		
		Tic [] ticList = new Tic[3];
		for(int i = 0; i < ticList.length; i++) {
			ticList[i] = new Tic(); // ���ϸ��� �Ǽ�.
		}
		Scanner scan = new Scanner(System.in);
		
		int turn = 1;
		
		while(run) {
			for(int i = 0; i< ticList.length; i++) {
				ticList[i].printLine();
			}
			
			if(turn == 1) {
				System.out.println("p1 ����");
			}
			else if(turn == 2) {
				System.out.println("p2 ����");
			}
			System.out.println();
			System.out.println("y (0~2)�� �Է��ϼ��� >> ");
			int y = scan.nextInt();
			System.out.println("x (0~2)�� �Է��ϼ��� >> ");
			int x = scan.nextInt();
			if(turn == 1 && ticList[y].line[x] == 0) {
				ticList[y].line[x] = 1;
				turn = 2;
			}else if(turn == 2 && ticList[y].line[x] == 0){
				ticList[y].line[x] = 2;
				turn = 1;
			}
		}		
	}

}
