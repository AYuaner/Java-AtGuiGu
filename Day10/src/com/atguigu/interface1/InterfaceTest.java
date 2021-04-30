package com.atguigu.interface1;

/*
 * 
 */
public class InterfaceTest {

}

//接口的定义
interface Flyable {
	/*
	 * JDK7以及之前，只能定义全局常量（public static fianl）和抽象方法（public abstract）
	 * 
	 * JDK8，还能定义静态方法、默认方法
	 * 
	 * 接口中不能定义构造器-->接口不能实例化
	 * 
	 * 接口通过让类去实现(implements)来使用 
	 * >如果实现类覆盖了所有接口中的所有抽象方法，则此实现类就可以实例化
	 * >如果实现类没有覆盖所有接口中的所有抽象方法，这此实现类仍为抽象类
	 * 
	 * Java类可以实现多个接口 ---> 弥补了Java的单继承性的局限性
	 * 
	 * 先写接口、再写继承
	 * 
	 * 类和类之间-继承|类和接口之间-实现|接口和接口之间-可以多继承
	 * 
	 * ************************
	 * 
	 * 接口的具体使用，体现了多态性
	 * 
	 * 接口实际上可以看做一种规范
	 */

	// 全局常量:书写时可以省略public static final
	public static final int MAX_SPEED = 7900;// 最快速度-第一宇宙速度
	public static final int MIN_SPEED = 1;

	// 抽象方法:书写时可以省略public abstract
	public abstract void fly();

	public abstract void stop();
}

interface Attackable{
	
}

class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("通过引擎起飞");
	}

	@Override
	public void stop() {
		System.out.println("驾驶员减速停止");
	}
}

class Kite implements Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}
}

class Bullet implements Flyable,Attackable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}