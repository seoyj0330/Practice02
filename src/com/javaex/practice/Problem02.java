package com.javaex.practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] num = new int[5];
		double avg = 0.0;
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = scan.nextInt();
		}

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		avg = sum / num.length;

		System.out.println("평균은 " + avg + "입니다.");

		scan.close();

	}

}
