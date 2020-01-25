package com.sprintqa.java.class011;

public class ReverseNumber {

	public static void main(String[] args) {
		// write reverse number  123-->321
		int num1 = 5689, reverse = 0, lastDigit;

		while (num1 != 0) {
			lastDigit = num1 % 10;
			reverse=reverse*10 + lastDigit; // 3 , 32, 321
			num1 = num1 / 10;
		}

		System.out.println(reverse);


	}

}
