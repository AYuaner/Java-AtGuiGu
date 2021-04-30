package com.atguigu.polymorphism;

public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();

		GeometricObject g1 = new Circle("white", 1.0, 1.0);
		test.displayGeometricObject(g1);
		GeometricObject g2 = new MyRectange("white", 1.0, 1.0, 3.14);
		test.displayGeometricObject(g2);

		boolean isEquals = test.equalsArea(g1, g2);
		System.out.println(isEquals);
	}

	public boolean equalsArea(GeometricObject a, GeometricObject b) {
		return a.findArea() == b.findArea();
	}

	public void displayGeometricObject(GeometricObject g) {
		System.out.println("面积为:" + g.findArea());
	}
}

class GeometricObject {
	// 成员变量
	protected String color;
	protected double weight;

	// 构造器
	protected GeometricObject(String color, double weight) {
		this.color = color;
		this.weight = weight;
	}

	// 方法
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double findArea() {
		return 0.0;
	}
}

class Circle extends GeometricObject {
	// 成员变量
	private double radius;

	// 构造器
	public Circle(String color, double weight, double radius) {
		super(color, weight);
		this.radius = radius;
	}

	// 方法
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return 3.14 * radius * radius;
	}
}

class MyRectange extends GeometricObject {
	// 成员变量
	private double width;
	private double height;

	// 构造器
	public MyRectange(String color, double weight, double width, double height) {
		super(color, weight);
		this.width = width;
		this.height = height;
	}

	// 方法
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double findArea() {
		return width * height;
	}
}

//295