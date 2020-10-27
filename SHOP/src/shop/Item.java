package shop;

import java.util.Scanner;
import java.util.Vector;

public class Item {
	String name;
	int price;
	String category;
	
	Item(String name, int price, String category){
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	void print() {
		System.out.println("[" + name + "][" + price + "][" + category + "]");
	}
}

class Cart{
	String userId;
	String itemName;
	
	void print() {
		System.out.println("[" + userId + "] 아이템 : " + itemName);
	}
}

class ItemManager{
	Scanner scan = new Scanner(System.in);
	Vector<String> category = new Vector<String>();
	Vector<Item> itemList = new Vector<Item>();
	Vector<Cart> jangList = new Vector<Cart>();
	ItemManager(){
		init();
	}
	
	void init() {
		category.add("과자");
		category.add("생선");
		category.add("육류");
		category.add("음료수");
		
		Item temp = new Item("새우깡", 1000, category.get(0));
		itemList.add(temp);
		temp = new Item("고등어", 2000, category.get(1));
		itemList.add(temp);
		temp = new Item("칸쵸", 3600, category.get(0));
		itemList.add(temp);
		temp = new Item("소고기", 6500, category.get(2));
		itemList.add(temp);
		temp = new Item("콜라", 500, category.get(3));
		itemList.add(temp);
		temp = new Item("새우", 1800, category.get(1));
		itemList.add(temp);
		
	}
	
	void deleteJang(User u) {
		printJang(u);
		
		System.out.print("[아이템 삭제] 삭제할 메뉴를 입력하세요 : ");
		int sel = scan.nextInt();
		

		System.out.println("[메세지]" + jangList.get(sel).itemName + " 아이템이 삭제되었습니다.");
		jangList.remove(sel);
	}
	
	void purchaseJang(User u) {
		printItemList();
		
		System.out.print("[아이템 구입] 구입할 메뉴를 입력하세요 : ");
		int sel = scan.nextInt();
		
		Cart temp = new Cart();
		temp.userId = u.id;
		temp.itemName = itemList.get(sel).name;
		jangList.add(temp);
		System.out.println("[메세지] 아이템이 추가되었습니다.");
		
	}
	
	void printJang() {
		for(int i = 0; i < jangList.size(); i++) {
			jangList.get(i).print();
		}
	}
	
	void printJang(User u) {
		for(int i = 0; i < jangList.size(); i++) {
			if(u.id.equals(jangList.get(i).userId)) {
				jangList.get(i).print();
			}
		}
	}
	
	void printCategory() {
		for(int i = 0; i < category.size(); i++) {
			System.out.println("[" + i + "]" + category.get(i));
		}
	}
	
	void printItemList() {
		for(int i = 0; i < itemList.size(); i++) {
			System.out.print("[" + i + "]");
			itemList.get(i).print();
		}
	}
	
	void printItemList(int caID) {
		int n = 0;
		for(int i = 0; i < itemList.size(); i++) {
			if(category.get(caID).equals(itemList.get(i).category)) {
				System.out.println("[" + n +"]");
				itemList.get(i).print();
				n++;
			}
		}
	}
	
	
	void addItem() {
		System.out.print("[아이템추가] 아이템 이름을 입력하세요 : ");
		String name = scan.next();
		System.out.print("[아이템추가] 가격을 입력하세요 : ");
		int price = scan.nextInt();
		printCategory();
		System.out.print("[아이템추가] 카테고리를 입력하세요 : ");
		int sel = scan.nextInt();
		
		Item temp = new Item(name, price, category.get(sel));
		itemList.add(temp);
	}
	
	void addCategory() {
		System.out.print("[카테고리추가] 카테고리 이름을 입력하세요 : ");
		String name = scan.next();
		category.add(name);
	}
	
	void addCart(String usID, int caID, int itemID) {
		int n = 0;
		Cart temp = new Cart();
		temp.userId = usID;
		for(int i = 0; i < itemList.size(); i++) {
			if(category.get(caID).equals(itemList.get(i).category)) {
				if(itemID == n) {
					temp.itemName = itemList.get(i).name;
				}
				
				n++;
			}
		}
		jangList.add(temp);
	}
}
