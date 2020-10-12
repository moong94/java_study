package file;

import java.util.Random;
import java.util.Scanner;

public class File_觼溯檜雖嬴馨檜萄 {

	public static void main(String[] args) {
		/*
		 * # 觼溯檜雖 嬴馨檜萄
		 * 1. 裘曖 觼晦朝 7 x 7 檜棻. 
		 * 2. 鼻(1)ж(2)謝(3)辦(4)煎 檜翕檜 陛棟ж貊,
		 *    ァ驕撲纂(5), ァだ(6)煎 撲薑и棻. 
		 * 3. 漁(3), Ы溯檜橫(2), ァ驕(9), 嬴檜蠱(4)煎 撲薑и棻.
		 * 4. 欽, ァ驕檜 撲纂脹 牖憮渠煎 攪螳撿 ж貊,
		 *    ァだ 衛 褊濠陛 ⑽鷓煎 攪霞棻.
		 * 5. 漁 だ惚衛 嬴檜蠱檜 楠渾ж啪 儅撩腎橫,
		 *    嬴檜蠱擊 詳戲賊 撲纂й 熱 氈朝 ァ驕曖 偃熱陛 隸陛脹棻.
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
		
		//漁 儅撩
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
		
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式忖");
		for(int i = 0; i < map.length; i++) {

			System.out.print("弛");
			for(int j = 0 ; j < map.length; j++) {
				if(map[i][j] == wall) {
					System.out.print(" ﹥ ");
				}
				else {
					map[i][j] = 0;
					System.out.print(" ﹤ ");
				}
			}
			System.out.println("弛");
		}
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式戎");
		
		
		while(true) {
		System.out.println("Ы溯檜橫 衛濛 嬪纂 殮溘");
		System.out.print("x蹴 : ");
		int player_x = scan.nextInt();
		
		System.out.print("y蹴 : ");
		int player_y = scan.nextInt();
		
		if(map[player_y][player_x] == wall) {
			System.out.println("檜嘐 漁檜 嬪纂п 氈蝗棲棻.");
			continue;
			}
		else {
			map[player_y][player_x] = player;
			x = player_x;
			y = player_y;
			break;
			}
		}
		System.out.println("忙式式式式式式式式式式式式式式式式式式式式式忖");
		for(int i = 0; i < map.length; i++) {

			System.out.print("弛");
			for(int j = 0 ; j < map.length; j++) {
				if(map[i][j] == wall) {
					System.out.print(" ﹥ ");
				}
				else if(map[i][j] == player) {
					System.out.print(" 褡   ");
				}
				else if(map[i][j] == 0){
					System.out.print(" ﹤ ");
				}
			}
			System.out.println("弛");
		}
		System.out.println("戌式式式式式式式式式式式式式式式式式式式式式戎");
		
		while(true) {
			
			
			System.out.println("鼻(1) ж(2) 謝(3) 辦(4) ァ驕撲纂(5) ァだ(6)");
			System.out.print("殮溘 : ");
			int input = scan.nextInt();
			
			if(input == 1) {
				if(y == 0) {
					System.out.println("檜翕 碳陛");
					continue;
				}
				else if(map[y - 1][x] == wall) {
					System.out.println("檜翕 碳陛");
					continue;
				}
				else if(map[y - 1][x] == item) {
					System.out.println("ァ驕 偎熱 + 1");
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
					System.out.println("檜翕 碳陛");
					continue;
				}
				else if(map[y + 1][x] == wall) {
					System.out.println("檜翕 碳陛");
					continue;
				}
				else if(map[y + 1][x] == item) {
					System.out.println("ァ驕 偎熱 + 1");
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
					System.out.println("檜翕 碳陛");
					continue;
				}
				else if(map[y][x - 1] == wall) {
					System.out.println("檜翕 碳陛");
					continue;
				}
				else if(map[y][x - 1] == item) {
					System.out.println("ァ驕 偎熱 + 1");
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
					System.out.println("檜翕 碳陛");
					continue;
				}
				else if(map[y][x + 1] == wall) {
					System.out.println("檜翕 碳陛");
					continue;
				}
				else if(map[y][x + 1] == item) {
					System.out.println("ァ驕 偎熱 + 1");
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
					System.out.println("渦 檜鼻 ァ驕擊 撲纂й 熱 橈蝗棲棻.");
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
					System.out.println("ァだ陛棟и ァ驕檜 橈蝗棲棻.");
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
					
					
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式忖");
					for(int i = 0; i < map.length; i++) {

						System.out.print("弛");
						for(int j = 0 ; j < map.length; j++) {
							if(map[i][j] == wall) {
								System.out.print(" ﹥ ");
							}
							else if(map[i][j] == player) {
								System.out.print(" 褡   ");
							}
							else if(map[i][j] == 0){
								System.out.print(" ﹤ ");
							}
							else if(map[i][j] == bomb) {
								System.out.print(" ≒ ");
							}
							else if(map[i][j] == item) {
								System.out.println(" I ");
							}
							else if(map[i][j] == kabomb) {
								System.out.print(" X ");
							}
							
						}
						System.out.println("弛");
					}
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式戎");
					
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
			
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式忖");
			for(int i = 0; i < map.length; i++) {

				System.out.print("弛");
				for(int j = 0 ; j < map.length; j++) {
					if(map[i][j] == wall) {
						System.out.print(" ﹥ ");
					}
					else if(map[i][j] == player) {
						System.out.print(" 褡   ");
					}
					else if(map[i][j] == 0){
						System.out.print(" ﹤ ");
					}
					else if(map[i][j] == bomb) {
						System.out.print(" ≒ ");
					}
					else if(map[i][j] == item) {
						System.out.print(" I ");
					}
					else if(map[i][j] == kabomb) {
						System.out.print(" ﹤ ");
						map[i][j] = 0;
					}
					
				}
				System.out.println("弛");
			}
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式戎");
			
		}
		
	}
	
	

}
