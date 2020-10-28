package rpg;

import java.util.ArrayList;

public class Inventory {
	ArrayList<Item> itemList = new ArrayList<>();
	
	public void inventoryMenu() {
		while(true) {
			System.out.println("==========[�κ��丮�޴�]==========");
			System.out.println("[1.����] [2.�Ǹ�] [0.�ڷΰ���]");
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
		System.out.print("������ ������ ������ �����ϼ��� : ");
		int selUnit = MainGame.scan.nextInt();
		
		while(true) {
			Player.guild.printUnitStatus(selUnit - 1);
			Player.guild.printUnitItem(selUnit - 1);
			printItemList();
			System.out.print("������ ������ ��ȣ�� �Է��ϼ��� : [0.�ڷΰ���]");
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
		
		System.out.println("============[�����۸���Ʈ]============");
		for(int i = 0; i < itemList.size(); i++) {
			System.out.print("[" + (i + 1) + "��]");
			System.out.print("[�̸� : " + itemList.get(i).name + "]");
			System.out.print("[�ɷ� : " + itemList.get(i).power + "]");
			System.out.print("[���� : " + itemList.get(i).price + "]");
			System.out.println("");
		}
	}
	
	public void sellMenu() {
		while(true) {
			printItemList();
			
			System.out.println("[��� : " + Player.money + "]");
			System.out.print("�Ǹ��� ������ ��ȣ�� �Է��ϼ��� : (50% ����) [0.�ڷΰ���]");
			int selSell = MainGame.scan.nextInt();
			
			if(selSell == 0) {
				break;
			}
			
			System.out.println(itemList.get(selSell - 1).name + "�� �Ǹ��մϴ�.");
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
