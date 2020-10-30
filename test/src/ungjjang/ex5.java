package ungjjang;

import java.util.Random;
import java.util.Scanner;

class print {
	
}

public class ex5 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		final int SIZE = 16;
		int front[] = new int[SIZE];
		char back[] = new char[SIZE];
		int count = 0;
		int check[] = new int[SIZE];
		
		
		for(int i = 0; i < SIZE; i++) {
			front[i] = i;
		}
		
		for(int i = 0; i < SIZE; i += 2) {
			back[i] = (char)('A' + (i/2));
			back[i + 1] = (char)('A' + (i/2));
			
		}
		
		for(int i = 0; i < 1000; i++) {
			int suffle = ran.nextInt(SIZE);
			char temp = back[suffle];
			back[suffle] = back[0];
			back[0] = temp;
		}
		
		long start_time = System.currentTimeMillis();
		while(true) {
			
			if(count == (SIZE / 2)) {
				System.out.println("���� Ŭ����");
				long end_time = System.currentTimeMillis();
				System.out.println("Ŭ���� �ð� : " + ((end_time - start_time) / 1000) + "." +  ((end_time - start_time) % 1000) + "��");
				
				break;
			}
			
			
			for(int i = 0; i< SIZE; i++) {
				if(i % 4 == 0) {
					System.out.println();
				}
				if(check[i] == 1) {
					System.out.print(back[i] + "\t");
				}
				else {
					System.out.print(front[i] + "\t");
				}
			}
			System.out.println();
			
			System.out.print("�Է� 1 : ");
			int sel1 = scan.nextInt();
			System.out.print("�Է� 2 : ");
			int sel2 = scan.nextInt();
			
			if(sel1 == sel2) {
				System.out.println("�ߺ� ���� �Է� ����");
				continue;
			}
			else if(check[sel1] == 1 || check[sel2] == 1) {
				System.out.println("�̹� ���� ī�� ���� ����");
				continue;
			}
			
			else {
				if(back[sel1] == back[sel2]) {
					check[sel1] = 1;
					check[sel2] = 1;
					count++;
					continue;
				}
				else {
					for(int i = 0; i< SIZE; i++) {
						if(i % 4 == 0) {
							System.out.println();
						}
						if(check[i] == 1) {
							System.out.print(back[i] + "\t");
						}
						else if(check[i] == 0) {
							if(i == sel1 || i == sel2) {
								System.out.print(back[i] + "\t");
							}
							else {
								System.out.print(front[i] + "\t");
							}
						}
					}
					try {
						Thread.sleep(1000);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
					
				for(int i = 0; i < 20; i++) {
					System.out.println();
				
				}
				
			}
			
		}
		
	}

}
