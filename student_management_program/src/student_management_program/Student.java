package student_management_program;

public class Student {
	private int num;
	private String id;
	private String name;
	public void print() {
		System.out.println(num + " " + id + " " + name);
	}
	
	public Student(int num , String id , String name) {
		this.num = num;
		this.id = id;
		this.name = name;
	}	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
