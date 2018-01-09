package com.javaex.practice;

public class Problem03 {

	public static void main(String[] args) {

		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				c[i] = ',';
			}
		}
		System.out.println(c);

	}
	// ''를 ,로 바꾸었으면 음 원래꺼는 어떻게 뽑지....
}
