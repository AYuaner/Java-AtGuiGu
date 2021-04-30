package com.bank.java;
/*
 * 构建Account和Customer两个类  类之间的调用 实现存取款功能
 * 
 * 
 * 
 * 
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer cust = new Customer("Jane", "Smith");
		Account acc = new Account(1000, 2000, 0.0123);
		cust.setAccount(acc);
		
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(2000);
		
		System.out.println("Customer [" + cust.getLastName() + "," + cust.getFirstName() + "] has a account: id is " + cust.getAccount().getId() + ", annualIterestRate is " + cust.getAccount().getAnnuallnterestRate() + ", balance is " + cust.getAccount().getBalance() + ".");
		
	}
}
