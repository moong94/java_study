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
		System.out.println("[" + userId + "] ������ : " + itemName);
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
		category.add("����");
		category.add("����");
		category.add("����");
		category.add("�����");
		
		Item temp = new Item("�����", 1000, category.get(0));
		itemList.add(temp);
		temp = new Item("����", 2000, category.get(1));
		itemList.add(temp);
		temp = new Item("ĭ��", 3600, category.get(0));
		itemList.add(temp);
		temp = new Item("�Ұ��", 6500, category.get(2));
		itemList.add(temp);
		temp = new Item("�ݶ�", 500, category.get(3));
		itemList.add(temp);
		temp = new Item("����", 1800, category.get(1));
		itemList.add(temp);
		
	}
	
	void deleteJang(User u) {
		printJang(u);
		
		System.out.print("[������ ����] ������ �޴��� �Է��ϼ��� : ");
		int sel = scan.nextInt();
		

		System.out.println("[�޼���]" + jangList.get(sel).itemName + " �������� �����Ǿ����ϴ�.");
		jangList.remove(sel);
	}
	
	void purchaseJang(User u) {
		printItemList();
		
		System.out.print("[������ ����] ������ �޴��� �Է��ϼ��� : ");
		int sel = scan.nextInt();
		
		Cart temp = new Cart();
		temp.userId = u.id;
		temp.itemName = itemList.get(sel).name;
		jangList.add(temp);
		System.out.println("[�޼���] �������� �߰��Ǿ����ϴ�.");
		
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
		System.out.print("[�������߰�] ������ �̸��� �Է��ϼ��� : ");
		String name = scan.next();
		System.out.print("[�������߰�] ������ �Է��ϼ��� : ");
		int price = scan.nextInt();
		printCategory();
		System.out.print("[�������߰�] ī�װ��� �Է��ϼ��� : ");
		int sel = scan.nextInt();
		
		Item temp = new Item(name, price, category.get(sel));
		itemList.add(temp);
	}
	
	void addCategory() {
		System.out.print("[ī�װ��߰�] ī�װ� �̸��� �Է��ϼ��� : ");
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
