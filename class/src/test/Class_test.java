package test;

import java.util.Scanner;

class Test{
	
	Scanner scan = new Scanner(System.in);
	
	String arr[][];
	String block[];
	
	int x;
	int y;
	
	int check = 0;
	
	void makeArr(String data) {
		String line[] = data.split("\n");
		this.arr = new String[line.length][line.length];
		
		for(int i = 0; i < this.arr.length; i++) {
			this.arr[i] = line[i].split(",");
		}
		
	}
	
	void makeBlockArr(String data) {
		this.block = data.split(",");
	}
	
	int input_x() {
		System.out.print("x좌표 입력 : ");
		int x = scan.nextInt();
		
		return x;
	}
	int input_y() {
		System.out.print("y좌표 입력 : ");
		int y = scan.nextInt();
		
		return y;
	}
	
	void arrange() {
		for(int i = 0; i < this.block.length; i++) {
			if(this.arr[y][x + i].equals("1")){
				this.check++;
			}
			this.arr[y][x + i] = this.block[i];
		}
	}
	
	void showMatrix(String arr[][]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	void showArray(String arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	void check() {
		if(this.check == 0) {
			showMatrix(this.arr);
		}
		else {
			System.out.println("복사할 수 없는 자리입니다.");
		}
	}
	
	void run(String data1, String data2) {
		//받은 데이터들을 배열로 변환
		makeArr(data1);
		makeBlockArr(data2);

		showMatrix(this.arr);
		
		System.out.print("BLOCK : ");
		showArray(this.block);
		System.out.println();
		//입력
		this.x = input_x();
		this.y = input_y();
		
		//블록을 데이터에 배치
		arrange();
		check();
		
	}
	
}


public class Class_test {

	public static void main(String[] args) {
		String data ="";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,1,1,1,1,1,1,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		
		String block = "";
		block += "2,2,2,2";
		
		// 좌표 y , x 를 입력받고 block 에 잇는 내용을 data 에 복사 
		// 예) 1, 1
		/*
		    "0,0,0,0,0,1,0,0,0,0\n";
			"0,2,2,2,2,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,1,1,1,1,1,1,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
		 */
		// 조건) 단 ! 만약에 2222가 1에 닿으면 "복사할수없는자리입니다" 출력 
		// 예) 2, 3 ==> 이자리는2222 의  3번째 자리가 1이기때문에 복사할수 없다.
		/*
	    "0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,2,2,2,2,0,0,0\n";  // 1을 지우므로 안되다. 
		"0,0,1,1,1,1,1,1,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,0,0,0,0,0\n";
	 */
		Test t = new Test();
		
		t.run(data, block);
		
	}

}
