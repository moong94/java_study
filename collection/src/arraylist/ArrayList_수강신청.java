package arraylist;

import java.util.Scanner;
import java.util.Random;
import java.util.Vector;

class Subject {
	String name;
	int score;
}

class SubjectManager {
	Vector<Subject> subjectList = new Vector<Subject>();
}

class StudentEx {
	String name;
	int number;
	SubjectManager sm = new SubjectManager();

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
		String[] name1 = { "김", "이", "박", "최", "정" };
		String[] name2 = { "선", "재", "명", "지", "다" };
		String[] name3 = { "태", "민", "수", "연", "빈" };

		int r = ran.nextInt(name1.length);
		name += name1[r];
		r = ran.nextInt(name2.length);
		name += name2[r];
		r = ran.nextInt(name3.length);
		name += name3[r];

		return name;
	}

	void init() {
		studentList = new Vector<StudentEx>();
		int num = 1001;
		for (int i = 0; i < 5; i++) {
			StudentEx st = new StudentEx();
			st.name = setRandomName();
			st.number += (num + i);
			studentList.add(st);
		}
		
	}

	void printAllStudent() {
		for (int i = 0; i < studentList.size(); i++) {
			studentList.get(i).studentPrint();
		}
	}
	
	void user() {
		if(this.log == -1) {
			System.out.println("....");
		}
		else {
			System.out.println(studentList.get(log).name + " 로그인 중....");
		}
	}
	
	int select() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 과목 수강");
		System.out.println("4. 수강 철회");
		System.out.println("5. 전체 수강내용 조회");
		System.out.println("6. 종료.");
		System.out.print("메뉴 입력 : ");
		int select = scan.nextInt();
		
		return select;
	}
	void login() {
		Scanner scan = new Scanner(System.in);
		
		if(this.log != -1) {
			System.out.println("로그아웃 후 이용 가능.");
			return;
		}
		
		System.out.print("이름 입력 : ");
		String input_name = scan.next();
		
		for(int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).name.equals(input_name)) {
				this.log = i;
			}
		}
		if(log == -1) {
			System.out.println("입력 오류");
		}
		else {
			System.out.println("로그인 되었습니다.");
		}
	}
	
	
	void logout() {
		if(log == -1) {
			System.out.println("로그인 후 이용가능");
			return;
		}
		
		log = -1;
		System.out.println("로그아웃 되었습니다.");
	}
	
	void add_subject() {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		if(log == -1) {
			System.out.println("로그인 후 이용가능");
			return;
		}
		System.out.println("1. JAVA");
		System.out.println("2. C");
		System.out.println("3. C++");
		System.out.println("4. PYTHON");
		System.out.print("추가할 과목 입력 : ");
		int input = scan.nextInt();
		
		Subject sb = new Subject();
		
		if(input == 1) {
			sb.name = "JAVA";
			sb.score = ran.nextInt(100) + 1;
			
			studentList.get(log).sm.subjectList.add(sb);
		}
		else if(input == 2) {
			sb.name = "C";
			sb.score = ran.nextInt(100) + 1;
			
			studentList.get(log).sm.subjectList.add(sb);
		}
		else if(input == 3) {
			sb.name = "C++";
			sb.score = ran.nextInt(100) + 1;
			
			studentList.get(log).sm.subjectList.add(sb);
		}
		else if(input == 4) {
			sb.name = "PYTHON";
			sb.score = ran.nextInt(100) + 1;
			
			studentList.get(log).sm.subjectList.add(sb);
		}
	}
	
	void del_subject() {
		Scanner scan = new Scanner(System.in);
		
		if(log == -1) {
			System.out.println("로그인 후 이용가능");
			return;
		}
		int count = studentList.get(log).sm.subjectList.size();
		
		for(int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + studentList.get(log).sm.subjectList.get(i).name);
		}
		System.out.print("삭제 과목 입력 : ");
		int input = scan.nextInt();
		
		if(input < 1 || input > count) {
			System.out.println("입력 오류");
		}
		else {
			studentList.get(log).sm.subjectList.remove(input - 1);
		}
	}
	
	void show_all() {
		for(int i = 0; i < studentList.size(); i++) {
			studentList.get(i).studentPrint();
			for(int j = 0; j < studentList.get(i).sm.subjectList.size(); j++) {
				System.out.println((j + 1) + ". " + studentList.get(i).sm.subjectList.get(j).name + " : " + studentList.get(i).sm.subjectList.get(j).score + "점");
			}
		}
	}
	
	
	
	void run() {
		while(true) {
			user();
			
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
				del_subject();
			}
			else if(sel == 5) {
				show_all();
			}
			else if(sel == 6) {
				System.out.println("종료");
				break;
			}
			
		}
		
	}
}
	
public class ArrayList_수강신청 {

	public static void main(String[] args) {
		StudentExManager sm = new StudentExManager();
		
		sm.init();
		sm.printAllStudent();
		// 기능추가
        // 1.로그인 (그냥이름으로 로그인)
        // 2.수강과목 추가 삭제 전체출력등 기능추가 (자바 ,파이썬 , 씨언어 .. 등등)
		sm.run();
		
	}

}
