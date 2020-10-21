package arraylist;

import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

class Manager1to50Ver2{
	Vector<Vector<Node1to50>> nodeList;
	int data[][];
	int data_back[][];
	int init_num = 1;
	int count = 1;
	
	final int SIZE = 5;
	void dataInit() {
		data = new int[SIZE][SIZE];
		for(int i = 0;  i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				data[i][j] = this.init_num;
				this.init_num += 1;
			}
		}
		
		data_back = new int[SIZE][SIZE];
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				data_back[i][j] = this.init_num;
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
		
		for(int i = 0; i < SIZE; i++) {
			Vector<Node1to50> temp = new Vector<>();
			for(int j = 0; j < SIZE; j++) {
				Node1to50 node = new Node1to50();
				node.num = data[i][j];
				temp.add(node);
			}
			nodeList.add(temp);

		}		
	}
	
	void printNodeList() {
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				nodeList.get(i).get(j).printNode();
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
		if(nodeList.get(input_y).get(input_x).num == this.count) {
			this.count++;
			nodeList.get(input_y).get(input_x).num = data_back[input_y][input_x];
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


public class ArrayList_1to50Ver2 {

	public static void main(String[] args) {
		// 1to50 을만들어보세요
		Manager1to50Ver2 nm = new Manager1to50Ver2();
		nm.init();
		nm.run();
	}

}
