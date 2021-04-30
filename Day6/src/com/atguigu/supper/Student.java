package com.atguigu.supper;

public class Student extends Person {
	String name = "Student";

	@Override
	public void say() {
		System.out.println(name);
	}

	public void show() {
		this.say();
		super.say();
	}
}
