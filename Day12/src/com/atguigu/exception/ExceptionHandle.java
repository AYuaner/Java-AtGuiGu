package com.atguigu.exception;

import org.junit.Test;

/*
 * 方式一：try-catch-finally(抓)
 * try{
 * 		//可能出现异常的代码
 * }catch(异常类型1 变量名1) {
 * 		//处理异常的方式1
 * }catch(异常类型2变量名2) {
 * 		//处理异常的方式2
 * }catch(异常类型3 变量名3) {
 * 		//处理异常的方式3
 * }
 * ……
 * finally{
 * 		//一定会执行的代码
 * }
 * 
 * catch中的异常类型，如果没有子父类关系，则声明顺序无关
 * 	如果有子父类关系，则子类需要被声明在父类上面
 * 
 * try中生命的变量，在外面不能被调用
 * 
 * 
 * 
 * 方式二：throws+异常类型(抛)
 * 	>一旦抛出对象以后，其后的代码就不再执行
 * 
 */
public class ExceptionHandle {

	@Test
	public void test4() {
		String str = "ABC";
		try {
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
//			System.out.println("NumberFormatException");
			
			System.out.println(e.getMessage());
			
			e.printStackTrace();
		}
	}

}
