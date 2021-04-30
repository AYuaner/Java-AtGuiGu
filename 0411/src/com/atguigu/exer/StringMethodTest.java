package com.atguigu.exer;

import org.junit.Test;

/**
 * @author A_Yuan
 * @create 2021-04-11 15:47
 */
public class StringMethodTest {

    /*
    int length():返回字符串的长度 return value.length
     */
    @Test
    public void test1() {
        String s1 = "HelloWorld";
        System.out.println(s1.length());
    }

    /*
    char cahrAt(int index):放回某索引处的字符 return value[index]
     */
    @Test
    public void test2() {
        String s = "HelloWorld";
        System.out.println(s.charAt(2));
    }

    /*
    boolean isEmpty():判断是否是空字符串 return value.length == 0
     */
    @Test
    public void test3() {
        String s1 = "";
        String s2 = "HelloWorld";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }

    /*
    String toLowerCase():使用默认语言环境，将String中的所有字符都转换为小写
    String toUpperCase():使用默认语言环境，将String中所有的字符都转换为大写
    本身的字符串不变
     */
    @Test
    public void test4() {
        String s1 = "HelloWorld";
        String s2 = s1.toLowerCase();
        String s3 = s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    /*
    String trim():返回字符串的副本，忽略前导空白和尾部空白
     */
    @Test
    public void test5() {
        String s1 = "    Hello  World   ";
        System.out.println("---" + s1 + "---");
        System.out.println("---" + s1.trim() + "---");
    }

    /*
    boolean equals(Object obj):比较字符串的内容是否相同
    boolean equalsIgnoreCase(String anotherString):忽略大小写的情况下，比较字符串的内容是否相同
     */
    @Test
    public void test6() {
        String s1 = "HelloWorld";
        System.out.println(s1.equals("helloworld"));
        System.out.println(s1.equalsIgnoreCase("helloworld"));
    }

    /*
    String concat(String str):将制定字符串连接到此字符串的结尾，等价于“+”
     */
    @Test
    public void test7() {
        String s = "Hello";
        System.out.println(s.concat(" World"));
    }

    /*
    int compareTo(String anotherString):
     */
    @Test
    public void test8() {
        String s1 = "Abc";
        String s2 = "abc";
        String s3 = "Abcd";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
    }

    /*
    String substring(int beginIndex):返回一个新的字符串，从原字符串的beginIndex开始到结束
    String substring(int beginIndex, int endIndex):返回一个新的字符串，从原字符串的beginIndex开始到endIndex结束
        左闭右开
     */
    @Test
    public void test9() {
        String s = "ABCDEFGHIJKLMN";
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 5));
    }
}
