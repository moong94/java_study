package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(list);
			System.out.println("1.�߰� 2.���� 3.���� 4.����");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("�߰��� ���ڸ��Է��ϼ��� >> ");
				int num = scan.nextInt();
				list.add(num);
			}else if(sel == 2) {
				System.out.println(list);
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
				System.out.println(list);
				System.out.println("������ ��ġ�� �Է��ϼ��� >> ");
				int pos = scan.nextInt();
				System.out.println("������ ���� �Է��ϼ��� >> ");
				int value = scan.nextInt();
				list.add(pos , value);
			}
			else if(sel == 4) {
				System.out.println("����");
				break;
			}
		}
	}

}
