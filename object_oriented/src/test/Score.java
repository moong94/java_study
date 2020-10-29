package test;

public class Score {
	public static int count;	// ��ü�� ������ �� ���� �ڵ����� 1�� ������ų ����
	private int no;				// ��ȣ, �ڵ�����
	private String name;		// �̸�
	private int java;			// java ����
	private int jsp;			// jsp ����
	private int spring;			// spring ����
	private int total;			// ����
	private double average;		// ���
	private int rank = 1;		// ����, ������ ����� ��� ����� �ʱ�ġ�� ������ 1�� �Ѵ�.
	
	public Score() { }
	public Score(String name, int java, int jsp, int spring) {
		count += 1;
		no = count;
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		total = java + jsp + spring;
		average = (double) total / 3;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %3d %3d %3d %3d %6.2f %d", no, name, java, jsp, spring, total, average, rank);
	}
}
