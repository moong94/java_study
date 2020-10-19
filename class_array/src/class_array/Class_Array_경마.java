package class_array;

import java.util.Random;

class Horse{
	String name = ""; int pos = 0; int rank =  0;
	boolean win = false;
}
class Racing{
	Random ran = new Random();
	int size = 4;
	Horse[] horses = new Horse[size];	
	int line = 20;
	int track [][] = new int[size][line];
	
	void run(){
		String names = "abcd";
		for(int i =0; i < size; i++) {
			horses[i] = new Horse();
			horses[i].name = names.charAt(i) + "";
		}		
		Play();	
		PrintHorse();
	}
	void PrintHorse() {		
		System.out.println();
		for(int i =0; i < size; i++) {
			for(int n = 0; n < line; n++) {
				if(horses[i].pos == n) {
					System.out.print("["+horses[i].name+"]");
				}else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
		
	}
	void Play() {
		boolean loop = true;
		int count = 0;
		while(loop) {
			PrintHorse();
			for(int i = 0; i < size; i++) {
				if(horses[i].win == true) 
					continue;
				
				int r = ran.nextInt(4) + 1;
				horses[i].pos += r;
				if(horses[i].pos >= 19) {
					horses[i].pos = 19;
					horses[i].rank = count + 1;
					horses[i].win = true;
					count += 1;
					if(count >= size) {
						loop = false;
						break;
					}
				}
			}		
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
		
	}
}

public class Class_Array_°æ¸¶ {

	public static void main(String[] args) {
		Racing race = new Racing();
        race.run();	
        
	}

}
