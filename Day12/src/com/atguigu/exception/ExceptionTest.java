package com.atguigu.exception;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

/*
 * 分类：非受检异常unchecked（运行时的异常）、受检异常checked（编译时的异常）
 * 
 * --java.lang.Error--:一般不编写针对性的代码进行处理
 * --java.lang.Exception--:可以进行异常处理
 * 	--checkedException
 * 		--IOException--
 * 			--FileNotFoundException--
 * 		--ClassNotFoundException--
 * 	--uncheckedException(--RuntimeException--)
 * 		--NullPointerException--
 * 		--ArrayIndexOutOfBoundsException--
 * 		--ClassCastException--
 * 		--NumberFormatException--
 * 		--InputMismatchException--
 * 		--ArithmaticException--
 */
public class ExceptionTest {

//	@Test
//	public void test7() {
//		File file = new File("hello.txt");
//		FileInputStream fis = new FileInputStream(file);
//
//		int data = fis.read();
//		while (data != -1) {
//			System.out.println((char) data);
//			data = fis.read();
//		}
//
//		fis.close();
//	}

	// -----------↑编译异常------↓运行异常 -----------

	// NullPointerException
	@Test
	public void test1() {
		int[] arr = null;
		System.out.println(arr[1]);
	}

	// ArrayIndexOutOfBoundsException
	@Test
	public void test2() {
		int[] arr = new int[5];
		System.out.println(arr[5]);
	}

	// ClassCastException-类型转换异常
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String) obj;
	}

	// NumberFormatException
	@Test
	public void test4() {
		String str = "ABC";
		int num = Integer.parseInt(str);
	}

	// InputMismatchException-输入类型不匹配
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		System.out.println(score);
	}

	// ArithmaticException
	@Test
	public void test6() {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}
}
