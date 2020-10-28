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
				System.out.println(um.userList.get(um.userLog).id + "님, 로그인 중....");
			}
			System.out.println("[1.가입] [2.탈퇴] [3.로그인] [4.로그아웃]");
			System.out.println("[100.관리자] [0.종료]");
			
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
			System.out.println("[1.쇼핑] [2.장바구니목록] [0.뒤로가기]");
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
			System.out.print("[카테고리] 번호를 입력하세요. [종료 : -1] : ");
			int caID = scan.nextInt();
			if(caID == -1) {
				break;
			}
			else {
				im.printItemList(caID);
				System.out.print("[아이템] 번호를 입력하세요 : ");
				
				int itemID = scan.nextInt();
				im.addCart(um.userList.get(um.userLog).id, caID, itemID);
			}
		}
	}
	
	void cartMenu() {
		boolean run = true;
		while(run) {
			System.out.println("[1.내 장바구니] [2.삭제] [3.구입] [0.뒤로가기]");
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
			System.out.println("[1.아이템 관리] [2.카테고리관리] [3.장바구니관리] [4.유저관리] [0. 뒤로가기]");
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
			System.out.println("[1.전체 아이템] [2.아이템 추가] [3.아이템 삭제] [0. 뒤로가기]");
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
			System.out.println("[1.전체 유저] [2.유저 추가] [3.유저 삭제] [0.뒤로가기]");
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
			
			System.out.println("[1.전체 카테고리] [2.카테고리 추가] [3.카테고리 삭제] [0.뒤로가기]");
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
		System.out.print("장바구니 관리할 유저 입력 : ");
		int sel_user = scan.nextInt();
		
		boolean run = true;
		while(run) {
			System.out.println("[1.전체 장바구니 목록] [2.아이템 추가] [3.아이템 삭제] [0. 뒤로가기]");
			int sel = scan.nextInt();
			if(sel == 1) {
				im.printJang(um.userList.get(sel_user));
				
			}
			else if(sel == 2) {

				im.printCategory();
				System.out.print("[카테고리] 번호를 입력하세요. [종료 : -1] : ");
				int caID = scan.nextInt();
				if(caID == -1) {
					break;
				}
				else {
					im.printItemList(caID);
					System.out.print("[아이템] 번호를 입력하세요 : ");
					
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
