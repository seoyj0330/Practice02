package com.javaex.practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("금액 : ");
		int money = scan.nextInt();

		if (money / 50000 != 0) {
			System.out.println("50000원 : " + money / 50000 + "개");
			money = money - 50000 * (money / 50000); // money -= 50000*(money/50000);
		}

		if (money / 10000 != 0) {
			System.out.println("10000원 : " + money / 10000 + "개");
			money = money - 10000 * (money / 10000);
		}

		if (money / 5000 != 0) {
			System.out.println("5000원 : " + money / 5000 + "개");
			money = money - 5000 * (money / 5000);
		}

		if (money / 1000 != 0) {
			System.out.println("1000원 : " + money / 1000 + "개");
			money = money - 1000 * (money / 1000);
		}

		if (money / 500 != 0) {
			System.out.println("500원 : " + money / 500 + "개");
			money = money - 500 * (money / 500);
		}

		if (money / 100 != 0) {
			System.out.println("100원 : " + money / 100 + "개");
			money = money - 100 * (money / 100);
		}

		if (money / 50 != 0) {
			System.out.println("50원 : " + money / 50 + "개");
			money = money - 50 * (money / 50);
		}

		if (money / 10 != 0) {
			System.out.println("10원 : " + money / 10 + "개");
			money = money - 10 * (money / 10);
		}

		if (money / 5 != 0) {
			System.out.println("5원 : " + money / 5 + "개");
			money = money - 5 * (money / 5);
		}

		if (money / 1 != 0) {
			System.out.println("1원 : " + money / 1 + "개");
			money = money - 1 * (money / 1);
		}

		scan.close();
	}

}
