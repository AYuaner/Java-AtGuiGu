package com.bank2.java;

public class Account {
	//成员变量
	private double balance;

	//构造器
	public Account(double balance) {
		this.balance = balance;
	}

	//方法
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {//存款操作
		if(amt > 0) {
			balance += amt;
			System.out.println("存款成功：" + amt);
		}
	}
	
	public void withdraw(double amt) {//取款操作
		if(amt > balance) {
			System.out.println("取款失败，余额不足");
		}else {
			balance -= amt;
			System.out.println("取款成功：" + amt);
		}
	}
	
}
