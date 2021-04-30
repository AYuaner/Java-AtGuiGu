package com.atguigu.multithreading;

/**
 * @author A_Yuan
 * @create 2021-03-29 8:38
 */

/*
创建多线程的方法二：实现Runnable接口
    1.创建一个实现了Runnable接口的类
    2.实现类去实现Runnable中的抽象方法：run()
    3.创建实现类的对象
    4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
    5.通过Thread类的对象调用start()
 */
public class TreadTest {
    public static void main(String[] args) {

        //3.创建实现类的对象
        MThread mThread = new MThread();

        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mThread);

        //5.通过Thread类的对象调用start()
        t1.start();

        //再启动一个线程，遍历100内的偶数
        Thread t2 = new Thread(mThread);
        t2.start();
    }
}

//1.创建一个实现了Runnable接口的类
class MThread implements Runnable{

    //2.实现类去实现Runnable中的抽象方法：run()  
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}