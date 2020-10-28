package rpg;

import java.util.ArrayList;

public class Guild {
	final int PARTY_SIZE = 4;
	ArrayList<Unit> guildList = new ArrayList<>();
	Unit[] partyList;
	
	public void setGuild() {
		Unit temp = new Unit("ȣ����", 1, 100, 10, 5, 0);
		guildList.add(temp);
		temp = new Unit("������", 1, 80, 7, 3, 0);
		guildList.add(temp);
		temp = new Unit("�罿", 1, 50, 3, 1, 0);
		guildList.add(temp);
		temp = new Unit("�δ���", 1, 70, 5, 2, 0);
		guildList.add(temp);
		temp = new Unit("����", 1, 200, 4, 8, 0);
		guildList.add(temp);
		temp = new Unit("����", 1, 120, 11, 7, 0);
		guildList.add(temp);
		
		for(int i = 0 ; i < 4; i++) {
			guildList.get(i).party = true;
		}
		
		partyList = new Unit[PARTY_SIZE];
		int n = 0;
		for(int i = 0; i < guildList.size(); i++) {
			if(guildList.get(i).party == true) {
				partyList[n] = guildList.get(i);
				n++;
			}
		}
	}
	
	public Unit getGuildUnit(int num) {
		return guildList.get(num);
	}
	
	public void printParty() {
		System.out.println("==========[��Ƽ��]=========");
		for(int i = 0; i < PARTY_SIZE; i++) {
			System.out.print("[" + (i + 1) + "��]");
			System.out.print("[�̸� : " + partyList[i].name + "]");
			System.out.print("[���� : " + partyList[i].level + "]");
			System.out.print("[ü�� : " + partyList[i].hp + "]");
			System.out.println(" / " + partyList[i].maxHp + "]");
			System.out.print("[���ݷ� : " + partyList[i].att + "]");
			System.out.print("[���� : " + partyList[i].def + "]");
			System.out.println("[��Ƽ�� : " + guildList.get(i).party + "]");
			System.out.println("");
		}
		System.out.println("=========================");
	}
	void printAllUnitStatus() {
		System.out.println("=========================");
		System.out.println("[��� : " + Player.money + "]");
		System.out.println("==========[����]=========");
		for(int i = 0; i < guildList.size(); i++) {
			System.out.print("[" + (i + 1) + "��]");
			System.out.print("[�̸� : " + guildList.get(i).name + "]");
			System.out.print("[���� : " + guildList.get(i).level + "]");
			System.out.print("[ü�� : " + guildList.get(i).hp + "]");
			System.out.println(" / " + guildList.get(i).maxHp + "]");
			System.out.print("[���ݷ� : " + guildList.get(i).att + "]");
			System.out.print("[���� : " + guildList.get(i).def + "]");
			System.out.println("[��Ƽ�� : " + guildList.get(i).party + "]");
			System.out.println("");
		}
		System.out.println("=========================");
	}
	
	public void buyUnit() {
		if(Player.money < 5000) {
			return;
		}
		
		String[] n1 = { "��", "��", "��", "��", "��", "��", "��"};
		String[] n2 = { "��", "��", "��", "��", "��", "��", "��"};
		String[] n3 = { "��", "��", "��", "��", "��", "��", "ö"};
		
		String name = n1[MainGame.ran.nextInt(n1.length)];
		name += n2[MainGame.ran.nextInt(n2.length)];
		name += n3[MainGame.ran.nextInt(n3.length)];
		
		int ran = MainGame.ran.nextInt(8) + 2;
		
		int hp = ran * 11;
		int att = ran + 1;
		int def = ran / 2 + 1;
		
		Unit temp = new Unit(name, 1, hp, att, def, 0);

		System.out.println("=========================");
		System.out.print("[�̸� : " + name + "]");
		System.out.print("[���� : " + 1 + "]");
		System.out.print("[ü�� : " + hp);
		System.out.println(" / " + hp + "]");
		System.out.print("[���ݷ� : " + att + "]");
		System.out.println("[���� : " + def + "]");
		System.out.println("������ �߰��մϴ�.");
		System.out.println("=========================");
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		guildList.add(temp);
		Player.money -= 5000;
			
	}
	
	void removeUnit() {
		printAllUnitStatus();
		
		System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
		int sel = MainGame.scan.nextInt();
		
		if(guildList.get(sel - 1).party) {
			System.out.println("��Ƽ���� ����� ������ �� �����ϴ�.");
		}
		else {
			System.out.println("=========================");
			System.out.print("[�̸� : " + guildList.get(sel - 1).name + "]");
			System.out.println("������ �����մϴ�.");
			System.out.println("=========================");
			guildList.remove(sel - 1);
		}
	}
	
	public void partyChange() {
		printParty();
		System.out.print("��ü�� ��ȣ�� �Է��ϼ��� : ");
		int partyNum = MainGame.scan.nextInt();
		printAllUnitStatus();
		System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
		int guildNum = MainGame.scan.nextInt();
		
		partyList[partyNum - 1].party = false;
		guildList.get(guildNum - 1).party = true;
		
		System.out.println("=========================");
		System.out.print("[�̸� : " + partyList[partyNum - 1].name + "]");
		System.out.print("����");
		System.out.print("[�̸� : " + guildList.get(guildNum - 1).name + "]");
		System.out.println("���� ��Ƽ���� ��ü�մϴ�.");
		System.out.println("=========================");
	
		int n = 0;
		for(int i = 0; i < guildList.size(); i++) {
			if(guildList.get(i).party) {
				partyList[n] = guildList.get(i);
				n++;
			}
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
//	void partySort() {
//		System.out.println("");
//	}
	
	public void guildMenu() {
		while(true) {
			System.out.println("============������===========");
			System.out.println("[1.�����] [2.�����߰�] [3.��������]");
			System.out.println("[4.��Ƽ����ü] [5.����] [0.�ڷΰ���]");
			
			int sel = MainGame.scan.nextInt();
			
			if(sel == 1) {
				printAllUnitStatus();
			}
			else if(sel == 2) {
				buyUnit();
			}
			else if(sel == 3) {
				removeUnit();
			}
			else if(sel == 4) {
				partyChange();
			}
			else if(sel == 5) {
//				partySort();
			}
			else if(sel == 0) {
				break;
			}
		}
	}

	public void printUnitStatus(int num) {
		guildList.get(num).printStatus();
		
	}

	public void printUnitItem(int num) {
		guildList.get(num).printEquiptedItem();
		
	}
	
}
