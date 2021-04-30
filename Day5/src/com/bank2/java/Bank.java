package com.bank2.java;

public class Bank {
	//成员变量
	private Customer[] customers;//客户数组
	private int numberOfCustomers;//客户个数
	
	//构造器
	public Bank() {
		customers = new Customer[100];
	}
	
	//方法
	public void addCustomer(String f, String l) {//添加客户
		Customer cust = new Customer(f,l);
		customers[numberOfCustomers] = cust;
		numberOfCustomers++;
	}
	
	public int getNumOfCustomers() {//获取客户数量
		return numberOfCustomers;
	}
	
	public Customer getCustomer(int index) {//获取指定客户信息
		if(index >= 0 && index <numberOfCustomers)
			return customers[index];
		else return null;
	}
}
