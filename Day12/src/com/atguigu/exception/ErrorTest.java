package com.atguigu.exception;

public class ErrorTest {
	public static void main(String[] args) {
		
		//栈溢出java.lang.StackOverflowError
		main(args);
		
		//堆溢出OutOfMemoryError
		Integer[] arr = new Integer[1024*1024*1024];
	}
}
