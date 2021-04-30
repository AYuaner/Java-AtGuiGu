package com.bank.java;

public class Account {
	//成员变量
	private int id;//账号
	private double balance;//余额
	private double annuallnterestRate;//年利率
	
	//构造器
	public Account (int id, double balance, double annuallnterestRate) {
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}

	//方法
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

	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}

	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}
	
	public void withdraw(double amount) {
		//取钱
		if(amount > balance) {
			System.out.println("余额不足，取款失败");
		}else {
			balance -= amount;
			System.out.println("成功取出：" + amount);
		}
	}
	
	public void deposit(double amount) {
		//存钱
		if(amount > 0) {
			balance += amount;
			System.out.println("成功存入：" + amount);
		}
	}
	
	
	
}
