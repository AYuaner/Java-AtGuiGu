package com.atguigu.wrapper;

import java.util.Scanner;
import java.util.Vector;
/*
 * int --->Integer
 * short --->Short
 * long --->Long
 * byte --->Byte
 * double --->Double
 * boolean --->Boolean
 * float --->Float
 * char --->Charactor
 * 
 */
public class WrapperExer {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		int maxScore = 0;
		while (true) {
			System.out.print("请输入学生成绩（输入负数代表结束）：");
			int num = scanner.nextInt();
			if (num < 0) {
				break;
			}
			if (num > 100) {
				System.out.print("输入的数据非法，请重新输入：");
			}
			v.addElement(num);
			if (num > maxScore) {
				maxScore = num;
			}
		}
		scanner.close();

		char level;
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.elementAt(i);
			Integer inScore = (Integer) obj;
//			int score = inScore.intValue();

			if (maxScore - inScore <= 10) {
				level = 'A';
			} else if (maxScore - inScore <= 20) {
				level = 'B';
			} else if (maxScore - inScore < 30) {
				level = 'C';
			} else {
				level = 'D';
			}

			System.out.println("student-" + i + " score is " + inScore + " ,level is " + level);
		}
		System.out.println("Max is:" + maxScore);
	}
}
