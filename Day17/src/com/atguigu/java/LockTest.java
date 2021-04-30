package com.atguigu.java;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author A_Yuan
 * @create 2021-03-31 9:53
 */

/*
解决线程安全问题的方式三：lock锁 --- JDK5.0新增

synchronized 和 lock 的异同
    相同：二者都可以解决线程安全问题
    差异：synchronized机制在执行完相应的同步代码以后，自动的释放同步监视器
        Lock需要手动的启动同步（lock()），同时结束同步也需要手动的实现（unlock()）

        lock()性能更好 但是只有同步代码块
 */
public class LockTest {

    public static void main(String[] args) {
        Window w = new Window();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");
    }
}

class Window implements Runnable {

    private int ticket = 100;

    //1.实例化ReentrantLock
    //fair-->true 先进先出，先来的先访问资源
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            //2.调用lock()
            lock.lock();

            try {
                if (ticket > 0) {

                    //增加错票、重票的概率
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：售票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //3.调用解锁方法unlock()
                lock.unlock();
            }

        }
    }
}