package methodEx;

import java.util.Scanner;

class LadderGame {

	Scanner scan = new Scanner(System.in);

	int[][] ladder = { 
			{ 0, 0, 0, 0, 0 }, 
			{ 1, 2, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 1, 2, 0, 0 },
			{ 1, 2, 0, 0, 0 }, 
			{ 0, 0, 0, 1, 2 }, 
			{ 0, 0, 0, 0, 0 } 
	};

	int xIdx = 0;
	int yIdx = 0;

	String menu = "";

	// ��ٸ� ����ϱ�
	void showLadder() {
		System.out.println("  1  2  3  4  5");
		for (int i = 0; i < ladder.length; i++) {
			for (int j = 0; j < ladder[i].length; j++) {
				if (ladder[i][j] == 0) {
					if (xIdx == i && yIdx == j) {
						System.out.print("  *");
					} else {
						System.out.print("  ��");
					}
				} else if (ladder[i][j] == 1) {
					if (xIdx == i && yIdx == j) {
						System.out.print("  * ");
					} else {
						System.out.print("  ����");
					}
				} else if (ladder[i][j] == 2) {
					if (xIdx == i && yIdx == j) {
						System.out.print(" *");
					} else {
						System.out.print("����");
					}
				}
			}
			System.out.println();
		}
		System.out.println("��� ���� ġŲ ���� ����");
		System.out.println();
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	// ��ٸ� �̵��ϱ�
	void moveLadder() {
		showLadder();
		while (true) {	
			if (ladder[xIdx][yIdx] == 0) {			
				xIdx += 1;
				showLadder();
				
			} else if (ladder[xIdx][yIdx] == 1) {			
				yIdx += 1;
				showLadder();
				xIdx += 1;
				showLadder();
			} else if (ladder[xIdx][yIdx] == 2) {
				
				yIdx -= 1;	
				showLadder();
				xIdx += 1;
				showLadder();
			}
			// �����ϱ�
			if (xIdx == 7) {
				break;
			}
		}
	}

	// �޴� �����ϱ�
	void setMenu() {
		if (yIdx == 0) {
			menu = "���";
		} else if (yIdx == 1) {
			menu = "����";
		} else if (yIdx == 2) {
			menu = "ġŲ";
		} else if (yIdx == 3) {
			menu = "����";
		} else if (yIdx == 4) {
			menu = "����";
		}
	}

	void run() {

		showLadder();

		xIdx = 0;
		yIdx = 0;
		
		// ��ٸ� �����ϱ�
		System.out.print("��ȣ�� �����ϼ���(1~5) : ");
		yIdx = scan.nextInt() - 1;

		// ��ٸ� �̵��ϱ�
		moveLadder();

		setMenu();
		System.out.println("������ ���� �޴��� " + menu + " �Դϴ�~!!!");

	}

}

public class Method_��ٸ� {

	public static void main(String[] args) {
		LadderGame lg = new LadderGame();
		lg.run();
	}

}
