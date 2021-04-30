package com.atguigu.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * "throws+异常类型  写在方法的声明处。指名此方法执行时可能会抛出的异常类型
 * 	一旦方法体执行时，出现异常，仍会在异常代码出生成一个异常类对象，
 * 	此对象满足throws后异常类型时，就会被抛出。异常代码后续的代码，就不再执行
 * 
 */
public class ExceptionThrows {

	public void method2() {
		try {
			method1();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void method1() throws FileNotFoundException,IOException{

		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);

		int data = fis.read();
		while (data != -1) {
			System.out.println((char) data);
			data = fis.read();
		}
		
		fis.close();
	}

}
