package methodEx;

import java.util.Scanner;

class Bank{

	Scanner scan = new Scanner(System.in);
	
	String name = "";
	
	String[] arAcc = {"1111", "2222", "3333", "", ""};
	String[] arPw  = {"1234", "2345", "3456", "", ""};
	int[] arMoney  = {87000, 34000, 17500, 0, 0};
	
	int count = 3;
	
	// �α׾ƿ�(-1)
	int loginCheck = 2;			// 3333 �α��� ��
	
	void showMember() {
		for(int i=0; i<count; i++) {
			System.out.println(arAcc[i] + " : " + arPw[i] + " : " + arMoney[i] + "��");
		}
	}
	
	void showMenu() {
		System.out.print("# �α��� ���� : ");
		if(loginCheck == -1){
			System.out.println("�α׾ƿ�");
		}else {
			System.out.println(arAcc[loginCheck] + "��, �α��� ��...");
		}

		System.out.println("=== " + name + " ===");
		System.out.println("1.ȸ������");	
		System.out.println("2.ȸ��Ż��");
		System.out.println("3.�α���");
		System.out.println("4.�α׾ƿ�");
		System.out.println("5.�Ա��ϱ�");
		System.out.println("6.��ü�ϱ�");
	}
	
	int checkAcc(String myAcc) {
		
		int check = 1;
		for(int i=0; i<count; i++) {
			if(arAcc[i].equals(myAcc)) {
				check = -1;
			}
		}
		return check;
	}

	int checkPw(int accCheck) {
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		String myPw = scan.next();

		int pwCheck = -1;
		
		if(arPw[accCheck].equals(myPw)) {
			pwCheck = 1;
		}
		
		return pwCheck;
	}
	
	int checkAcc() {
		
		System.out.print("Ż���� ���¹�ȣ�� �Է��ϼ��� : ");
		String myAcc = scan.next();
		
		int accCheck = -1;
		for(int i=0; i<count; i++) {
			if(arAcc[i].equals(myAcc)) {
				accCheck = i;
			}
		}
		return accCheck;
	}
	
	void delMember() {
		
		// ȸ��Ż�� ��������
		if(count == 0) {
			System.out.println("Ż���� ȸ�������� �����ϴ�.");
			return;
		}

		// ���¹�ȣ ��ȿ�� �˻�
		int accCheck = checkAcc();
		
		if(accCheck != -1) {
			// ��й�ȣ ��ȿ�� �˻�
			int pwCheck = checkPw(accCheck);
			if(pwCheck == -1) {
				System.out.println("��й�ȣ�� �� �� �Է��߽��ϴ�.");
			}else {
				for(int i=accCheck; i<count - 1; i++) {
					arAcc[i] = arAcc[i + 1];
					arPw[i] = arPw[i + 1];
					arMoney[i] = arMoney[i + 1];
				}
				count -= 1;
				System.out.println("Ż��Ǿ����ϴ�.");
			}
		}else {
			System.out.println("���� ���¹�ȣ �Դϴ�.");
		}
	}
	
	void joinMember() {
		
		// ȸ������ ȸ�� ���� 5������� ���
		if(count == 5) {
			System.out.println("���̻� ������ �� �����ϴ�.");
			return;
		}
		
		// ���¹�ȣ �ߺ��˻�
		System.out.print("������ ���¹�ȣ�� �Է��ϼ��� : ");
		String myAcc = scan.next();
		int check = checkAcc(myAcc);
		
		if(check == -1) {
			System.out.println("���¹�ȣ�� �ߺ��˴ϴ�.");
		}else {
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			String myPw = scan.next();
			
			arAcc[count] = myAcc;
			arPw[count] = myPw;
			arMoney[count] = 1000;
			
			count += 1;
			System.out.println("ȸ�������� �����մϴ�.");
		}
	}

	void login() {
		
		if(loginCheck != -1) {
			System.out.println("�α׾ƿ� �� �������ּ���.");
			return;
		}
		System.out.print("���¹�ȣ�� �Է��ϼ��� : ");
		String myId = scan.next();
		System.out.print("�н����带 �Է��ϼ��� : ");
		String myPw = scan.next();
		
		// ���¹�ȣ�� �н����� ��ȿ�� �˻�
		for(int i=0; i<count; i++) {
			if(myId.equals(arAcc[i]) && myPw.equals(arPw[i])) {
				loginCheck = i;
			}
		}
		
		if(loginCheck == -1) {
			System.out.println("���¹�ȣ�� �н����带 Ȯ�����ּ���.");
		}else {
			System.out.println("�α��� ����!");
		}	
	}
	
	void logOut() {
		if(loginCheck == -1) {
			System.out.println("�α��� �� �������ּ���.");
		}else {
			loginCheck = -1;
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}		
	}

	void income() {
		System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
		int money = scan.nextInt();

		arMoney[loginCheck] += money;
		System.out.println("�Ա��� �Ϸ��Ͽ����ϴ�.");		
	}
	
	void trans() {
		System.out.print("��ü�� ���¹�ȣ�� �Է��ϼ��� : ");
		String transAcc = scan.next();

		// ��ü ���¹�ȣ ��ȿ�� �˻�
		int check = -1;
		for (int i = 0; i < count; i++) {
			if (arAcc[i].equals(transAcc)) {
				check = i;
			}
		}

		if (check == -1) {
			System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
		} else {
			System.out.print("��ü�� �ݾ��� �Է��ϼ��� : ");
			int transMoney = scan.nextInt();

			// ��ü �ݾ� ��ȿ�� �˻�
			if (arMoney[loginCheck] >= transMoney) {
				arMoney[loginCheck] -= transMoney;
				arMoney[check] += transMoney;
				System.out.println("��ü�� �Ϸ��Ͽ����ϴ�.");
			} else {
				System.out.println("�����ܾ��� �����մϴ�.");
			}
		}		
	}
	
	void run() {
		
		while(true) {
			// ��ü ȸ������ ���
			showMember();
			// �޴� ���
			showMenu();
			// �޴� ����
			System.out.print("�޴��� �������ּ��� : ");
			int choice = scan.nextInt();
			// ȸ������
			if(choice == 1) { joinMember(); }
			// ȸ��Ż��
			else if(choice == 2) { delMember();	}
			// �α���
			else if(choice == 3) { login(); }
			// �α׾ƿ�
			else if(choice == 4) { logOut(); }
			// �Ա�
			else if(choice == 5) { income(); }
			// ��ü
			else if(choice == 6) { trans(); }
		}		
	}
}

public class Method_ATM {

	public static void main(String[] args) {
		
		Bank woori = new Bank();
		woori.name = "�츮����";
		
		woori.run();
	}

}
