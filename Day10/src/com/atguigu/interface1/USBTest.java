package com.atguigu.interface1;

/*
 * 接口的使用也体现了多态性
 * 
 * 开发中 体会面向接口编程
 */
public class USBTest {
	public static void main(String[] args) {
		Computer com = new Computer();

		// 非匿名实现类的非匿名对象
		Flash flash = new Flash();
		com.transferData(flash);

		System.out.println();

		// 非匿名实现类的匿名对象
		com.transferData(new Printer());

		System.out.println();

		// 匿名实现类的非匿名实现对象
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("手机开始工作");
			}

			@Override
			public void stop() {
				System.out.println("手机停止工作");
			}

		};
		com.transferData(phone);

		System.out.println();

		// 接口的匿名实现类的匿名对象
		com.transferData(new USB() {

			@Override
			public void start() {
				System.out.println("MP3开始工作");
			}

			@Override
			public void stop() {
				System.out.println("MP3停止工作");
			}

		});
	}
}

interface USB {
	// 常量：定义了长、宽、最大最小传输速度

	void start();

	void stop();
}

class Computer {
	public void transferData(USB usb) {
		usb.start();

		System.out.println("具体传输数据的细节");

		usb.stop();
	}
}

class Flash implements USB {

	@Override
	public void start() {
		System.out.println("U盘开始工作");
	}

	@Override
	public void stop() {
		System.out.println("U盘停止工作");
	}
}

class Printer implements USB {

	@Override
	public void start() {
		System.out.println("打印机开始工作");
	}

	@Override
	public void stop() {
		System.out.println("打印机停止工作");
	}
}