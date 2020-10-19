package class_array;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

class Student_2{
	String id = "";
	String pw = "";
	void set_data(String i , String  p) {
		id = i; pw = p;
	}
	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
}
class Manager{
	Student_2 [] list = null;
	int count = 0;
	void add_student(Student_2 st) {
		if(count == 0) {
			list = new Student_2[1];
		}else if(count > 0) {
			Student_2[] temp = list;
			list = new Student_2[count + 1];
			for(int i = 0; i < count; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		list[count] = st;
		count += 1;
	}
	Student_2 remove_student(int index) {
		Student_2 del_st = list[index];
		if(count == 1) {
			list = null;
		}else if(count > 1) {
			Student_2 [] temp = list;
			list = new Student_2[count -1];
			for(int i = 0; i < index; i++) {
				list[i] = temp[i];
			}
			for(int i = index; i < count -1; i++) {
				list[i] = temp[i + 1];
			}
			temp = null;
		}
		count-=1;	
		return del_st;
	}
	int check_id(Student_2 st) {
		int check = -1;
		for(int i = 0; i < count; i++) {
			if(list[i].id.equals(st.id)) {
				check = i;
				break;
			}
		}
		return check;
	}
	void print_student() {
		for(int i = 0; i < count ;i++) {
			list[i].print_data();
		}
	}	
	String out_data() {
		String data = "";
		if(count == 0){
			return data;
		}
		data += count;
		data += "\n";
		for(int i = 0; i < count; i++) {
			data += list[i].id;
			data += ",";
			data += list[i].pw;
			if(count - 1 != i) {
				data += "\n";
			}
		}
		return data;
	}
	void sort_data() {
		for(int i = 0; i < count; i++) {
			for(int n = 0; n < count ; n++) {
				if(list[i].id.compareTo(list[n].id) > 0) {
					Student_2 temp = list[i];
					list[i] = list[n];
					list[n] = temp;
				}
			}
		}
	}
	void load_student(Student_2 [] temp , int c) {
		count = c;
		list = temp;
	}
	
}

public class Class_Array_학생관리 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Manager manager = new Manager();
		boolean run  = true;
		while(run) {
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드");
			int sel = scan.nextInt();
			if(sel == 1) {
				Student_2 temp = new Student_2();
				System.out.println("[가입] id 를 입력하세요 >>> ");
				temp.id = scan.next();			
				int check =  manager.check_id(temp);
				if(check == -1) {
					System.out.println("[가입] pw 를 입력하세요 >>> ");
					temp.pw = scan.next();
					manager.add_student(temp);	
					System.out.println(temp.id + "님 가입을 환영합니다.");
				}else {
					System.out.println("중복아이디 입니다.");
				}				
			}else if(sel == 2) {
				manager.print_student();
				Student_2 temp = new Student_2();
				System.out.println("[탈퇴] id 를 입력하세요 >>> ");
				temp.id = scan.next();	
				int check = manager.check_id(temp);
				if(check == -1) {
					System.out.println("없는 아이디입니다.");
				}else {
					Student_2 del_st = manager.remove_student(check);
					System.out.println(del_st.id + "님 탈퇴 되었습니다.");
				}
			}else if(sel == 3) {
				manager.sort_data();
				manager.print_student();
				
			}else if(sel == 4) {
				manager.print_student();
			}else if(sel == 5) {
                if(manager.count == 0)return;
				try {
					FileWriter fw =new FileWriter("student_manager.text");
					String data = manager.out_data();
					if(!data.equals("")) {
						fw.write(data);
						System.out.println(data);
					}
					fw.close();										
				} catch (Exception e) {e.printStackTrace();}
			}else if(sel == 6) {
				
				try {
					File file = new File("student_manager.text");
					if(file != null) {
						FileReader fr = new FileReader(file);
						BufferedReader br = new BufferedReader(fr);
						String line = br.readLine();
						int count = Integer.parseInt(line);
						Student_2 [] temp = new Student_2[count];
						for(int i = 0; i < count; i++) {
							temp[i] = new Student_2();
							line = br.readLine();
							String value[] = line.split(",");
							temp[i].id = value[0];
							temp[i].pw = value[1];
						}
						fr.close();
						br.close();
						manager.load_student(temp , count);
					}
					manager.print_student();
				}
				catch (Exception e) {e.printStackTrace();}
									
			}
		}

	}

}
