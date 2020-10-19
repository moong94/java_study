package classEx;

class Student{
	String name;
	int score;
	void print() {
		System.out.println(name + " : " + score);
	}

}

public class Class_Array_문자열테스트 {

	public static void main(String[] args) {
		String data = "3\n"; 
		data +="김영희/30\n";
		data += "이만수/40\n";
		data += "이철민/60";
		
		
		System.out.println(data);

		//문제1)data에 있는 내용을 잘라서 st에 저장후 출력
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
		
		//문제2)꼴등 삭제후 다시 data에 저장
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
