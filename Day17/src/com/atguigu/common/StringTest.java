package com.atguigu.common;

import org.junit.Test;

/**
 * @author A_Yuan
 * @create 2021-03-31 19:44
 */

/*
String的使用   test1-test2-test3
    1.String声明为final，不可被继承
    2.String实现了Serializable接口（可以序列化的，表示字符串是支持序列化的）
            实现了Comparable接口（表示String可以比较大小）
    3.String内部定义了final char[] value用于存储字符串数据
    4.String:代表不可变的字符序列，简称:不可变性
        1) 当对字符串重新赋值时，需要重写指定内存区域赋值，不能使用原有value进行赋值
        2) 当对享有的字符串进行连接操作时，也需要重新指定内存赋值，不能使用原有的value赋值
        3) 当调用String的replace()方法修改字符或字符串时，也需要重新指定内存区域赋值
    5.通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中
    6.字符串常量池中不会存储相同的字符串
 */

/*
String的实例化方式：
    方式一：通过字面面定义的方式
    方式二：通过new+构造器的方式

    String s = new String("abc");
    在内存中创建了两个对象：
        一个是堆空间中的new结构
        另一个是char[]对应的常量池中的数据
*/
public class StringTest {

    //test1-2-3是对String的不可变性验证
    @Test
    public void test1() {
        String s1 = "abc";//字面量
        String s2 = "abc";

        s1 = "hello";

        System.out.println(s1);
        System.out.println(s2);

    }

    @Test
    public void test2() {
        String s3 = "abc";
        s3 += "def";
        System.out.println(s3);
    }

    @Test
    public void test3() {
        String s4 = "abc";
        String s5 = s4.replace('a', 'f');
        System.out.println(s5);
    }

    @Test
    public void test4() {
        //此时的s1和S2的数据JavaEE声明在方法区中的字符串常量池中
        String s1 = "JavaEE";
        String s2 = "JavaEE";
        //此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
    }

    @Test
    public void test5() {
        String s1 = "javaEE";
        String s2 = "hadoop";

        String s3 = "javaEEhadoop";
        String s4 = "javaEE" + "hadoop";
        String s5 = s1 + "hadoop";
        String s6 = "javaEE" + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s5 == s6);

        String s8 = s5.intern();
        /*
        拼接的结果调用intern()方法，返回值就在常量池中
         */
        System.out.println(s3 == s8);
    }
}
