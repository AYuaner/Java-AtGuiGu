package com.atguigu.exer;

//static关键字的应用
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println(c1.getId());
		System.out.println(c2.getId());
	}
}

class Circle {
	private double radius;
	private int id;

	public Circle() {
		this.id = init++;
//		total++;
	}

	public int getId() {
		return id;
	}

//	private static int total;
	private static int init = 1001;

	public double findArea() {
		return 3.14 * radius * radius;
	}
}