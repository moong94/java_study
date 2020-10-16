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
		System.out.print("x��ǥ �Է� : ");
		int x = scan.nextInt();
		
		return x;
	}
	int input_y() {
		System.out.print("y��ǥ �Է� : ");
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
			System.out.println("������ �� ���� �ڸ��Դϴ�.");
		}
	}
	
	void run(String data1, String data2) {
		//���� �����͵��� �迭�� ��ȯ
		makeArr(data1);
		makeBlockArr(data2);

		showMatrix(this.arr);
		
		System.out.print("BLOCK : ");
		showArray(this.block);
		System.out.println();
		//�Է�
		this.x = input_x();
		this.y = input_y();
		
		//����� �����Ϳ� ��ġ
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
		
		// ��ǥ y , x �� �Է¹ް� block �� �մ� ������ data �� ���� 
		// ��) 1, 1
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
		// ����) �� ! ���࿡ 2222�� 1�� ������ "�����Ҽ������ڸ��Դϴ�" ��� 
		// ��) 2, 3 ==> ���ڸ���2222 ��  3��° �ڸ��� 1�̱⶧���� �����Ҽ� ����.
		/*
	    "0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,0,0,1,0,0,0,0\n";
		"0,0,0,2,2,2,2,0,0,0\n";  // 1�� ����Ƿ� �ȵǴ�. 
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
