package com.abstracttest.exer;

import java.util.Calendar;
//import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入当前月份：");
//		int month = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1;

		Employee[] emps = new Employee[2];

		emps[0] = new SalariedEmployee("马森", 1002, new MyDate(1992, 2, 28), 10000);
		emps[1] = new HourlyEmployee("潘雨升", 2001, new MyDate(1991, 5, 6), 50, 240);

		for (int i = 0; i < emps.length; i++) {
			System.out.println(emps[i]);
			double salary = emps[i].earnings();
			System.out.println("月工资为：" + salary);

			if (month == emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐！奖励100");
			}
			
			System.out.println();
		}
	}
}
