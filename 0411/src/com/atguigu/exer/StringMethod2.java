package com.atguigu.exer;

import org.junit.Test;

/**
 * @author A_Yuan
 * @create 2021-04-11 19:00
 */
public class StringMethod2 {

    /*
    boolean endsWith(String suffix):测试此字符是否以指定后缀结束
    boolean startsWith(String prefix):测试此字符是否以指定前缀开始
    boolean startsWith(String prefix, int toffset):测试此字符串从指定索引开始的字符串是否以指定前缀开始
     */
    @Test
    public void test1() {
        String s1 = "helloworld";
        System.out.println(s1.endsWith("rld"));
        System.out.println(s1.startsWith("ll"));
        System.out.println(s1.startsWith("ell", 1));
    }
}
