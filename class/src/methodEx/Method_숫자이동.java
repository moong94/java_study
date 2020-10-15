package methodEx;

import java.util.Scanner;


class NumberGame{
	
	Scanner scan = new Scanner(System.in);

	int[] move = {0, 0, 0, 0, 8, 0, 0, 0, 0, 0};
	int player = 4;
	
	void printPlay() {
		for(int i=0; i<move.length; i++) {
			if(move[i] == 0) { System.out.print("[ ]"); }
			else { System.out.print("��"); }
		}
		System.out.println();
	}
	
	void showMenu() {
		System.out.println("1.�·� �̵�");
		System.out.println("2.��� �̵�");
		System.out.println("3.�����ϱ�");
	}
	
	void moveLeft() {
		if(player > 0) {
			move[player] = 0;
			move[player - 1] = 8;
			player -= 1;
		}else {
			System.out.println("���̻� ������ �� �����!");
		}
	}
	
	void moveRight() {
		if(player < move.length - 1) {
			move[player] = 0;
			move[player + 1] = 8;
			player += 1;
		}else {
			System.out.println("���̻� ������ �� �����!");
		}
	}
	
	void run() {
		while(true) {
			// ����ȭ�� ���
			printPlay();
			// �޴� ���
			showMenu();
			// �޴� ����
			System.out.print(": ");
			int choice = scan.nextInt();
			
			// �·� �̵�
			if(choice == 1) { moveLeft(); }
			// ��� �̵�
			else if(choice == 2) { moveRight(); }
			// ����
			else if(choice == 3) {
				System.out.println("���� ����");
				break;
			}
		}
	}
}

public class Method_�����̵� {

	public static void main(String[] args) {
		/*
		 * # ���� �̵��ϱ� : Ŭ���� + �޼���
		 * 1. ���� 8�� ĳ�����̴�.
		 * 2. ���� 1�� �Է��ϸ�, ĳ���Ͱ� �������� �̵��Ѵ�.
		 * 3. ���� 2�� �Է��ϸ�, ĳ���Ͱ� �����������̵��Ѵ�.
		 * 4. �¿� ���� �������� �� ������ �߻����� �ʵ��� ����ó���� ���ش�.
		 */
		
		NumberGame g = new NumberGame();
		g.run();
	}

}
