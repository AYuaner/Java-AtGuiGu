package com.atguigu.threadsafe;

/**
 * @author A_Yuan
 * @create 2021-03-29 9:24
 */

/*
例子：创建三个窗口卖票，总票数为100张，使用实现Runnable接口的方法

两种创建线程方式的比较：
    开发中优先选择，实现Runnable接口的方式
        原因：1.实现的方式没有类的单继承性的局限
             2.实现的方式更适合来处理多个线程有贡献数据的情况
    联系：public class Thread implements Runnable
    相同点：两种方式都需要重写run()，将线程要执行的逻辑声明在run()中

wait()  <-->  notify()/notifyAll()

suspend()挂起  <-->  resume()

解决出现重票、错票 --> 线程A在操作ticket的时候，其他线程不能参与。直到线程A操作结束，才可以
↑通过同步机制来解决
    方式一：同步代码块   synchronized
    synchronized(同步监视器){
        //需要同步的代码
    }
        同步监视器（锁）：任何一个类的对象都可以作为锁
            要求：多个线程必须要共用同一把锁

    在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器
    方式二：同步方法
        1.实现Runnable：将需要同步的代码写在一个方法里，并声明为synchronized，此时同步监视器默认为this
        然后再在run中调用该方法
        2.继承Thread类：在实现Runnable的方式后，将方法声明为static，此时同步监视器默认为类本身
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 window1 = new Window1();

        Thread t1 = new Thread(window1);
        Thread t2 = new Thread(window1);
        Thread t3 = new Thread(window1);

        t1.start();
        t2.start();
        t3.start();

    }
}

class Window1 implements Runnable {

    private int ticket = 100;
//    final Object obj = new Object();
    final Dog dog = new Dog();

    @Override
    public void run() {

        while (true) {
            synchronized (dog) {
//          synchronized (Window1,class) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":售出票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }

}

class Dog{

}