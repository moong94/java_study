package rpg;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

class MainGame {
	static Scanner scan = new Scanner(System.in);
	static Random ran = new Random();
	
	public MainGame() {
		Player player = new Player();
		Shop shop = new Shop();
		FileData fileData = new FileData();
		
		while(true) {
			System.out.println("==========[���� �޴�]==========");
			System.out.println("[1.������] [2.����] [3.�κ��丮]");
			System.out.println("[4.����] [5.�ε�] [0.����]");
			
			int sel = scan.nextInt();
			
			if(sel == 1) {
				player.guildMenu();
			}
			else if(sel == 2) {
				shop.shopMng();
			}
			else if(sel == 3) {
				player.inventoryMenu();
			}
			else if(sel == 4) {
				try {
					fileData.save();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			else if(sel == 5) {
				try {
					fileData.loadData();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			else if(sel == 0) {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
		MainGame.scan.close();
	}
}
public class Text_RPG {

	public static void main(String[] args) {
		new MainGame();

	}

}
