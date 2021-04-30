package com.bank2.java;

public class Customer {
	// 成员变量
	private String firstName;
	private String lastName;
	private Account account;

	// 构造器
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	//方法
	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	

}
