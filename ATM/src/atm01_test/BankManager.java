package atm01_test;

import java.util.Scanner;

public class BankManager {

	Scanner scan = new Scanner(System.in);
	
	static BankManager instance = new BankManager();
	
	Bank bank = Bank.instance;
	
	void printMenu() {
		System.out.println("["+ bank.name + "]");
		System.out.println("[1.�α���]");
		System.out.println("[2.ȸ������]");
		System.out.println("[0.����]");
	}
	
	void play() {
		FileManager.instance.load();
		UserManager.instance.printAllUser();
		boolean loop = true;
		
		while(loop) {
			printMenu();
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				login();
			}
			else if(sel == 2) {
				join();
			}
			else if(sel == 0) {
				loop = false;
			}
		}
		
	}
	
	void login() {
		bank.log = UserManager.instance.logUser();
		
		if(bank.log != -1) {
			loginMenu();
		}
		else {
			System.out.println("[�޼���]���̵�� �н����带 Ȯ�����ּ���.");	
		}
	}
	
	void join() {
		UserManager.instance.joinMember();
	}
	
	void loginMenu() {
		boolean loop = true;
		
		while(loop) {
			System.out.println("[" + UserManager.instance.user[bank.log].id + "��, ȯ���մϴ�.");
			System.out.println("[1.���»���]");
			System.out.println("[2.���»���]");
			System.out.println("[3.��     ȸ]");
			System.out.println("[4.ȸ��Ż��]");
			System.out.println("[0.�α׾ƿ�]");	// �ڷΰ���
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				AccountManager.instance.createAcc(bank.log);
				FileManager.instance.save();
			}
			else if(sel == 2) {
				AccountManager.instance.deleteAcc(bank.log);
				FileManager.instance.save();
			}
			else if(sel == 3) {
				AccountManager.instance.printAcc(bank.log);
			}
			else if(sel == 4) {
				bank.log = UserManager.instance.deleteMember(bank.log);
			}
		}
	}
	
}
