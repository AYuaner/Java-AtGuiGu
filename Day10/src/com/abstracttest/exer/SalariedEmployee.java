package com.abstracttest.exer;

public class SalariedEmployee extends Employee {
	private int monthlySalary;// 月薪

	public SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}

	public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public int earnings() {
		return monthlySalary;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee[" + super.toString() + "]";
	}
}
