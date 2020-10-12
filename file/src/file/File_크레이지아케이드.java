package file;

import java.util.Random;
import java.util.Scanner;

public class File_ũ�����������̵� {

	public static void main(String[] args) {
		/*
		 * # ũ������ �����̵�
		 * 1. ���� ũ��� 7 x 7 �̴�. 
		 * 2. ��(1)��(2)��(3)��(4)�� �̵��� �����ϸ�,
		 *    ��ź��ġ(5), ����(6)�� �����Ѵ�. 
		 * 3. ��(3), �÷��̾�(2), ��ź(9), ������(4)�� �����Ѵ�.
		 * 4. ��, ��ź�� ��ġ�� ������� ������ �ϸ�,
		 *    ���� �� ���ڰ� ���·� ������.
		 * 5. �� �ı��� �������� �����ϰ� �����Ǿ�,
		 *    �������� ������ ��ġ�� �� �ִ� ��ź�� ������ �����ȴ�.
		 */

		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int map[][] = new int[7][7];
		
		int player = 2;
		int bomb = 9;
		int wall = 3;
		int item = 4;
		int kabomb = 5;
		
		int walloc[][] = new int[49][2];
		
		int maxbomb = 1;
		int bombcount = 0;
		
		int wallcount = 0;
		
		int x = 0;
		int y = 0;
		
		int bombloc[][] = new int [20][2];
		
		//�� ����
		while(wallcount < 20) {
			for(int i = 0 ; i < map.length; i++) {
				for(int j = 0; j < map[i].length; j++) {
					int randomwall = ran.nextInt(10);
					
					if(randomwall == 0 && map[i][j] != wall) {
						map[i][j] = wall;
						walloc[wallcount][0] = i;
						walloc[wallcount][1] = j;
						wallcount++;
					}
				}
			}
		}
		
		System.out.println("����������������������������������������������");
		for(int i = 0; i < map.length; i++) {

			System.out.print("��");
			for(int j = 0 ; j < map.length; j++) {
				if(map[i][j] == wall) {
					System.out.print(" �� ");
				}
				else {
					map[i][j] = 0;
					System.out.print(" �� ");
				}
			}
			System.out.println("��");
		}
		System.out.println("����������������������������������������������");
		
		
		while(true) {
		System.out.println("�÷��̾� ���� ��ġ �Է�");
		System.out.print("x�� : ");
		int player_x = scan.nextInt();
		
		System.out.print("y�� : ");
		int player_y = scan.nextInt();
		
		if(map[player_y][player_x] == wall) {
			System.out.println("�̹� ���� ��ġ�� �ֽ��ϴ�.");
			continue;
			}
		else {
			map[player_y][player_x] = player;
			x = player_x;
			y = player_y;
			break;
			}
		}
		System.out.println("����������������������������������������������");
		for(int i = 0; i < map.length; i++) {

			System.out.print("��");
			for(int j = 0 ; j < map.length; j++) {
				if(map[i][j] == wall) {
					System.out.print(" �� ");
				}
				else if(map[i][j] == player) {
					System.out.print(" ��   ");
				}
				else if(map[i][j] == 0){
					System.out.print(" �� ");
				}
			}
			System.out.println("��");
		}
		System.out.println("����������������������������������������������");
		
		while(true) {
			
			
			System.out.println("��(1) ��(2) ��(3) ��(4) ��ź��ġ(5) ����(6)");
			System.out.print("�Է� : ");
			int input = scan.nextInt();
			
			if(input == 1) {
				if(y == 0) {
					System.out.println("�̵� �Ұ�");
					continue;
				}
				else if(map[y - 1][x] == wall) {
					System.out.println("�̵� �Ұ�");
					continue;
				}
				else if(map[y - 1][x] == item) {
					System.out.println("��ź ���� + 1");
					maxbomb++;
					map[y][x] = 0;
					map[y - 1][x] = player;
					y -= 1;
				}
				else {
					if(map[y][x] != bomb) {
						map[y][x] = 0;
					}
					map[y - 1][x] = player;
					y -= 1;
					
				}
			}
			else if(input == 2) {
				if(y == 6) {
					System.out.println("�̵� �Ұ�");
					continue;
				}
				else if(map[y + 1][x] == wall) {
					System.out.println("�̵� �Ұ�");
					continue;
				}
				else if(map[y + 1][x] == item) {
					System.out.println("��ź ���� + 1");
					maxbomb++;
					map[y][x] = 0;
					map[y + 1][x] = player;
					y += 1;
				}
				else {
					if(map[y][x] != bomb) {
						map[y][x] = 0;
					}
					map[y + 1][x] = player;
					y += 1;
				}
			}
			else if(input == 3) {
				if(x == 0) {
					System.out.println("�̵� �Ұ�");
					continue;
				}
				else if(map[y][x - 1] == wall) {
					System.out.println("�̵� �Ұ�");
					continue;
				}
				else if(map[y][x - 1] == item) {
					System.out.println("��ź ���� + 1");
					maxbomb++;
					map[y][x] = 0;
					map[y][x - 1] = player;
					x -= 1;
				}
				else {
					if(map[y][x] != bomb) {
						map[y][x] = 0;
					}
					map[y][x - 1] = player;
					x -= 1;
				}
			}
			else if(input == 4) {
				if(x == 6) {
					System.out.println("�̵� �Ұ�");
					continue;
				}
				else if(map[y][x + 1] == wall) {
					System.out.println("�̵� �Ұ�");
					continue;
				}
				else if(map[y][x + 1] == item) {
					System.out.println("��ź ���� + 1");
					maxbomb++;
					map[y][x] = 0;
					map[y][x + 1] = player;
					x += 1;
				}
				else {
					if(map[y][x] != bomb) {
						map[y][x] = 0;
					}
					map[y][x + 1] = player;
						x += 1;
				}
			}
			
			else if(input == 5) {
				
				if(bombcount == maxbomb) {
					System.out.println("�� �̻� ��ź�� ��ġ�� �� �����ϴ�.");
					continue;
				}
				else {
					bombloc[bombcount][0] = x;
					bombloc[bombcount][1] = y;
					map[y][x] = bomb;
					bombcount++;
				}
			}
			else if(input == 6) {
				if(bombcount == 0) {
					System.out.println("���İ����� ��ź�� �����ϴ�.");
					continue;
				}
				else {
					for(int i = 0; i < bombcount; i++) {
						if(bombloc[i][0] == 0 && bombloc[i][1] == 0) {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] + 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] + 1] = kabomb;
						}
						else if(bombloc[i][0] == 6 && bombloc[i][1] == 0) {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] + 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] - 1] = kabomb;
						} 
						else if(bombloc[i][0] == 0 && bombloc[i][1] == 6) {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] - 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] + 1] = kabomb;
						}
						else if(bombloc[i][0] == 6 && bombloc[i][1] == 6) {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] - 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] - 1] = kabomb;
						}
						else if(bombloc[i][0] == 0) {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] - 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] + 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] + 1] = kabomb;
						}
						else if(bombloc[i][0] == 6) {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] - 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] + 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] - 1] = kabomb;
						}
						else if(bombloc[i][1] == 0) {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] - 1] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] + 1] = kabomb;
							map[bombloc[i][1] + 1][bombloc[i][0]] = kabomb;
						}
						else if(bombloc[i][1] == 6) {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] - 1] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] + 1] = kabomb;
							map[bombloc[i][1] - 1][bombloc[i][0]] = kabomb;
						}
						else {
							map[bombloc[i][1]][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] - 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1] + 1][bombloc[i][0]] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] + 1] = kabomb;
							map[bombloc[i][1]][bombloc[i][0] - 1] = kabomb;
						}
					}
					
					bombcount = 0;
					
					
					System.out.println("����������������������������������������������");
					for(int i = 0; i < map.length; i++) {

						System.out.print("��");
						for(int j = 0 ; j < map.length; j++) {
							if(map[i][j] == wall) {
								System.out.print(" �� ");
							}
							else if(map[i][j] == player) {
								System.out.print(" ��   ");
							}
							else if(map[i][j] == 0){
								System.out.print(" �� ");
							}
							else if(map[i][j] == bomb) {
								System.out.print(" �� ");
							}
							else if(map[i][j] == item) {
								System.out.println(" I ");
							}
							else if(map[i][j] == kabomb) {
								System.out.print(" X ");
							}
							
						}
						System.out.println("��");
					}
					System.out.println("����������������������������������������������");
					
					if(map[y][x] == kabomb) {
						System.out.println("Player Dead");
						break;
					}
					
				}
				
			}
			
			for(int i = 0; i < 49; i++) {
				if(map[walloc[i][0]][walloc[i][1]] == kabomb) {
						int ranitem = ran.nextInt(2);
						if(ranitem == 0) {
							map[walloc[i][0]][walloc[i][1]] = item;
						}
						
						walloc[i][0] = 0;
						walloc[i][1] = 0;
				}
			}
			
			System.out.println("����������������������������������������������");
			for(int i = 0; i < map.length; i++) {

				System.out.print("��");
				for(int j = 0 ; j < map.length; j++) {
					if(map[i][j] == wall) {
						System.out.print(" �� ");
					}
					else if(map[i][j] == player) {
						System.out.print(" ��   ");
					}
					else if(map[i][j] == 0){
						System.out.print(" �� ");
					}
					else if(map[i][j] == bomb) {
						System.out.print(" �� ");
					}
					else if(map[i][j] == item) {
						System.out.print(" I ");
					}
					else if(map[i][j] == kabomb) {
						System.out.print(" �� ");
						map[i][j] = 0;
					}
					
				}
				System.out.println("��");
			}
			System.out.println("����������������������������������������������");
			
		}
		
	}
	
	

}
