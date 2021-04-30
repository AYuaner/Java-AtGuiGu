package com.atguigu.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * finally中声明的是一定会被执行的代码，即使catch中又出现了异常，
 * 	try中有return语句，catch中有return语句等情况。
 * 
 * 像数据库连、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，
 * 	我们需要自己手动的进行资源的释放。此时的资源释放，就需要声明在finally中。
 * 
 * try-catch-finally结构可以嵌套
 * 
 * 开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-fiannly
 * 	针对编译时异常，我们说一定要考虑异常的处理
 */
public class FinallyTest {

	@Test
	public void test2() {

		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);

			int data = fis.read();
			while (data != -1) {
				System.out.println((char) data);
				data = fis.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Test
	public void test1() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
