package com.atguigu.polymorphism;

public class InstanceTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Student();
		Person p3 = new Graduate();
		InstanceTest test = new InstanceTest();
		test.method(p1);
		test.method(p2);
		test.method(p3);
	}
	
	void method(Person e) {
		String info = e.getInfo();
		System.out.println(info);
		
		if (e instanceof Graduate) {
			System.out.println("a graduated student");
		}
		if (e instanceof Student) {
			System.out.println("a student");
		}
		if (e instanceof Person) {
			System.out.println("a person");
		}
		System.out.println("********************************");
	}
}

class Person {
	protected String name = "person";
	protected int age = 50;

	public String getInfo() {
		return "Name:" + name + "\n" + "age:" + age;
	}
}

class Student extends Person {
	protected String school = "pku";

	public String getInfo() {
		return "Name:" + name + "\nage:" + age + "\nschool:" + school;
	}
}

class Graduate extends Student {
	public String major = "IT";

	public String getInfo() {
		return "Name:" + name + "\nage:" + age + "\nschool:" + school + "\nmajor:" + major;
	}
}