package rpg;

import java.util.ArrayList;

public class Item {
	static final int WEAPON = 1;
	static final int ARMOR = 2;
	static final int RING = 3;
	
	int kind;
	String name;
	int power;
	int price;
	
	public void setItem(int k, String n, int p, int pr) {
		kind = k;
		name = n;
		power = p;
		price = pr;
	}
}
