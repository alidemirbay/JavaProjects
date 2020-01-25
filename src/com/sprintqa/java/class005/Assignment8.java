package com.sprintqa.java.class005;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary:");
			int salary = sc.nextInt();
		
		System.out.println("Enter your experience:");
			int experience = sc.nextInt();
		
		if (salary>=40000 && experience>=2) {
			System.out.println("Congratulations! You are qualified for a loan.");
		}else {
			System.out.println("Sorry! You are not qualified for a loan");
		}
		
		sc.close();
	}

}
