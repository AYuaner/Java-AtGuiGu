package com.atguigu.wrapper;

import org.junit.jupiter.api.Test;

public class WrapperTest {

	// 基本数据类型 ---> 包装类
	@Test
	public void test1() {
		int num1 = 10;
		Integer int1 = Integer.valueOf(num1);
		System.out.println(int1.toString());

		// 新特性：自动装箱
		int num2 = 20;
		Integer int2 = num2;
		System.out.println(int2.toString());
	}

	// 包装类 ---> 基本数据类型
	@Test
	public void test2() {
		Integer int2 = Integer.valueOf(12);
		int num1 = int2.intValue();
		System.out.println(num1);

		// 新特性：自动拆箱
		int num3 = int2;
		System.out.println(num3);
	}

	// 基本数据类型、包装型--->String类型
	@Test
	public void test3() {
		int num4 = 30;
		String str = String.valueOf(num4);
		System.out.println(str);

		Integer int3 = Integer.valueOf(40);
		String str2 = String.valueOf(int3);
		System.out.println(str2);
	}

	// String类型--->基本数据类型、包装型
	@Test
	public void test4() {
		String str3 = "123";
		int num5 = Integer.parseInt(str3);
		System.out.println(num5);
	}
}