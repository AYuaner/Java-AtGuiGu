package com.atguigu.java;

/**
 * @author A_Yuan
 * @create 2021-03-31 15:13
 */

/*
经典的PC问题：Producer\Clerk\Consumer
 */
public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        Thread t1 = new Thread(p1);
        t1.setName("生产者1");

        Consumer c1 = new Consumer(clerk);
        Thread t2 = new Thread(c1);
        t2.setName("消费者1");

        t1.start();
        t2.start();
    }
}

class Clerk {
    private int productCount = 0;

    public synchronized void produce() {
        if (productCount < 20) {
            productCount++;
            System.out.println(Thread.currentThread().getName() + "：开始生产第" + productCount + "个产品");

            notify();
        }
    }

    public synchronized void consumer() {
        if(productCount>0){
            System.out.println(Thread.currentThread().getName() + "：开始消费第" + productCount + "个产品");
            productCount--;

            notify();
        }
    }
}

class Producer implements Runnable {
    private final Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "：开始生产产品");
        while (true) {
            clerk.produce();
        }
    }
}

class Consumer implements Runnable {
    private final Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "：开始消费产品");
        while (true) {
            clerk.consumer();
        }
    }
}