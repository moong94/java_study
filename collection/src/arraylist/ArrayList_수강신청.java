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
		
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 수강과목 추가");
		System.out.println("4. 수강과목 삭제");
		System.out.println("5. 전체 수강과목 출력");
		System.out.println("6. 종료");
		System.out.print("입력 : ");
		int select = scan.nextInt();
		
		return select;
	}
	
	void login_inform() {
		if(this.log == -1) {
			System.out.println("로그아웃 상태....");
		}
		else {
			System.out.println(studentList.get(log).name + " 로그인 중....");
		}
	}
	
	void login() {
		Scanner scan = new Scanner(System.in);
		
		if(this.log != -1) {
			System.out.println("로그 아웃 후 이용가능");
			return;
		}
		System.out.print("로그인 할 이름 입력 : ");
		String input_name = scan.next();
		
		for(int i = 0; i < studentList.size(); i++) {
			if(input_name.equals(studentList.get(i).name)) {
				System.out.println("로그인 되었습니다.");
				this.log = i;
			}
		}
	}
	
	void logout() {
		if(this.log == -1) {
			System.out.println("로그인 후 이용가능");
			return;
		}
		else {
			System.out.println("로그아웃 되었습니다.");
			this.log = -1;
		}
	}
	void add_subject() {
		if(this.log == -1) {
			System.out.println("로그인 후 이용가능");
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
			System.out.print("과목 선택 : ");
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
				System.out.println("입력오류");
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
			System.out.println("로그인 후 이용가능");
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
			System.out.println("철회할 과목이 없습니다.");
			return;
		}
		System.out.print("철회할 과목 입력 : ");
		int input_number = scan.nextInt();
		
		if(input_number < 1 || input_number > number - 1) {
			System.out.println("입력오류");
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
			System.out.println(sb.subjectList.get(i).subject_name + "\t" + studentList.get(sb.subjectList.get(i).log) + " 수강중");
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
		sm.printAllStudentEx();
		// 기능추가
        // 1.로그인 (그냥이름으로 로그인)
        // 2.수강과목 추가 삭제 전체출력등 기능추가 (자바 ,파이썬 , 씨언어 .. 등등)
		sm.run();
	}

}
