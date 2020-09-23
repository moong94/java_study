package whileex;

public class WhileEx12 {

	public static void main(String[] args) {
		/*
		 * # 369����[2�ܰ�]
		 * 1. 1~50���� �ݺ��� �Ѵ�.
		 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
		 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
		 */
		int game = 1;
		while(game <= 50) {
			if(game % 10 == 3 || game % 10 == 6 || game % 10 == 9) {
				System.out.print("¦");
				if(game / 10 == 3 || game / 10 == 6 || game / 10 == 9) {
					System.out.print("¦");
				}
			}
			else if(game / 10 == 3 || game / 10 == 6 || game / 10 == 9) {
				System.out.print("¦");
			}
			else {
				System.out.print(game);
			}
			System.out.print(" ");
			game++;
		}
	}

}
