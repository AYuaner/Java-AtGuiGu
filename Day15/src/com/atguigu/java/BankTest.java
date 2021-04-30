package com.atguigu.java;

/**
 * @author A_Yuan
 * @create 2021-03-29 19:45
 */

/*
使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
}

class Bank {

    private Bank() {}

    private static Bank instance = null;

//效率稍差
//    public static synchronized Bank getInstance(){
//
//        if (instance == null){
//            instance = new Bank();
//            return instance;
//        }
//    }

    public static Bank getInstance(){
        if(instance==null){
            synchronized (Bank.class){
                if(instance==null){
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}