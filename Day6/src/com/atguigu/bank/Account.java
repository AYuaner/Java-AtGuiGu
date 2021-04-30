package com.atguigu.bank;

public class Account {
	// 成员变量
	private int id;// 账号
	private double balance;// 余额
	private double annualIterestRate;// 年利率

	// 构造器
	public Account(int id, double balance, double annualIterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualIterestRate = annualIterestRate;
	}

	// 方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualIterestRate() {
		return annualIterestRate;
	}

	public void setAnnualIterestRate(double annualIterestRate) {
		this.annualIterestRate = annualIterestRate;
	}

	/**
	 * 获取月利率
	 * 
	 * @Description
	 * @return 月利率
	 */
	public double getMonthlyIterest() {
		return annualIterestRate / 12;
	}

	/**
	 * 取款操作
	 * 
	 * @Description
	 * @param amount
	 */
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			return;
		}
		System.out.println("余额不足");
	}

	/**
	 * 存款操作
	 * 
	 * @Description
	 * @param amount
	 */
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}
}
