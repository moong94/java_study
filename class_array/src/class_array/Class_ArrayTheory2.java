package class_array;

class Client{
	String name;
	int score;
	void set_data(String n , int s) {  //���ڸ� �����ϴ� ���� "�Ű�����"
		this.name = n ; this.score = s;
	}
	void print_data() {
		System.out.println(this.name  + " : " + this.score);
	}
}


public class Class_ArrayTheory2 {

	public static void main(String[] args) {
		Client [] st = new Client[3];
		for(int i = 0; i < st.length; i++) {
			st[i] = new Client();
		}
		st[0].set_data("��ö��",100); // ���� ���� "����"
		st[1].set_data("�̸���",20);
		st[2].set_data("�ڿ���",70);
		
		for(int i = 0 ; i < st.length; i++) {
			st[i].print_data();
		}
	}

}
