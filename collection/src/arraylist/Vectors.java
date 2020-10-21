package arraylist;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		// Vector 는 ArrayList와  똑같은것이다.
				// (ArrayList 이전에 만들어진것으로 ArrayList 가 성능이 더좋다.)
				
				Vector<Integer> list = new Vector<>();
					
				// add(value) : Vector의 맨 뒤에 value를 추가한다.
				list.add(10);
				list.add(20);
				list.add(30);
				list.add(40);
				list.add(50);
				System.out.println(list);

				// remove(index) : Vector의 index번째 데이터를 제거한다.
		        list.remove(3);
		        System.out.println(list);

		        // size() : Vector에 저장된 데이터의 개수를 얻어온다.
		        int count = list.size();
		        System.out.println("count = " + count);

		        // get() : Vector의 index번째의 value를 얻어온다.
		        System.out.print("[");
		        for(int i=0; i<count; i++) {
		            System.out.print(list.get(i));
		            if(i != count - 1) {
		                System.out.print(", ");
		            }
		        }
		        System.out.println("]");
		        
		        // add(index, value) : Vector의 index번째 위치에 value를 삽입한다.
		        list.add(0, 9);
		        System.out.println(list);
		        
		        // set(index, value) : Vector의 index번째 위치에 value를 수정한다.
		        list.set(3, 5);
		        System.out.println(list);

		        
		        // clear() : Vector의 모든 데이터를 제거한다.
		        list.clear();
		        System.out.println(list.size());
	}

}
