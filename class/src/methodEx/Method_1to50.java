package methodEx;

import java.util.Scanner;
import java.util.Random;

class SpeedGame {

	Scanner scan = new Scanner(System.in);
	Random ran = new Random();

	int[][] front = new int[3][3];
	int[][] back = new int[3][3];

	int num = 1;

	// ���� �����ϱ�
	void setNumber() {
		int k = 1;
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				front[i][j] = k;
				k += 1;
			}
		}
		for (int i = 0; i < back.length; i++) {
			for (int j = 0; j < back[i].length; j++) {
				back[i][j] = k;
				k += 1;
			}
		}
	}

	// ī�� ����
	void suffleCard() {
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				int xR = ran.nextInt(front.length);
				int yR = ran.nextInt(front[i].length);

				int tmp = front[0][0];
				front[0][0] = front[xR][yR];
				front[xR][yR] = tmp;

				tmp = back[0][0];
				back[0][0] = back[xR][yR];
				back[xR][yR] = tmp;
			}
		}
	}

	// ȭ�� ����ϱ�
	void showCard() {
		for (int i = 0; i < front.length; i++) {
			for (int j = 0; j < front[i].length; j++) {
				System.out.print(front[i][j] + "\t");
			}
			System.out.println();
			System.out.println();
		}
	}

	// �Է¹ޱ�
	void selectCard() {
		System.out.print("x�Է� : ");
		int xIdx = scan.nextInt();
		System.out.print("y�Է� : ");
		int yIdx = scan.nextInt();
		if (num == front[xIdx][yIdx]) {
			if (num <= 9) {
				front[xIdx][yIdx] = back[xIdx][yIdx];
			} else {
				front[xIdx][yIdx] = 0;
			}
			num += 1;
		}
	}

	void run() {

		setNumber();
		suffleCard();

		while (true) {

			showCard();

			// �����ϱ�
			if (num == 19) {
				System.out.println("��������");
				break;
			}

			selectCard();
		}
	}
}

public class Method_1to50 {

	public static void main(String[] args) {
		SpeedGame sg = new SpeedGame();
		sg.run();
	}

}
