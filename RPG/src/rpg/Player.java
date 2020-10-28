package rpg;

import java.util.ArrayList;

public class Player {
	static int money;
	static Guild guild = new Guild();
	static Inventory inven = new Inventory();
	
	Player(){
		money = 100000;
		guild.setGuild();
	}
	
	public void guildMenu() {
		guild.guildMenu();
	}
	
	public void inventoryMenu() {
		inven.inventoryMenu();
	}

	static public ArrayList<Unit> getGuildList(){
		return guild.guildList;
	}
	
	static public ArrayList<Item> getItemList(){
		return inven.itemList;
	}
	
	static public Unit getGuildUnit(int num) {
		return guild.getGuildUnit(num);
	}
	
	static public int getGuildSize() {
		return guild.guildList.size();
	}
	
	static public int getItemSize() {
		return inven.itemList.size();
	}

}
