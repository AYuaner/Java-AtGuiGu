package com.atguigu.bank;

public class CheckAccount extends Account {// 透支账户
	// 成员变量
	private double overdraft;

	// 构造器
	public CheckAccount(int id, double balance, double annualIterestRate, double overdraft) {
		super(id, balance, annualIterestRate);
		this.overdraft = overdraft;
	}

	// 方法
	public double getOverdraft() {
		return overdraft;
	}

	@Override
	public void withdraw(double amount) {
		if (getBalance() >= amount) {
			super.withdraw(amount);
		} else if (overdraft >= amount - getBalance()) {
			overdraft -= (amount - getBalance());
			super.withdraw(getBalance());
		} else {
			System.out.println("超过可透支限额！");
		}
	}

}
