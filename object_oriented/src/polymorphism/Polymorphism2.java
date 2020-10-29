package polymorphism;


import java.util.Scanner;

abstract class Shape {
	int x, y;
	public void move() { }
	public abstract void draw();
}

//	Shape Ŭ������ ��ӹ޾� Point Ŭ������ �����.
class Point extends Shape {
	@Override
	public void draw() {
		System.out.println("���� ��´�.");
	}
}

//	Shape Ŭ������ ��ӹ޾� Line Ŭ������ �����.
class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

//	Shape Ŭ������ ��ӹ޾� Circle Ŭ������ �����.
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("���� �׸���.");
	}
}

//	Shape Ŭ������ ��ӹ޾� Rect Ŭ������ �����.
class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���.");
	}
}

//	Shape Ŭ������ ��ӹ޾� TriAngle Ŭ������ �����.
class TriAngle extends Shape {
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���.");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		Shape[] shapes = {new Point(), new Line(), new Circle(), new Rect(), new TriAngle()};
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �۾��� �����ϼ��� : ");
		int menu = sc.nextInt();
		
		shapes[menu - 1].draw();
	}

}
