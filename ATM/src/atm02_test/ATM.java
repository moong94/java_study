package atm02_test;

import java.util.Scanner;
import java.util.Random;

public class ATM {
	static Scanner scan = new Scanner(System.in);
	static Random ran = new Random();
	
	FileManager fileManager = FileManager.instance;
	UserManager userManager = UserManager.instance;
	static int log;
	
	ATM(){
		log = -1;
		
		boolean rs = fileManager.loadData();
		if(!rs) {
			userManager.setDummy();
			fileManager.saveData();
		}
	}
	void menu() {
		while(true) {
			
			userManager.printAllUserInfo();
			
			System.out.println("[MEGA ATM]");
			System.out.println("[1]로그인");
			System.out.println("[2]회원가입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴룰 선택하세요  :");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				login();
			}
			else if(choice == 2) {
				join();
			}
			else if(choice == 0) {
				break;
			}
		}
		
	}
	
	void join() {
		userManager.joinUser();
	}
	
	void login() {
		System.out.print("[로그인]아이디를 입력하세요 : ");
		String id = scan.next();
		
		System.out.print("[로그인]패스워드를 입력하세요 : ");
		String password = scan.next();
		
		for(int i = 0; i < userManager.userCount; i++) {
			User temp = userManager.userList[i];
			if(temp.id.equals(id) && temp.password.equals(password)) {
				log = i;
			}
		}
		
		if(log == -1) {
			System.out.println("[메세지]아이디와 패스워드가 틀렸습니다.");
		}
		else {
			System.out.println("[메세지]" + userManager.userList[log].id + "님, 환영합니다.");
			
			loginMenu();
		}
	}
	
	void loginMenu() {
		while(true) {
			if(log == -1) {
				break;
			}
			System.out.println("[" + userManager.userList[log].id + "님, 로그인]");
			System.out.println("[1]계좌생성");
			System.out.println("[2]입금하기");
			System.out.println("[3]출금하기");
			System.out.println("[4]이체하기");
			System.out.println("[5]계좌조회");
			System.out.println("[6]계좌삭제");
			System.out.println("[7]회원탈퇴");
			System.out.println("[0]로그아웃");
			
			System.out.print("메뉴를 선택하세요 : ");
			int choice = scan.nextInt();
			
			if(choice == 1) { createAccount(); }
			else if(choice == 2) { income(); }
			else if(choice == 3) { withdraw(); }
			else if(choice == 4) { transfer(); }
			else if(choice == 5) { lookupAcc(); }
			else if(choice == 6) { deleteAcc(); }
			else if(choice == 7) { leave(); }
			else if(choice == 0) { 
				log = -1;
				System.out.println("[메세지]로그아웃되었습니다.");
				break; 
			}
		}
	}
	
	void createAccount() {
		userManager.createAccount();
	}
	
	void income() {
		userManager.income();
	}
	
	void withdraw() {
		userManager.withdraw();
	}
	
	void transfer() {
		userManager.transfer();
	}
	
	void lookupAcc() {
		userManager.lookupAcc();
	}
	
	void deleteAcc() {
		userManager.deleteAcc();
	}
	
	void leave() {
		userManager.leave();
	}
}
