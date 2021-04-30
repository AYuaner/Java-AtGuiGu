package com.atguigu.java;

/*
 * abstract 可以修饰 类、方法
 * 
 * 抽象类 
 * 	>不可实例化
 * 	>一定要有构造器，便于子类实例化使用
 * 
 * 抽象方法
 * 	>只有方法的声明，没有方法体
 * 	>包涵抽象方法的类，一般是一个抽象类//抽象类中可以没有抽象方法
 * 	>子类重写了父类的所有抽象方法-->可以实例化
 * 	 子类没有重写所有的抽象方法-->仍是抽象类
 * 
 * 注意事项：
 * 	>abstract 不能修饰属性、构造器
 * 	>不能用来修饰private方法、static方法、final方法、final类
 */
public class AbstractTest {
	public static void main(String[] args) {
		Manage manage = new Manage("Cook", 1001, 5000, 50000);
		manage.work();

		CommonEmployee commonEmployee = new CommonEmployee();
		commonEmployee.work();
		
		//创建了匿名子类的对象e
		Employee e = new Employee() {

			@Override
			public void work() {
			}
			
		};
	}
}