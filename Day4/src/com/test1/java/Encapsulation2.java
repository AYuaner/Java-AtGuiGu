package com.test1.java;

public class Encapsulation2 {
	public static void main(String[] args) {
		
		DefaultClass c1 = new DefaultClass();
//		System.out.println(c1.privateNum);
		//private修饰的成员变量 不能被类外直接引用
		System.out.println(c1.defaultNum);
		System.out.println(c1.protectedNum);
		System.out.println(c1.publicNum);
		//缺省、protected、public修饰的成员变量 可以被同一个package内的文件引用
	}
}
