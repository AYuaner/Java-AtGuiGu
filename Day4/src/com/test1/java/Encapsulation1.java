package com.test1.java;
//测试java封装性之中的权限修饰词：private、缺省、protected、public
public class Encapsulation1 {
	public static void main(String[] args) {
		
		DefaultClass c1 = new DefaultClass();
		System.out.println(c1.privateNum);
		//private修饰的成员变量 不能被类外直接引用
		System.out.println(c1.defaultNum);
		System.out.println(c1.protectedNum);
		System.out.println(c1.publicNum);
		//缺省、protected、public修饰的成员变量 可以被同一个package下的
	}
	
	class PublicClass {
		private int privateNum = 1;
		int defaultNum = 2;
		protected int protectedNum = 3;
		public int publicNum = 4;
	}
}

class DefaultClass {
	private int privateNum = 1;
	int defaultNum = 2;
	protected int protectedNum = 3;
	public int publicNum = 4;
}

//一个.java文件中  只能有一个public类
public class PublicClass {
	private int privateNum = 1;
	int defaultNum = 2;
	protected int protectedNum = 3;
	public int publicNum = 4;
}