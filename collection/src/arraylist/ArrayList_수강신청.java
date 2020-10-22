package arraylist;

import java.util.Scanner;
import java.util.Random;
import java.util.Vector;

class Subject {
	String subject_name;
	int log;
	
}

class SubjectManager {
	Vector<Subject> subjectList;
	
	int count = 0;
	
	void init() {
		subjectList = new Vector<>();
		
		
	}
}

class StudentEx {
	String name;
	int number;
	SubjectManager sm;

	void studentPrint() {
		System.out.println(number + " " + name);
	}
}

class StudentExManager {
	Vector<StudentEx> studentList;

	int log = -1;
	
	String setRandomName() {
		Random ran = new Random();
		String name = "";
		String[] name1 = { "��", "��", "��", "��", "��" };
		String[] name2 = { "��", "��", "��", "��", "��" };
		String[] name3 = { "��", "��", "��", "��", "��" };

		int r = ran.nextInt(name1.length);
		name += name1[r];
		r = ran.nextInt(name2.length);
		name += name2[r];
		r = ran.nextInt(name3.length);
		name += name3[r];

		return name;
	}

	void init() {
		studentList = new Vector<>();
		int num = 1001;
		for (int i = 0; i < 5; i++) {
			StudentEx st = new StudentEx();
			st.name = setRandomName();
			st.number += (num + i);
			studentList.add(st);
		}
		
	}

	void printAllStudentEx() {
		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).studentPrint();
		}
	}
	
	int select() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. �α���");
		System.out.println("2. �α׾ƿ�");
		System.out.println("3. �������� �߰�");
		System.out.println("4. �������� ����");
		System.out.println("5. ��ü �������� ���");
		System.out.println("6. ����");
		System.out.print("�Է� : ");
		int select = scan.nextInt();
		
		return select;
	}
	
	void login_inform() {
		if(this.log == -1) {
			System.out.println("�α׾ƿ� ����....");
		}
		else {
			System.out.println(studentList.get(log).name + " �α��� ��....");
		}
	}
	
	void login() {
		Scanner scan = new Scanner(System.in);
		
		if(this.log != -1) {
			System.out.println("�α� �ƿ� �� �̿밡��");
			return;
		}
		System.out.print("�α��� �� �̸� �Է� : ");
		String input_name = scan.next();
		
		for(int i = 0; i < studentList.size(); i++) {
			if(input_name.equals(studentList.get(i).name)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				this.log = i;
			}
		}
	}
	
	void logout() {
		if(this.log == -1) {
			System.out.println("�α��� �� �̿밡��");
			return;
		}
		else {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			this.log = -1;
		}
	}
	void add_subject() {
		if(this.log == -1) {
			System.out.println("�α��� �� �̿밡��");
			return;
		}
		else {
			SubjectManager sb = new SubjectManager();
			Scanner scan = new Scanner(System.in);

			String subject_name = "";
			
			System.out.println("1. JAVA");
			System.out.println("2. C");
			System.out.println("3. C++");
			System.out.println("4. PYTHON");
			System.out.print("���� ���� : ");
			int select_subject = scan.nextInt();
			if(select_subject == 1) {
				subject_name += "JAVA";
			}
			else if(select_subject == 2) {
				subject_name += "C";
			}
			else if(select_subject == 3) {
				subject_name += "C++";
			}
			else if(select_subject == 4) {
				subject_name += "PYTHON";
			}
			
			else {
				System.out.println("�Է¿���");
				return;
			}
			
			Subject a = new Subject();
			
			
			sb.subjectList.get(sb.count).subject_name = subject_name;
			sb.subjectList.get(sb.count).log = log;
			sb.count++;
		}
	}
	
	void remove_subject() {
		SubjectManager sb = new SubjectManager();
		Scanner scan = new Scanner(System.in);
		
		if(this.log == -1) {
			System.out.println("�α��� �� �̿밡��");
			return;
		}
		int number = 1;
		int logidx[] = new int[1];
		for(int i = 0; i < sb.subjectList.size(); i++) {
			if(sb.subjectList.get(i).log == this.log) {
				System.out.println(number + ". " + sb.subjectList.get(i).subject_name);
				int tmp[] = logidx;
				logidx = new int[number];
				for (int j = 0; j < logidx.length; j++) {
					logidx[j] = tmp[j];
				}
				logidx[number - 1] = i;
				number++;
			}
		}
		
		if(number == 1) {
			System.out.println("öȸ�� ������ �����ϴ�.");
			return;
		}
		System.out.print("öȸ�� ���� �Է� : ");
		int input_number = scan.nextInt();
		
		if(input_number < 1 || input_number > number - 1) {
			System.out.println("�Է¿���");
			return;
		}
		else {
			for(int i = 0; i < sb.subjectList.size(); i++) {
				sb.subjectList.remove(logidx[input_number - 1]);
			}
		}
		
	}
	
	void confirm_subject() {
		SubjectManager sb = new SubjectManager();
		if(sb.subjectList.size() == 0) {
			return;
		}
		for(int i = 0; i < sb.subjectList.size(); i++) {
			System.out.println(sb.subjectList.get(i).subject_name + "\t" + studentList.get(sb.subjectList.get(i).log) + " ������");
		}
		
	}
	
	
	void run() {
		
		while(true) {
			login_inform();
			
			int sel = select();
			if(sel == 1) {
				login();
			}
			else if(sel == 2) {
				logout();
			}
			else if(sel == 3) {
				add_subject();
			}
			else if(sel == 4) {
				remove_subject();
			}
			else if(sel == 5) {
				confirm_subject();
			}
			else if(sel == 6) {
				System.out.println("����");
				break;
			}
		}
	}
}

public class ArrayList_������û {

	public static void main(String[] args) {
		StudentExManager sm = new StudentExManager();
		sm.init();
		sm.printAllStudentEx();
		// ����߰�
        // 1.�α��� (�׳��̸����� �α���)
        // 2.�������� �߰� ���� ��ü��µ� ����߰� (�ڹ� ,���̽� , ����� .. ���)
		sm.run();
	}

}
