package class_array_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Game2048{
	int game[][] = {
			{2,0,2,2},
			{0,0,0,2},
			{0,0,0,0},
			{0,2,0,0}
	};
	void print() {
		System.out.println("--------------------------");
		for(int i = 0; i < 4; i++) {			
			System.out.println(Arrays.toString(game[i]));			
		}
		System.out.println("--------------------------");
	}
	void randomNum() {
		Random ran = new Random();
		while(true) {
			int y = ran.nextInt(4);
			int x = ran.nextInt(4);
			if(game[y][x] == 0) {
				game[y][x] = 2;
				break;
			}
		}
	}
	boolean end() {
		int count = 0;
		for(int i = 0; i < 4; i++) {	
			for(int j = 0; j < 4; j++) {
				if(game[i][j] != 0) {
					count ++;					
				}
			}				
		}
		if(count == 16) {
			return true;
		}
		else {
			return false;
		}
	}
	
	void move(int dir) {		
		for(int i= 0; i < 4; i++) {		
			if(dir == 1) {
				int check = 0;
				for(int j = 0; j < 4; j++) {
					if(game[i][j] != 0 ) {
						game[i][check] = game[i][j];
						if(check != j) {
							game[i][j] = 0;
						}
						check += 1;
					}
				}
			}
			if(dir == 2) {
				int check = 3;
				int k = 3;
				for(int j = 0; j < 4; j++) {
					if(game[i][k] != 0 ) {
						game[i][check] = game[i][k];
						if(check != k) {
							game[i][k] = 0;
						}
						
						check -= 1;
					}
					k -= 1;
				}
			}
			
			if(dir == 3) {
				int check = 0;
				for(int j = 0; j < 4; j++) {
					if(game[j][i] != 0 ) {
						game[check][i] = game[j][i];
						if(check != j) {
							game[j][i] = 0;
						}
						check += 1;
					}
				}
			}
			if(dir == 4) {
				int check = 3;
				int k = 3;
				for(int j = 0; j < 4; j++) {
					if(game[k][i] != 0 ) {
						game[check][i] = game[k][i];
						if(check != k) {
							game[k][i] = 0;
						}
						
						check -= 1;
					}
					k -= 1;
				}
			}
		}				
	}
	void sum(int dir) {
		for(int i= 0; i < 4; i++) {		
			if(dir == 1) {			
				for(int j = 0; j < 3; j++) {
					if(game[i][j] == game[i][j+1]) {
						game[i][j] += game[i][j + 1];
						game[i][j + 1] = 0;
						j += 1;
					}
				}
			}
			if(dir == 2) {
				int k = 3;
				for(int j = 0; j < 3; j++) {
					if(game[i][k] == game[i][k-1]) {
						game[i][k] += game[i][k - 1];
						game[i][k - 1] = 0;
						j += 1;
					}
					k -= 1;
					
				}
			}
			if(dir == 3) {			
				for(int j = 0; j < 3; j++) {
					if(game[j][i] == game[j + 1][i]) {
						game[j][i] += game[j + 1][i];
						game[j + 1][i] = 0;
						j += 1;
					}
				}
			}
			if(dir == 4) {
				int k = 3;
				for(int j = 0; j < 3; j++) {
					if(game[k][i] == game[k - 1][i]) {
						game[k][i] += game[k - 1][i];
						game[k - 1][i] = 0;
						j += 1;
					}
					k -= 1;
				}
			}
		}			
	}
	void play() {
		Scanner scan = new Scanner(System.in);
		while(true) {	
			

			randomNum();			
			print();
			System.out.println("1) left 2)right 3)up 4)down");
			int dir = scan.nextInt();
			move(dir);
			sum(dir);
			move(dir);		
			if(end()) {
				System.out.println("게임오버");
				break;
			}
		}
	}
}

public class Class_Array_Test2 {

	public static void main(String[] args) {
		//2048
		Game2048 game= new Game2048();
		game.play();
		
	}

}
