package whileex;

public class WhileEx12 {

	public static void main(String[] args) {
		/*
		 * # 369게임[2단계]
		 * 1. 1~50까지 반복을 한다.
		 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
		 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
		 */
		int game = 1;
		while(game <= 50) {
			if(game % 10 == 3 || game % 10 == 6 || game % 10 == 9) {
				System.out.print("짝");
				if(game / 10 == 3 || game / 10 == 6 || game / 10 == 9) {
					System.out.print("짝");
				}
			}
			else if(game / 10 == 3 || game / 10 == 6 || game / 10 == 9) {
				System.out.print("짝");
			}
			else {
				System.out.print(game);
			}
			System.out.print(" ");
			game++;
		}
	}

}
