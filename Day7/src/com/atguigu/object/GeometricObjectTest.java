package com.atguigu.object;

public class GeometricObjectTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle(2.3);
		Circle circle2 = new Circle(2.3, "white", 2.0);

		System.out.println("颜色是否相等：" + circle1.getColor().equals(circle2.getColor()));
		System.out.println("半径是否相等：" + circle1.equals(circle2));

		System.out.println(circle1);
		System.out.println(circle2);
	}
}

class GeometricObject {
	protected String color;
	protected double weight;

	// 构造器
	protected GeometricObject() {
		super();
		this.color = "white";
		this.weight = 1.0;
	}

	protected GeometricObject(String color, double weight) {
		super();
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
}

class Circle extends GeometricObject {
	private double radius;

	// 构造器
	protected Circle() {
		super();
		this.radius = 1.0;
	}

	protected Circle(double radius) {
		super();
		this.radius = radius;
	}

	protected Circle(double radius, String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	// Getter Setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// 方法
	public double findArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Circle) {
			Circle other = (Circle) obj;
			return this.radius == other.radius;
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}