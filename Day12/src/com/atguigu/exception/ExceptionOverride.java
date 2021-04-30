package com.atguigu.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 子类重写的方法抛出的异常类型 不大于 父类被重写的方法抛出的异常类型
 * 
 * 父类没有抛出异常 子类也不能抛出异常
 * 
 * 父类中没有抛出异常，如果子类重写的方法中的方法有异常，必须用try-cathc-finally
 * 
 * 方法a中先后调用另外的几个方法，这几个方法递进执行，建议几个方法用throws
 * 	在执行a的时候进行try-catch-finally
 */
public class ExceptionOverride {

}

class SuperClass{
	
	public void method () throws IOException{
		
	}
	
}

class SubClass extends SuperClass{
	
	@Override
	public void method() throws FileNotFoundException {
		
	}
}