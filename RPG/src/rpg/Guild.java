package rpg;

import java.util.ArrayList;

public class Guild {
	final int PARTY_SIZE = 4;
	ArrayList<Unit> guildList = new ArrayList<>();
	Unit[] partyList;
	
	public void setGuild() {
		Unit temp = new Unit("호랑이", 1, 100, 10, 5, 0);
		guildList.add(temp);
		temp = new Unit("강아지", 1, 80, 7, 3, 0);
		guildList.add(temp);
		temp = new Unit("사슴", 1, 50, 3, 1, 0);
		guildList.add(temp);
		temp = new Unit("두더지", 1, 70, 5, 2, 0);
		guildList.add(temp);
		temp = new Unit("돼지", 1, 200, 4, 8, 0);
		guildList.add(temp);
		temp = new Unit("사자", 1, 120, 11, 7, 0);
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
		System.out.println("==========[파티원]=========");
		for(int i = 0; i < PARTY_SIZE; i++) {
			System.out.print("[" + (i + 1) + "번]");
			System.out.print("[이름 : " + partyList[i].name + "]");
			System.out.print("[레벨 : " + partyList[i].level + "]");
			System.out.print("[체력 : " + partyList[i].hp + "]");
			System.out.println(" / " + partyList[i].maxHp + "]");
			System.out.print("[공격력 : " + partyList[i].att + "]");
			System.out.print("[방어력 : " + partyList[i].def + "]");
			System.out.println("[파티중 : " + guildList.get(i).party + "]");
			System.out.println("");
		}
		System.out.println("=========================");
	}
	void printAllUnitStatus() {
		System.out.println("=========================");
		System.out.println("[골드 : " + Player.money + "]");
		System.out.println("==========[길드원]=========");
		for(int i = 0; i < guildList.size(); i++) {
			System.out.print("[" + (i + 1) + "번]");
			System.out.print("[이름 : " + guildList.get(i).name + "]");
			System.out.print("[레벨 : " + guildList.get(i).level + "]");
			System.out.print("[체력 : " + guildList.get(i).hp + "]");
			System.out.println(" / " + guildList.get(i).maxHp + "]");
			System.out.print("[공격력 : " + guildList.get(i).att + "]");
			System.out.print("[방어력 : " + guildList.get(i).def + "]");
			System.out.println("[파티중 : " + guildList.get(i).party + "]");
			System.out.println("");
		}
		System.out.println("=========================");
	}
	
	public void buyUnit() {
		if(Player.money < 5000) {
			return;
		}
		
		String[] n1 = { "박", "이", "김", "최", "유", "지", "오"};
		String[] n2 = { "명", "기", "종", "민", "재", "석", "광"};
		String[] n3 = { "수", "자", "민", "수", "석", "민", "철"};
		
		String name = n1[MainGame.ran.nextInt(n1.length)];
		name += n2[MainGame.ran.nextInt(n2.length)];
		name += n3[MainGame.ran.nextInt(n3.length)];
		
		int ran = MainGame.ran.nextInt(8) + 2;
		
		int hp = ran * 11;
		int att = ran + 1;
		int def = ran / 2 + 1;
		
		Unit temp = new Unit(name, 1, hp, att, def, 0);

		System.out.println("=========================");
		System.out.print("[이름 : " + name + "]");
		System.out.print("[레벨 : " + 1 + "]");
		System.out.print("[체력 : " + hp);
		System.out.println(" / " + hp + "]");
		System.out.print("[공격력 : " + att + "]");
		System.out.println("[방어력 : " + def + "]");
		System.out.println("길드원을 추가합니다.");
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
		
		System.out.print("삭제할 번호를 입력하세요 : ");
		int sel = MainGame.scan.nextInt();
		
		if(guildList.get(sel - 1).party) {
			System.out.println("파티중인 멤버는 삭제할 수 없습니다.");
		}
		else {
			System.out.println("=========================");
			System.out.print("[이름 : " + guildList.get(sel - 1).name + "]");
			System.out.println("길드원을 삭제합니다.");
			System.out.println("=========================");
			guildList.remove(sel - 1);
		}
	}
	
	public void partyChange() {
		printParty();
		System.out.print("교체할 번호를 입력하세요 : ");
		int partyNum = MainGame.scan.nextInt();
		printAllUnitStatus();
		System.out.print("참가할 번호를 입력하세요 : ");
		int guildNum = MainGame.scan.nextInt();
		
		partyList[partyNum - 1].party = false;
		guildList.get(guildNum - 1).party = true;
		
		System.out.println("=========================");
		System.out.print("[이름 : " + partyList[partyNum - 1].name + "]");
		System.out.print("에서");
		System.out.print("[이름 : " + guildList.get(guildNum - 1).name + "]");
		System.out.println("으로 파티원을 교체합니다.");
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
			System.out.println("============길드관리===========");
			System.out.println("[1.길드목록] [2.길드원추가] [3.길드원삭제]");
			System.out.println("[4.파티원교체] [5.정렬] [0.뒤로가기]");
			
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
