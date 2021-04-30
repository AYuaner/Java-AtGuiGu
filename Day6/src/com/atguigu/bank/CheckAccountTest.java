package com.atguigu.bank;

public class CheckAccountTest {
	public static void main(String[] args) {
		CheckAccount acct = new CheckAccount(1122,20000,0.045,5000);
		
		acct.withdraw(5000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支余额为：" + acct.getOverdraft());
		System.out.println();
		acct.withdraw(18000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支余额为：" + acct.getOverdraft());
		System.out.println();
		acct.withdraw(3000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支余额为：" + acct.getOverdraft());
		
	}
}
