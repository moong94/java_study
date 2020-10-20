package classEx;

class Test{
	int num;
	int size;
	char[] data;
	void print() {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

}

public class Class_Array_문자열테스트2 {

	public static void main(String[] args) {
		String data ="6\n";
		data += "0/2/a/b\n";
		data += "1/3/a/b/c\n";
		data += "2/5/a/b/c/d/e\n";
		data += "3/4/a/b/c/d\n";
		data += "4/3/a/b/c\n";
		data += "5/1/a";
		System.out.println(data);	

		Test[] t;	
        // data의 정보를 클래스배열에 저장.
		
		String line[] = data.split("\n");
		
		int size = Integer.parseInt(line[0]);
		
		t = new Test[size];
		for(int i = 0 ; i < size; i++) {
			t[i] = new Test();
		}
		
		
		
		for(int i = 0; i < size; i++) {
			String new_data[] = line[i + 1].split("/");
			t[i].num = Integer.parseInt(new_data[0]);
			t[i].size = Integer.parseInt(new_data[1]);
			
			t[i].data = new char[t[i].size];
			
			for(int j = 0; j < t[i].size; j++) {
				t[i].data[j] = new_data[j + 2].charAt(0);
			}
			
		}
		for(int i = 0; i < size; i++) {
			t[i].print();
		}
	}

}
