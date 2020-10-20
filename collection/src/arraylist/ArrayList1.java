package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(list);
			System.out.println("1.추가 2.삭제 3.삽입 4.종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("추가할 숫자를입력하세요 >> ");
				int num = scan.nextInt();
				list.add(num);
			}else if(sel == 2) {
				System.out.println(list);
				System.out.println("삭제할 인덱스를 입력하세요 >> ");
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
				System.out.println("삽입할 위치를 입력하세요 >> ");
				int pos = scan.nextInt();
				System.out.println("삽입할 값을 입력하세요 >> ");
				int value = scan.nextInt();
				list.add(pos , value);
			}
			else if(sel == 4) {
				System.out.println("종료");
				break;
			}
		}
	}

}
