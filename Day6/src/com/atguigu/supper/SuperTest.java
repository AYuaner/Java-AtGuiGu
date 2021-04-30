package com.atguigu.supper;

/*
 * 子类构造器中 显示的使用“super(形参)”的方式，调用父类中指定的构造器
 * “super(形参)”、“this(形参)”都必须在构造器的首行，所以只能使用其一
 * 		>默认为super()
 */
public class SuperTest {
	public static void main(String[] args) {
		Student sdt = new Student();

		sdt.show();
	}
}