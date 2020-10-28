package rpg;

import java.util.ArrayList;

public class Shop {
	ArrayList<Item> itemList = new ArrayList<>();
	
	public Shop() {
		Item temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "나무검";
		temp.power = 3;
		temp.price = 1000;
		itemList.add(temp);
		
		temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "철검";
		temp.power = 5;
		temp.price = 2000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.WEAPON;
		temp.name = "레이피어";
		temp.power = 7;
		temp.price = 2500;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "티셔츠";
		temp.power = 1;
		temp.price = 300;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "가죽갑옷";
		temp.power = 4;
		temp.price = 800;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.ARMOR;
		temp.name = "강철갑옷";
		temp.power = 7;
		temp.price = 1500;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "은반지";
		temp.power = 7;
		temp.price = 3000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "금반지";
		temp.power = 17;
		temp.price = 6000;
		itemList.add(temp);

		temp = new Item();
		temp.kind = Item.RING;
		temp.name = "다이아반지";
		temp.power = 35;
		temp.price = 20000;
		itemList.add(temp);
	}
	
	public void shopMng() {
		while(true) {
			System.out.println("===============[상점]==============");
			System.out.println("[1.무기] [2.갑옷] [3.반지] [0.뒤로가기]");
			
			int selKind = MainGame.scan.nextInt();
			
			if(selKind == 0) {
				return;
			}
			while(true) {
				if(selKind == Item.WEAPON) {
					System.out.println("================[무기]=============");
				}
				else if(selKind == Item.ARMOR) {
					System.out.println("================[갑옷]=============");
				}
				else if(selKind == Item.RING) {
					System.out.println("================[반지]=============");
				}
				printItems(selKind);
				System.out.println("[골드 : " + Player.money + "]");
				System.out.println("구입할 아이템 번호를 입력하세요 [0.뒤로가기]");
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
								System.out.println("[" + itemList.get(i).name + "] 을 구입했습니다.");
								
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
				System.out.print("[" + (count + 1) + "번]");
				System.out.print("[이름 : " + itemList.get(i).name + "]");
				System.out.print("[능력 : " + itemList.get(i).power + "]");
				System.out.print("[가격 : " + itemList.get(i).price + "]");
				System.out.println("");
				count++;
			}
		}
	}

}
