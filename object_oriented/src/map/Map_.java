package map;

import java.util.Map;
import java.util.HashMap;

public class Map_ {

	public static void main(String[] args) {
	// === map === 은 
		// 1) 기존의 배열은 index 가 자동으로 0,1,2...순서로 생성되었지만
		// 2) map 은 index 부분을 직접 설정하는것을 말한다. 
		// 3) map 은 index 를 String 으로 저장하고 Key 바꾸어부른다.
		
//				HashMap은 K(Key)에 V(Value)를 할당하는 방식으로 저장된다.
//				Key는 String으로 하고 Value는 HashMap에 저장할 데이터의 타입을 쓴다. 
		Map<String, Integer> hmap = new HashMap<>();
		
//				(key, value) : HashMap의 key에 value를 할당한다.
		hmap.put("apple", 1000);
		hmap.put("orange", 1500);
		hmap.put("melon", 5000);
		hmap.put("water melon", 15000);
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
		
//				get(key) : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println(hmap.get("melon"));
		System.out.println("============================================================");
		
//				put() 메소드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다.
		hmap.put("apple", 1234);
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
		
//				keySet() : HashMap의 key만 얻어온다.
		System.out.println(hmap.keySet());
		System.out.println("============================================================");
//				향상된 for와 keySet() 메소드를 사용하면 HaskMap에 저장된 모든 데이터를 얻어올 수 있다.
		int sum = 0;
		for(String key : hmap.keySet()) {
//					System.out.println(key);				// HashMap의 모든 key를 얻어올 수 있다.
			System.out.println(hmap.get(key));		// HashMap의 모든 key에 할당된 value를 얻어올 수 있다.
			sum += hmap.get(key);
		}
		System.out.println("금액 합계 : " + sum);
		System.out.println("============================================================");
		
//				remove(key) : HashMap의 key에 해당되는 값을 제거한다.
		hmap.remove("apple");
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
		
//				clear() : HashMap의 모든 값을 제거한다.
		hmap.clear();
		System.out.println(hmap.size() + " : " + hmap);
		System.out.println("============================================================");
				
	}

}
