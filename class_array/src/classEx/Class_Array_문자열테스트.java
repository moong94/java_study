package classEx;

class Student{
	String name;
	int score;
	void print() {
		System.out.println(name + " : " + score);
	}

}

public class Class_Array_���ڿ��׽�Ʈ {

	public static void main(String[] args) {
		String data = "3\n"; 
		data +="�迵��/30\n";
		data += "�̸���/40\n";
		data += "��ö��/60";
		
		
		System.out.println(data);

		//����1)data�� �ִ� ������ �߶� st�� ������ ���
		int count;
		
		
		String new_data[] = data.split("\n");
		
		count = Integer.parseInt(new_data[0]);
		
		Student st = new Student();
		Student[] studentList = new Student[count];
		String row[] = new String[count];
		
		for(int i = 0; i < count; i++) {
			row[i] = new_data[i + 1];
		}
		
		for(int i = 0; i < row.length; i++) {
			String data_s[] = row[i].split("/");
			studentList[i] = new Student();
			studentList[i].name = data_s[0];
			studentList[i].score = Integer.parseInt(data_s[1]);
			studentList[i].print();
		}
		
		//����2)�õ� ������ �ٽ� data�� ����
		int min = studentList[0].score;
		int minidx = 0;
		
		for(int i = 0; i < studentList.length; i++) {
			if(min > studentList[i].score) {
				min = studentList[i].score;
				minidx = i;
			}
		}
		
		data = (count - 1) + "\n";
		for(int i = 0; i < studentList.length; i++) {
			if(i != minidx) {
				data += studentList[i].name + "/" + studentList[i].score + "\n";
			}
		}
		
		System.out.println(data);
	}

}
