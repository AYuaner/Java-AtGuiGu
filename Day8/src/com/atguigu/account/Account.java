package com.atguigu.account;

public class Account {
	private int id;
	private String pwd;
	private double balace;

	private static double interestRate;
	private static double minMoney = 1.0;
	private static int init = 1001;//自动生成ID

	public Account() {
		this.id = init++;
	}

	public Account(String pwd, double balance) {
		this.id = init++;
		this.pwd = pwd;
		this.balace = balance;
	}

	// Getter/Setter
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}

	public static double getMinMoney() {
		return minMoney;
	}

	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}

	public int getId() {
		return id;
	}

	public double getBalace() {
		return balace;
	}

	//toString
	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balace=" + balace + "]";
	}
	
}
