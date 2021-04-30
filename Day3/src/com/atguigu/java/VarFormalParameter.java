package com.atguigu.java;
//可变形参的实现举例（重载）
public class VarFormalParameter {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		//传入任意个数参数，调用同一个printBack方法
		t1.printBack("单句0");
		t1.printBack("双句0","双句1");
		t1.printBack("三句0","三句1","三句2");
	}
}

class Test1 {
	//可变形参的设置，可以理解为传入数组
	//	并且可变形参不能设置在固定形参前面，会造成编译时会出现二义性
	//	一个方法中最多可以设置一个可变形参
	public void printBack(String ... str) {
		for(int i = 0;i < str.length;i++) {
			System.out.println(str[i]);
		}
	}
}
