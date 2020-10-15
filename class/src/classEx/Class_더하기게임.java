package classEx;

import java.util.Scanner;
import java.util.Random;

class Ex15{
	int[] game = new int[6];
	int[] idx = new int[3];
	int[] myIdx = new int[3];	
	int total = 0;
}
public class Class_더하기게임 {

	public static void main(String[] args) {
		/*
		 * # 더하기 게임
		 * 1. 1부터 10 사이의 랜덤한 값을 중복 없이 game 배열에 6개 저장한다.
		 * 2. 0부터 5사이의 랜덤 값 3개를 중복 없이 선택해 그 수의 합을 출력한다. 
		 * 3. 사용자는 중복없이 3개의 인덱스를 골라 그 합을 맞추는 게임이다.
		 */
		
		Ex15 e = new Ex15();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		for(int i = 0; i < e.game.length; i++) {
			int random = ran.nextInt(10) + 1;
			e.game[i] = random;
			for(int j = 0; j < i; j++) {
				if(e.game[i] == e.game[j]) {
					i--;
				}
			}
		}
		for(int i = 0; i < e.idx.length; i++) {
			int random = ran.nextInt(6);
			e.idx[i] = random;
			for(int j = 0; j < i; j++) {
				if(e.idx[i] == e.idx[j]) {
					i--;
				}
			}
		}
		
		int sum = 0;
		
		for(int i = 0; i < e.idx.length; i++) {
			sum += e.game[e.idx[i]];
		}
		
		System.out.print("GAME : ");
		for(int i = 0; i < e.game.length; i++) {
			System.out.print(e.game[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("3개 숫자의 합 : " + sum);
		
		for(int i = 0; i < e.myIdx.length; i++) {
			System.out.print((i + 1) + "번째 입력 : ");
			int input = scan.nextInt();
			
			if(input < 0 || input > e.game.length - 1) {
				System.out.println("입력 오류");
				i--;
			}
			else {
				e.myIdx[i] = input;
			}
		}
		
		int cnt = 0;
		
		for(int i = 0; i < e.idx.length; i++) {
			for(int j = 0; j < e.myIdx.length; j++) {
				if(e.myIdx[j] == e.idx[i]) {
					cnt++;
				}
			}
		}
		if(cnt == 3) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		
		
		
	}

}
