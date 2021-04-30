package com.atguigu.object;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate m1 = new MyDate(14, 3, 1976);
		MyDate m2 = new MyDate(14, 3, 1976);
		if (m1 == m2) {
			System.out.println("m1==m2");
		} else {
			System.out.println("m1 !=m2");// m1 != m2
		}
		if (m1.equals(m2)) {
			System.out.println("m1 is equal to m2");// ml is equal to m2
		} else {
			System.out.println("m1 is not equal to m2");
		}
	}
}

class MyDate {
	// 成员变量
	private int year;
	private int moonth;
	private int day;

	public MyDate(int year, int moonth, int day) {
		this.year = year;
		this.moonth = moonth;
		this.day = day;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MyDate other = (MyDate) obj;
//		if (day != other.day)
//			return false;
//		if (moonth != other.moonth)
//			return false;
//		if (year != other.year)
//			return false;
//		return true;
//	}

	// 方法
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof MyDate) {
			MyDate other = (MyDate) o;
			return this.year == other.year && this.moonth == other.moonth && this.day == other.day;
		} else
			return false;
	}
}