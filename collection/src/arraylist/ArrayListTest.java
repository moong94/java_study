package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

class Block{
	int x;
	int y;
	Block(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class testEX{
	String map[][];
	int block[][] = new int[5][5];
	int obstacle[][] = new int[8][8];
	
	void mapInit(String data) {
		
		String arr[];
		arr = data.split("\n");
		map = new String[arr.length][arr.length];
		for(int i = 0; i < arr.length; i++) {
			
			this.map[i] = arr[i].split(",");
		}
	}
	
	void print_map() {
		int point = 0;
		int obstacle_point = 0;
		
		for(int i = 0; i < this.map.length; i++) {
			for(int j = 0; j < this.map[i].length; j++) {
				System.out.print(map[i][j] + " ");
				if (map[i][j].equals("2")) {
					block[point][0] = i;		//y
					block[point][1] = j;		//x
					
					map[i][j] = "0";
					
					point++;
				}
				else if(map[i][j].equals("1")) {
					obstacle[obstacle_point][0] = i;
					obstacle[obstacle_point][1] = j;
					
					obstacle_point++;
				}
			}
			System.out.println();
		}
		
	}
	
	void re_mapInit() {
		for(int i = 0; i < this.map.length; i++) {
			for(int j = 0; j < this.map[i].length; j++) {
				for(int k = 0; k < 5; k++) {
					map[block[k][0]][block[k][1]] = "2";
				}
			}
		}
	}
	
	int return_x(int i) {
		return block[i][0];
		
	}
	int return_y(int i) {
		return block[i][1];
		
	}
	
	void up() {
		for(int i = 0; i < 5; i++) {
			block[i][0]--;
		}
	}
	
	void down() {
		for(int i = 0; i < 5; i++) {
			block[i][0]++;
		}
	}
	
	void left() {
		for(int i = 0; i < 5; i++) {
			block[i][1]--;
		}
	}
	
	void right() {
		for(int i = 0; i < 5; i++) {
			block[i][1]++;
		}
	}
	int check() {
		int check = -1;
		for(int i = 0; i < 5; i++) {
			if(block[i][0] == -1 || block[i][0] == 10 || block[i][1] == -1 || block[i][1] == 10) {
				return 1;
			}
			for(int j = 0; j < 8; j++) {
				if(block[i][0] == obstacle[j][0] && block[i][1] == obstacle[j][1]) {
					return 1;
				}
				
			}
		}
		
		return 0;
	}
	
}
public class ArrayListTest {

	public static void main(String[] args) {
		String data ="";
		data += "2,0,0,0,0,1,0,0,0,0\n";
		data += "2,0,0,0,0,1,0,0,0,0\n";
		data += "2,2,2,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,1,0,0,0,0\n";
		data += "0,0,0,0,0,0,0,0,0,0\n";
		
		System.out.println(data);
		
		String block = "";
		block += "2,0,0\n";
		block += "2,0,0\n";
		block += "2,2,2\n";

		System.out.println(block);
		
		// 문제   ==> "1)상  2)하 3)좌 4)우" 를 입력할때마다 해당방향으로 블록전체이동 
		// 조건) ==> 1은 지나갈수없다. 
		
		/*
		    "2,0,0,0,0,1,0,0,0,0\n";
			"2,0,0,0,0,1,0,0,0,0\n";
			"2,2,2,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,1,0,0,0,0\n";
			"0,0,0,0,0,0,0,0,0,0\n";
		 */
		
		testEX t = new testEX();
		ArrayList<Block> list = new ArrayList<Block>();
		Scanner scan = new Scanner(System.in);
		
		t.mapInit(data);
		
		
		int tmp[][] = new int[5][5];
		for(int i = 0; i < 5; i++) {
			tmp[i][0] = t.return_x(i);
			tmp[i][1] = t.return_y(i);
			
			list.add(new Block(tmp[i][0], tmp[i][1]));
		}
		
		while(true) {
			
			t.print_map();
			System.out.print("1)상  2)하 3)좌 4)우 : ");
			int select = scan.nextInt();
			
			if(select < 1 || select > 4) {
				System.out.println("입력 오류");
				continue;
			}
			if(select == 1) {
				t.up();
				int c = t.check();
				if(c == 1) {
					System.out.println("이동할 수 없습니다.");
					t.down();
				}
			}
			else if(select == 2) {
				t.down();
				int c = t.check();
				if(c == 1) {
					System.out.println("이동할 수 없습니다.");
					t.up();
				}
			}
			else if(select == 3) {
				t.left();
				int c = t.check();
				if(c == 1) {
					System.out.println("이동할 수 없습니다.");
					t.right();
				}
			}
			else if(select == 4) {
				t.right();
				int c = t.check();
				if(c == 1) {
					System.out.println("이동할 수 없습니다.");
					t.left();
				}
			}
			
			t.re_mapInit();
			
		}
	}

}
