package com.atguigu.java;

public class LocalVarTest {
	public static void main(String[] args) {
		Test t = new Test();
		t.printI(123);
		t.printS("a sentence for test.");
	}
}

//其实局部变量还是被赋值，只是形参在未被调用的时候没有被赋值
class Test{
	//引用数据类型
	public void printS(String a) {
		String b = a;
		System.out.println(b);
	}
	
	//基本数据类型
	public void printI(int a) {
		int b = a;
		System.out.println(b);
	}
}