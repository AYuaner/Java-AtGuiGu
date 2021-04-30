package com.bank2.java;
/*
 * 构建Account、Bank和Customer三个类  
 * 	类之间的调用
 * 	实现对象数组
 * 	实现存取款功能
 * 
 * 
 * 
 */

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Jane", "S");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		bank.getCustomer(0).getAccount().withdraw(500);
		double balance= bank.getCustomer(0).getAccount().getBalance();
		
		System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的余额为：" + balance);
		
		System.out.println("*******************");
		
		bank.addCustomer("J", "Snull");
		
		System.out.println("客户个数：" + bank.getNumOfCustomers());
	}
}
