package generic;

class MyVector<T> {
	private Object arr[] = null;
	private int count = 0;
	void add(T data) {
		if(count == 0) {
			arr = new Object[1];
		}else {
			Object[] temp = arr;
			arr = new Object[count + 1];
			for(int i = 0; i < count; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		arr[count] = data;
		count += 1;
	}
	int size() {
		return count;
	}
	T get(int index) {
		return (T)arr[index]; // 형변환 
	}
}

class User{
	String name;
	void print_name() {
		System.out.println(name);
	}
}

public class Generic {

	public static void main(String[] args) {
		// 제네릭 <> 꺽쇠를 말하며, 기존 ArrayList 나 Vector 의 완전한 모습이다.
		// MyVector는 ArrayList를 모방해서만들었다. 이형태이외 는 사용을 안하니 
		// 그냥 참고만하면된다. 
		
		MyVector<User> vec = new MyVector<>();
		User temp = new User();
		temp.name = "철수";
		vec.add(temp);
		temp = new User();
		temp.name = "민수";
		vec.add(temp);
		for(int i = 0; i < vec.size(); i++) {
			vec.get(i).print_name();
		}
	}

}
