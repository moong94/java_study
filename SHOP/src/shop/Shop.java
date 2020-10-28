package shop;

import java.util.Scanner;

public class Shop {
	Scanner scan = new Scanner(System.in);
	ItemManager im = new ItemManager();
	UserManager um = new UserManager();
	
	void mainMenu() {
		boolean run = true;
		while(run) {
			if(um.userLog == -1) {
				System.out.println("....");
			}
			else {
				System.out.println(um.userList.get(um.userLog).id + "��, �α��� ��....");
			}
			System.out.println("[1.����] [2.Ż��] [3.�α���] [4.�α׾ƿ�]");
			System.out.println("[100.������] [0.����]");
			
			int sel = scan.nextInt();
			if(sel == 1) {
				um.join();
			}
			else if(sel == 2) {
				um.leave();
			}
			else if(sel == 3) {
				if(um.logIn()) {
					loginMenu();
				}
			}
			else if(sel == 4) {
				um.logOut();
			}
			else if(sel == 100) {
				managerMenu();
			}
			else if(sel == 0) {
				break;
			}
		}
	}
	
	void loginMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.����] [2.��ٱ��ϸ��] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				shopMenu();
			}
			else if(sel == 2) {
				cartMenu();
			}
			else if(sel == 0) {
				break;
			}
		}
	}
	
	void shopMenu() {
		boolean run = true;
		
		while(run) {
			im.printCategory();
			System.out.print("[ī�װ�] ��ȣ�� �Է��ϼ���. [���� : -1] : ");
			int caID = scan.nextInt();
			if(caID == -1) {
				break;
			}
			else {
				im.printItemList(caID);
				System.out.print("[������] ��ȣ�� �Է��ϼ��� : ");
				
				int itemID = scan.nextInt();
				im.addCart(um.userList.get(um.userLog).id, caID, itemID);
			}
		}
	}
	
	void cartMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.�� ��ٱ���] [2.����] [3.����] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				im.printJang(um.userList.get(um.userLog));
			}
			else if(sel == 2) {
				im.deleteJang(um.userList.get(um.userLog));
			}
			else if(sel == 3) {
				im.purchaseJang(um.userList.get(um.userLog));
			}
			else if(sel == 0) {
				break;
			}
		}
	}
	
	void managerMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.������ ����] [2.ī�װ�����] [3.��ٱ��ϰ���] [4.��������] [0. �ڷΰ���]");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				itemMenu();
			}
			else if(sel == 2) {
				categoryMenu();
			}
			else if(sel == 3) {
				jangMenu();
			}
			else if(sel == 4) {
				userMenu();
			}
			else if(sel == 0) {
				run = false;
			}
		}
	}
	
	void itemMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.��ü ������] [2.������ �߰�] [3.������ ����] [0. �ڷΰ���]");
			int sel = scan.nextInt();
			if(sel == 1) {
				im.printItemList();
			}
			else if(sel == 2) {
				im.addItem();
			}
			else if(sel == 3) {
				im.deleteItem();
			}
			else if(sel == 0) {
				run = false;
			}
		}
	}
	
	void userMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.��ü ����] [2.���� �߰�] [3.���� ����] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				um.printUser();
			}
			else if(sel == 2) {
				um.addUser();
			}
			else if(sel == 3) {
				um.deleteUser();
			}
			else if(sel == 0) {
				run = false;
			}
		}
	}
	
	void categoryMenu() {
		
		boolean run = true;
		while(run) {
			
			System.out.println("[1.��ü ī�װ�] [2.ī�װ� �߰�] [3.ī�װ� ����] [0.�ڷΰ���]");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				im.printCategory();
			}
			else if(sel == 2) {
				im.addCategory();
			}
			else if(sel == 3) {
				im.deleteCategory();
			}
			else if(sel == 0) {
				run = false;
			}
		}
	}
	
	void jangMenu() {
		
		um.printUser();
		System.out.print("��ٱ��� ������ ���� �Է� : ");
		int sel_user = scan.nextInt();
		
		boolean run = true;
		while(run) {
			System.out.println("[1.��ü ��ٱ��� ���] [2.������ �߰�] [3.������ ����] [0. �ڷΰ���]");
			int sel = scan.nextInt();
			if(sel == 1) {
				im.printJang(um.userList.get(sel_user));
				
			}
			else if(sel == 2) {

				im.printCategory();
				System.out.print("[ī�װ�] ��ȣ�� �Է��ϼ���. [���� : -1] : ");
				int caID = scan.nextInt();
				if(caID == -1) {
					break;
				}
				else {
					im.printItemList(caID);
					System.out.print("[������] ��ȣ�� �Է��ϼ��� : ");
					
					int itemID = scan.nextInt();
					im.addCart(um.userList.get(sel_user).id, caID, itemID);
				}
			}
			else if(sel == 3) {
				im.deleteJang(um.userList.get(sel_user));
			}
			else if(sel == 0) {
				run = false;
			}
		}
		
	}
}
