package arraylist;

import java.util.ArrayList;

class Tv {
	String name;
	String brand;
	int price;

	Tv(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Tv> list = new ArrayList<>();

		Tv temp = new Tv("TV", "�Ｚ", 1000);
		list.add(temp);

		temp = new Tv("�ñ״�óTV", "����", 2000);
		list.add(temp);

		temp = new Tv("����ƮTV", "����", 3000);
		list.add(temp);

		temp = list.get(1);
		System.out.println(temp.name);
		
		temp = list.get(2);
		System.out.println(temp.name);
	}

}
