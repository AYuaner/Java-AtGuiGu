package com.atguigu.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author A_Yuan
 * @create 2021-03-31 10:46
 */
public class ThreadExer {
    public static void main(String[] args) {
        Account acc = new Account();

        Customer c1 = new Customer(acc);
        Customer c2 = new Customer(acc);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.setName("储户一");
        t2.setName("储户二");

        t1.start();
        t2.start();
    }
}

class Account {
    private double balance = 0;
    private ReentrantLock lock = new ReentrantLock(true);

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            lock.lock();
            try{
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance += amt;
                System.out.println(Thread.currentThread().getName() + "向账户存入" + amt + "元，现在账户余额：" + balance);
            }finally {
                lock.unlock();
            }
        }
    }
}

class Customer implements Runnable {

    private Account acct;

    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}