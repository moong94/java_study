package arraylist;

import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

class Node1to50 {
	int num;
	
	void printNode() {
		System.out.print(num + "\t");
	}
}

class Manager1to50 {
	Vector<Node1to50[]> nodeList;
	int data[][];
	int data_back[][];
	final int SIZE = 5;
	int init_num = 1;
	int count = 1;

	void dataInit() {
		data = new int[SIZE][SIZE];
		data_back = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				data[i][j] = this.init_num;
				// System.out.println(num);
				this.init_num += 1;
			}
		}
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				data_back[i][j] = this.init_num;
				// System.out.println(num);
				this.init_num += 1;
			}
		}
	}

	void dataShuffle() {
		Random ran = new Random();
		
		for(int i = 0; i < 1000; i++) {
			int ran_i = ran.nextInt(SIZE);
			int ran_j = ran.nextInt(SIZE);
			
			int tmp = data[0][0];
			data[0][0] = data[ran_i][ran_j];
			data[ran_i][ran_j] = tmp;
		}
		for(int i = 0; i < 1000; i++) {
			int ran_i = ran.nextInt(SIZE);
			int ran_j = ran.nextInt(SIZE);
			
			int tmp = data_back[0][0];
			data_back[0][0] = data_back[ran_i][ran_j];
			data_back[ran_i][ran_j] = tmp;
		}
		
	}

	void nodeInit() {
		nodeList = new Vector<>();

		for (int i = 0; i < SIZE; i++) {
			Node1to50[] temp = new Node1to50[SIZE];
			for (int j = 0; j < SIZE; j++) {
				Node1to50 node = new Node1to50();
				node.num = data[i][j];
				//System.out.println(node.num);
				//System.out.println(node);
				temp[j] = node;
				
			}
			nodeList.add(temp);
		}
	}

	void printNodeList() {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				nodeList.get(i)[j].printNode();
			}
			System.out.println();
		}
	}

	void init() {
		dataInit();
		dataShuffle();
		nodeInit();
		printNodeList();
	}
	
	void input_number() {
		Node1to50 node = new Node1to50();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("행 위치 입력 : ");
		int input_x = scan.nextInt();
		System.out.print("열 위치 입력 : ");
		int input_y = scan.nextInt();
		if(input_x < 0  || input_x > 4 || input_y < 0 || input_y > 4) {
			System.out.println("0~4까지의 숫자만 입력");
			return;
		}
		
		if(nodeList.get(input_y)[input_x].num == this.count) {
			this.count++;
			nodeList.get(input_y)[input_x].num = data_back[input_y][input_x];
			data_back[input_y][input_x] = 0;
		}
	}
	
	void run() {
		while(true) {
			input_number();
			printNodeList();
			if(this.count == 51) {
				System.out.println("게임종료");
				break;
			}
			
		}
	}

}

public class ArrayList_1to50 {

	public static void main(String[] args) {
		// 1to50 을만들어보세요
		Manager1to50 nm = new Manager1to50();
		nm.init();
		nm.run();
	}

}
