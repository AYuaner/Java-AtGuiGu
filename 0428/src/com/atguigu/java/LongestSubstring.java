package com.atguigu.java;

/**
 * @author A_Yuan
 * @create 2021-04-28 16:11
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String str1 = "abcwerthelloyulodef";
        String str2 = "cvhellobnm";

        int a = str1.length();
        int b = str2.length();

        int[][] arr = new int[a][b];

        int max = 0, startIndex = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                if (str1.charAt(i) == str2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                    }
                } else {
                    arr[i][j] = 0;
                }

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    startIndex = j;
                }
            }
        }

        System.out.println(str2.substring(startIndex - max + 1, startIndex + 1));
    }

}






