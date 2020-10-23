package arraylist;

import java.util.ArrayList;

class Block{
	int x;
	int y;
}

class testEX{
	String map[][];
	int block[][];
	
	
	int block_count;
	
	void mapInit(String data) {
		
		String arr[];
		arr = data.split("\n");
		map = new String[arr.length][arr.length];
		for(int i = 0; i < arr.length; i++) {
			
			this.map[i] = arr[i].split(",");
		}
	}
	
	void print_map() {
		
		ArrayList<Block> arr = new ArrayList<Block>();
		Block b = new Block();
		for(int i = 0; i < this.map.length; i++) {
			for(int j = 0; j < this.map[i].length; j++) {
				System.out.print(map[i][j] + " ");
				if (map[i][j].equals("2")) {
					b.x = j;
					b.y = i;
					arr.add(b);
				}
			}
			System.out.println();
		}
		
	}
	
	void locate_block() {
		System.out.println(arr.get(0).x);
		System.out.println(arr.get(1).x);
		System.out.println(arr.get(2).x);
		System.out.println(arr.get(3).x);
		System.out.println(arr.get(4).x);
		System.out.println(arr.size());
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
		
		// ����   ==> "1)��  2)�� 3)�� 4)��" �� �Է��Ҷ����� �ش�������� �����ü�̵� 
		// ����) ==> 1�� ������������. 
		
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
		
		
		t.mapInit(data);
		t.print_map();
		t.locate_block();
		
	}

}
