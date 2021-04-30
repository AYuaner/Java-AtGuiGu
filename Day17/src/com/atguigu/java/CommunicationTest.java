package com.atguigu.java;

/**
 * @author A_Yuan
 * @create 2021-03-31 11:34
 */

/*
例子：使用两个线程打印1-100，线程1、线程2交替打印
以上述例子讲解 线程之间的通讯

↓↓↓↓↓↓以下代码只能出现在同步代码块或者同步方法中
wait()：一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
notify()：一旦执行此方法，就会唤醒被wait的一个线程，如果有多个线程，则唤醒优先级最高的那个
notifyAll()：一旦执行此方法，就会唤醒所有被wait线程

以上方法的调用者必须是同步代码块或者同步方法中的同步监视器
    否则会出现IllegalMonitorStateException异常
以上的方法是定义在java.lang.Object下的

sleep()和wait()的异同
相同：一旦执行方法，都可以使当前的线程进入阻塞状态
差异：sleep声明在Thread类中，wait声明在Object类中
    sleep可以在任何需要的场景下调用，wait只能在同步代码块或者同步方法中调用
    都使用在同步代码块或者方法中，sleep不释放同步监视器，wait释放同步监视器
 */
public class CommunicationTest {
    public static void main(String[] args) {
        Number num = new Number();

        Thread t1 = new Thread(num);
        Thread t2 = new Thread(num);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}

class Number implements Runnable {
    private int number = 1;

    @Override
    public void run() {

        while (true) {

            synchronized (this) {
                //释放线程
                notify();
                if (number <= 100) {

                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //线程暂停，并释放锁
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}