package class_array;

class Subject{
	String name;
	int score;
}

class Student{
	Subject[] subjects;
	String name;
}

public class Class_ArrayTheory4 {

	public static void main(String[] args) {
		Student[] st = new Student[3];
		
		st[0] = new Student();
		st[0].subjects = new Subject[3];
		
		for(int i = 0; i < 3; i++) {
			st[0].subjects[i] = new Subject();
		}
		
		st[1] = new Student();
		st[1].subjects =new Subject[2];
		st[1].subjects[0] = new Subject();
		st[1].subjects[1] = new Subject();
		
		st[2] = new Student();
		st[2].subjects = new Subject[1];
		st[2].subjects[0] = new Subject();
	}

}
