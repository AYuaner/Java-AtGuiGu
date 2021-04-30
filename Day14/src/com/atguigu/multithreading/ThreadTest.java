package com.atguigu.multithreading;

/**
 * @author A_Yuan
 * @create 2021-03-28 20:09
 */
/*
多线程的创建
    方式一：
        1.创建一个继承与Thread类的子类
        2.重写Thread类的run() --> 将此线程执行的操作声明在run()方法中
        3.创建Thread类的子类对象
        4.通过此对象调用start()
            作用：①启动当前线程 ②调用当前线程的run()
        <p> 例子：遍历100内的所有偶数
        问题：1.不能直接调用run()的方式来启动线程（此时都是在main线程下运行的）
            2.不能让已经start()的线程去执行，会报IllegalThreadStateException
            ，需要重新创建一个线程对象
 */
public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread t1 = new MyThread();

        //4.通过此对象调用start()
        t1.start();

        //如下的操作仍然是在main线程中执行的
        System.out.println("Hello");

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + "**");
            }
        }
    }
}

//1.创建一个继承与Thread类的子类
class MyThread extends Thread {

    //2.重写Thread类的run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "*");
            }
        }
    }

}