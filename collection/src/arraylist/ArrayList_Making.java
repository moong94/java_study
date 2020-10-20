package arraylist;

import java.util.Scanner;

class MyList {

	int[] arr;
	int count;

	void print() {
		System.out.print("[");
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i]);
			if (i != count - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	void add(int value) {
		if (count == 0) {
			arr = new int[count + 1];
		} else if (count > 0) {
			int[] temp = arr;
			arr = new int[count + 1];

			for (int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}

		arr[count] = value;
		count += 1;
	}

	void add(int index, int value) {
		if (count == 0) {
			arr = new int[count + 1];
		} else if (count > 0) {
			int[] temp = arr;
			arr = new int[count + 1];

			int j = 0;
			for (int i = 0; i < count + 1; i++) {
				if (i != index) {
					arr[i] = temp[j];
					j += 1;
				}
			}
			temp = null;
		}

		arr[index] = value;
		count += 1;
	}

	void remove(int index) {
		if (count == 1) {
			arr = null;
		} else if (count > 1) {
			int[] temp = arr;
			arr = new int[count - 1];

			int j = 0;
			for (int i = 0; i < count; i++) {
				if (i != index) {
					arr[j] = temp[i];
					j += 1;
				}
			}
			temp = null;
		}
		count -= 1;
	}

	int size() {
		return count;
	}

	int get(int index) {
		return arr[index];
	}

	void set(int index, int value) {
		arr[index] = value;
	}

	void clear() {
		arr = null;
		count = 0;
	}
	
}

public class ArrayList_Making {

	public static void main(String[] args) {
		MyList list =new MyList();
		Scanner scan = new Scanner(System.in);
		while(true) {
			list.print();
			
			System.out.println("1.�߰� 2.���� 3.���� 4.�ʱ�ȭ 5.����");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("�߰��� ���ڸ��Է��ϼ��� >> ");
				int num = scan.nextInt();
				list.add(num);
			}else if(sel == 2) {
				list.print();
				System.out.println("������ �ε����� �Է��ϼ��� >> ");
				int index = scan.nextInt();
				if(list.size() <= 0) {
					continue;
				}
				if(index < 0) {
					continue;
				}
				if(index >= list.size()) {
					continue;
				}
				list.remove(index);
				
			}else if(sel == 3) {
				list.print();
				System.out.println("������ ��ġ�� �Է��ϼ��� >> ");
				int pos = scan.nextInt();
				System.out.println("������ ���� �Է��ϼ��� >> ");
				int value = scan.nextInt();
				list.add(pos , value);
				
			}else if(sel == 4) {
				list.clear();
			}else if(sel == 5) {
				System.out.println("����");
				break;
			}
			
		}
		scan.close();
	}

}
