package rpg;

public class Unit {
	String name;
	int level;
	int hp;
	int maxHp;
	int att;
	int def;
	int exp;
	boolean party;
	Item weapon;
	Item armor;
	Item ring;
	public Unit(String n, int l, int h, int a, int d, int e) {
		name = n;
		level = l;
		maxHp = h;
		att = a;
		def = d;
		exp = e;
		hp = maxHp;
		party = false;
		weapon = null;
		armor = null;
		ring = null;
	}
	
	public Unit(String n, int l, int h, int a, int d, int e, boolean p) {
		name = n;
		level = l;
		maxHp = h;
		att = a;
		def = d;
		exp = e;
		hp = maxHp;
		party = p;
		weapon = null;
		armor = null;
		ring = null;
	}
	
	public void setItem(Item w, Item a, Item r) {
		weapon = w;
		armor = a;
		ring = r;
	}

	public void printStatus() {
		System.out.print("[이름 : " + name + "]");
		System.out.print("[레벨 : " + level + "]");
		
		if(ring != null) {
			System.out.print("[체력 : " + hp + " + " + ring.power);
		}
		else {
			System.out.println("[체력 : " + hp);
		}
		if(ring != null) {
			System.out.print(" / " + maxHp + " + " + ring.power + "]");
		}
		else {
			System.out.println(" / " + maxHp + "]");
		}
		if(weapon != null) {
			System.out.print("[공격력 : " + att + " + " + weapon.power + "]");
		}
		else {
			System.out.print("[공격력 : " + att + "]");
		}
		if(armor != null) {
			System.out.print("[방어력 : " + def + " + " + armor.power + "]");
		}
		else {
			System.out.print("[방어력 : " + def + "]");
		}
		System.out.println("[파티중 : " + party + "]");		
	}

	public void printEquiptedItem() {
		if(weapon == null) {
			System.out.println("[무기 : 없음]");
		}
		else {
			System.out.println("[무기 : " + weapon.name + "]");
		}
		if(armor == null) {
			System.out.println("[방어구 : 없음]");
		}
		else {
			System.out.println("[방어구 : " + armor.name + "]");
		}
		if(ring == null) {
			System.out.println("[반지 : 없음]");
		}
		else {
			System.out.println("[반지 : " + ring.name + "]");
		}
		
	}
	
}
