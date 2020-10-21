package arraylist;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// Vector �� ArrayList��  �Ȱ������̴�.
				// (ArrayList ������ ������������� ArrayList �� ������ ������.)
				
				Vector<Integer> list = new Vector<>();
					
				// add(value) : Vector�� �� �ڿ� value�� �߰��Ѵ�.
				list.add(10);
				list.add(20);
				list.add(30);
				list.add(40);
				list.add(50);
				System.out.println(list);

				// remove(index) : Vector�� index��° �����͸� �����Ѵ�.
		        list.remove(3);
		        System.out.println(list);

		        // size() : Vector�� ����� �������� ������ ���´�.
		        int count = list.size();
		        System.out.println("count = " + count);

		        // get() : Vector�� index��°�� value�� ���´�.
		        System.out.print("[");
		        for(int i=0; i<count; i++) {
		            System.out.print(list.get(i));
		            if(i != count - 1) {
		                System.out.print(", ");
		            }
		        }
		        System.out.println("]");
		        
		        // add(index, value) : Vector�� index��° ��ġ�� value�� �����Ѵ�.
		        list.add(0, 9);
		        System.out.println(list);
		        
		        // set(index, value) : Vector�� index��° ��ġ�� value�� �����Ѵ�.
		        list.set(3, 5);
		        System.out.println(list);

		        
		        // clear() : Vector�� ��� �����͸� �����Ѵ�.
		        list.clear();
		        System.out.println(list.size());
	}

}
