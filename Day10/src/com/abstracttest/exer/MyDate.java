package com.abstracttest.exer;

public class MyDate {
	private int year;
	private int month;
	private int day;

	//Contructor
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//toString
	public String toDateString() {
		return year + "年" + month + "月" + day + "日";
	}

	//Getter\Setter
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
}
