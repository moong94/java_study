package rpg;

import java.util.ArrayList;

public class Shop {
	ArrayList<Item> itemList = new ArrayList<>();
	
	public Shop() {
		Item temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "������";
		temp.power = 3;
		temp.price = 1000;
		itemList.add(temp);
		
		temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "ö��";
		temp.power = 5;
		temp.price = 2000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "�����Ǿ�";
		temp.power = 7;
		temp.price = 2500;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "Ƽ����";
		temp.power = 1;
		temp.price = 300;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "���װ���";
		temp.power = 4;
		temp.price = 800;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "��ö����";
		temp.power = 7;
		temp.price = 1500;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "������";
		temp.power = 7;
		temp.price = 3000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "�ݹ���";
		temp.power = 17;
		temp.price = 6000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "���̾ƹ���";
		temp.power = 35;
		temp.price = 20000;
		itemList.add(temp);
	}
	
	public void shopMng() {
		while(true) {
			System.out.println("===============[����]==============");
			System.out.println("[1.����] [2.����] [3.����] [0.�ڷΰ���]");
			
			int selKind = MainGame.scan.nextInt();
			
			if(selKind == 0) {
				return;
			}
			while(true) {
				if(selKind == Item.WEAPON) {
					System.out.println("================[����]=============");
				}
				else if(selKind == Item.ARMOR) {
					System.out.println("================[����]=============");
				}
				else if(selKind == Item.RING) {
					System.out.println("================[����]=============");
				}
				printItems(selKind);
				System.out.println("[��� : " + Player.money + "]");
				System.out.println("������ ������ ��ȣ�� �Է��ϼ��� [0.�ڷΰ���]");
				int selNum = MainGame.scan.nextInt();
				
				if(selNum == 0) {
					break;
				}
				else {
					int count = 0;
					for(int i = 0; i < itemList.size(); i++) {
						if(itemList.get(i).kind == selKind) {
							count++;
							if(count == selNum) {
								Player.inven.addItem(itemList.get(i));
								Player.money -= itemList.get(i).price;
								System.out.println("[" + itemList.get(i).name + "] �� �����߽��ϴ�.");
								
								try {
									Thread.sleep(1000);
								}
								catch(InterruptedException e) {
									e.printStackTrace();
								}
								break;
							}
						}
					}
				}
				
			}
		}
	}
	
	public void printItems(int kind) {
		int count = 0;
		
		for(int i = 0; i < itemList.size(); i++) {
			if(itemList.get(i).kind != kind) {
				continue;
			}
			else {
				System.out.print("[" + (count + 1) + "��]");
				System.out.print("[�̸� : " + itemList.get(i).name + "]");
				System.out.print("[�ɷ� : " + itemList.get(i).power + "]");
				System.out.print("[���� : " + itemList.get(i).price + "]");
				System.out.println("");
				count++;
			}
		}
	}

}
