package com.atguigu.multithreading;

/**
 * @author A_Yuan
 * @create 2021-03-28 21:20
 */

/*
测试Thread中的常用方法：
    1.start()：启动当前线程；调用当前线程的run()
    2.run()：通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
    3.currentThread()：静态方法，返回执行当前代码的线程
    4.getName()：获取当前线程的名字
    5.getName()：设置当前线程的名字
    6.yield()：释放当前CPU的执行权
    7.join():在线程A中调用线程B的join()，此时线程A就进入阻塞状态，直到线程B完全执行完后，线程A才结束阻塞状态
    8.stop()：已过时，强制线程生命期的结束（不推荐使用）
    9.sleep(long millitime)：让当前线程“睡眠”指定的millitime毫秒，在指定的millitime毫秒时间内，当前线程是阻塞状态
    10.isAlive()：判断当前线程是否存活
 */
public class TreadMethodTest {
    public static void main(String[] args) {

        //给主线程命名
        Thread.currentThread().setName("主线程");

        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4("线程-4");
        //给某分线程命名
        t3.setName("线程-3");
        t3.start();

        t4.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            if (i == 3) {
                try {
                    t4.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}

class MyThread3 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
            if (i == 2) {
                MyThread3.yield();
            }
            if(i ==5){
                stop();
            }
        }
    }

}

class MyThread4 extends Thread {

    //通过构造器给线程命名
    public MyThread4(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}