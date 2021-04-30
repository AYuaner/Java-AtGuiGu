package com.atguigu.object;

import org.junit.Test;

/*
 * 要求： 1.public类
 * 		2.此类提供公共的无参构造器
 * 生命单元测试方法
 * 		public  void 没有形参
 * @Test 并导入import org.juint.Test;
 */
public class JUnitTest {

	@Test
	public void testEquals() {
		String s1 = "A";
		String s2 = "B";
		System.out.println(s1.equals(s2));
	}
}
