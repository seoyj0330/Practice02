package com.javaex.practice;

public class Problem05 {
	public static void main(String[] args) {
		// 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또

		int[] lotto = new int[6];
		
		for(int i =0; i <lotto.length; i++) {
			lotto[i]= (int)(Math.random()*45) + 1;
			for(int j =0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		
	
		for(int i = 0 ; i <lotto.length ; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}
