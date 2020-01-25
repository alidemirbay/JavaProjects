package com.sprintqa.java.class003;

import java.util.Scanner;

public class LadderIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number (1-7)");
		
		
		int num = sc.nextInt();
				
			if (num ==1) {
				System.out.print("Monday");
			} else if(num==2) {
				System.out.print("Tuesday");
			} else if(num==3) {
				System.out.print("Wednesday");
			} else if(num==7) {
				System.out.print("Sunday");
				
			} else System.out.print("enter a number between 1 and 7");
		sc.close();
	}
		

	}


