package rpg;

import java.util.ArrayList;

public class Inventory {
	ArrayList<Item> itemList = new ArrayList<>();
	
	public void inventoryMenu() {
		while(true) {
			System.out.println("==========[인벤토리메뉴]==========");
			System.out.println("[1.착용] [2.판매] [0.뒤로가기]");
			int sel = MainGame.scan.nextInt();
			
			if(sel == 0) {
				break;
			}
			else if(sel == 1) {
				equipMenu();
			}
			else if(sel == 2) {
				sellMenu();
			}
		}
	}
	
	public void equipMenu() {
		Player.guild.printAllUnitStatus();
		System.out.print("아이템 착용할 길드원을 선택하세요 : ");
		int selUnit = MainGame.scan.nextInt();
		
		while(true) {
			Player.guild.printUnitStatus(selUnit - 1);
			Player.guild.printUnitItem(selUnit - 1);
			printItemList();
			System.out.print("착용할 아이템 번호를 입력하세요 : [0.뒤로가기]");
			int selEquip = MainGame.scan.nextInt();
			if(selEquip == 0) {
				break;
			}
			else {
				selEquip--;
				
				if(itemList.get(selEquip).kind == Item.WEAPON) {
					if(Player.getGuildUnit(selUnit - 1).weapon != null) {
						itemList.add(Player.getGuildUnit(selUnit - 1).weapon);
					}
					Player.getGuildUnit(selUnit - 1).weapon = itemList.get(selEquip);
				}
				else if(itemList.get(selEquip).kind == Item.ARMOR) {
					if(Player.getGuildUnit(selUnit - 1).armor != null) {
						itemList.add(Player.getGuildUnit(selUnit - 1).armor);
					}
					Player.getGuildUnit(selUnit - 1).armor = itemList.get(selEquip);
				}
				else if(itemList.get(selEquip).kind == Item.RING) {
					if(Player.getGuildUnit(selUnit - 1).ring != null) {
						itemList.add(Player.getGuildUnit(selUnit - 1).ring);
					}
					Player.getGuildUnit(selUnit - 1).ring = itemList.get(selEquip);
				}
				itemList.remove(selEquip);
			}
		}
	}
	
	public void printItemList() {
		
		System.out.println("============[아이템리스트]============");
		for(int i = 0; i < itemList.size(); i++) {
			System.out.print("[" + (i + 1) + "번]");
			System.out.print("[이름 : " + itemList.get(i).name + "]");
			System.out.print("[능력 : " + itemList.get(i).power + "]");
			System.out.print("[가격 : " + itemList.get(i).price + "]");
			System.out.println("");
		}
	}
	
	public void sellMenu() {
		while(true) {
			printItemList();
			
			System.out.println("[골드 : " + Player.money + "]");
			System.out.print("판매할 아이템 번호를 입력하세요 : (50% 세금) [0.뒤로가기]");
			int selSell = MainGame.scan.nextInt();
			
			if(selSell == 0) {
				break;
			}
			
			System.out.println(itemList.get(selSell - 1).name + "을 판매합니다.");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			Player.money += (itemList.get(selSell - 1).price / 2);
			itemList.remove(selSell - 1);
		}
	}
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
}
