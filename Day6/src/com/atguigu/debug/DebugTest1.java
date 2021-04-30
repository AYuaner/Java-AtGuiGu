package com.atguigu.debug;

public class DebugTest1 {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println("i = " + i + ", j = " + j);
		int max = getMax(i, j);
		System.out.println("max = " + max);
	}

	private static int getMax(int k, int m) {
		int max = 0;
		if (k < m) {
			max = k;
		} else {
			max = m;
		}
		return max;
	}
}
