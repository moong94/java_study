package class_array;

import java.util.Scanner;


public class Class_Array_학생추가컨트롤러 {

	public static void main(String[] args) {
		Student[] st = new Student[3];

		Scanner scan = new Scanner(System.in);
	
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100

		int count = 0; // 학생 수

		while (true) {
			System.out.println("[1]학생 추가하기"); // 이름 입력받아 추가
			System.out.println("[2]과목 추가하기"); // 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기"); // 이름과 과목 그리고 성적 입력받아 추가

			int choice = scan.nextInt();
			
			//학생 추가
			if (choice == 1) {
				
				if(count == 3) {
					System.out.println("학생을 더이상 추가할 수 없습니다.");
					continue;
				}
				else {
					
					System.out.print("학생 이름 입력 : ");
					String student = scan.next();
				
					st[count] = new Student();
					st[count].name = student;
					count++;
				}
			} 
			
			//과목 추가
			else if (choice == 2) {
				int check = -1;
				
				System.out.print("학생 이릅 입력 :");
				String student = scan.next();
				
				for(int i = 0; i < count; i++) {
					if(st[i].name.equals(student)) {
						check = i;
					}
				}
				
				if(check == -1){
					System.out.println("없는 이름입니다.");
					continue;
				}
				
				else {
					System.out.print("추가할 과목 입력 : ");
					String subject = scan.next();
					
					if(st[check].subjects == null) {
						st[check].subjects = new Subject[1];
						st[check].subjects[0] = new Subject();
						
						st[check].subjects[0].name = subject;
					}
					else {
						int size = st[check].subjects.length;
						
						Subject tmp[] = st[check].subjects;
						
						
						st[check].subjects = new Subject[size + 1];
						st[check].subjects[size] = new Subject();
						
						for(int i = 0; i < size; i++) {
							st[check].subjects[i] = tmp[i];
						}
						int sub_check = -1;
						
						
						for(int i = 0; i < size; i++) {
							if(st[check].subjects[i].name.equals(subject)) {
								sub_check = i;
							}
						}
						
						if(sub_check == -1) {
							st[check].subjects[size].name = subject;
						}
						else {
							System.out.println("이미 추가 된 과목입니다.");
							continue;
						}
					}	
				}
			} 
			
			//성적 추가
			else if (choice == 3) {
				int check = -1;
				
				System.out.print("학생 이릅 입력 :");
				String student = scan.next();
				
				for(int i = 0; i < count; i++) {
					if(st[i].name.equals(student)) {
						check = i;
					}
				}
				
				if(check == -1){
					System.out.println("없는 이름입니다.");
					continue;
				}
				else {
					System.out.print("과목 입력 : ");
					String subject = scan.next();
					
					int sub_check = -1;
					
					for(int i = 0; i < st[check].subjects.length; i++) {
						if(st[check].subjects[i].name.equals(subject)) {
							sub_check = i;
						}
					}
					
					if(sub_check == -1) {
						System.out.println("과목 입력 오류");
						continue;
					}
					else {
						System.out.print("점수 입력 : ");
						int score = scan.nextInt();
						
						st[check].subjects[sub_check].score = score;
						
						for(int i = 0 ; i < count; i++) {
							if(st[i].subjects == null) {
								System.out.print(st[i].name + " : 과목 0개");
							}
							else {
								System.out.print(st[i].name + " : 과목" + st[i].subjects.length + "개 ");
								for(int j = 0; j < st[i].subjects.length; j++) {
									System.out.print(st[i].subjects[j].name + " " + st[i].subjects[j].score + "점 ");
								}
							}
							System.out.println();
						}
						
					}
				}
			}
			
		}
		
		
	}

}
