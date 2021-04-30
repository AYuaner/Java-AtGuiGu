package com.atguigu.staticuse;

/*
 * static 可以修饰 属性、方法、代码块、内部类
 * 
 * 静态变量随着类的加载而加载
 */

/*
 * 静态方法 随着类的加载而加载
 * 只能调用静态的方法、属性
 * 不能使用this、super关键字
 */
public class StaticTest {
	public static void main(String[] args) {
		Person p1 = new Person(12);
		Person p2 = new Person(165);

		System.out.println("p1 age:" + p1.age + " say:" + Person.hello);
		System.out.println("p2 age:" + p2.age + " say:" + Person.hello);
		System.out.println(Person.hello);
		
		System.out.println("****************************");
	}
}
/*
 * 开发中 static 属性
 * 	>属性是可以被多个对象所共享的，不会随着对象的不同而不同
 * 
 * 
 * 开发中 static 方法
 * 	>操作静态属性的方法，通常设置为static
 * 	>工具类中的方法，习惯上声明为static。比如Math、Arrays、Collections
 */
class Person {
	public static String hello = "Hello";
	public int age;

	public Person(int age) {
		super();
		this.age = age;
	}
}