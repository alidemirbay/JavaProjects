package com.sprintqa.java.class011;

import java.util.Scanner;

public class DisplayDigit {

	public static void main(String[] args) {
		
	// display digits separately
		
		int lastDigit;
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
	/*  153	 	
	 
	 	3
	 	5
	 	1  
	 
		System.out.println(num1%10);	//3
		num1=num1/10;	//15
		
		System.out.println(num1%10);  // 5
		num1=num1/10;	//1
		
		System.out.println(num1%10);  //1
		num1=num1/10;	//0     */
	
	while(num1 !=0) {
		lastDigit=num1%10;	//getting last digit
		System.out.println(lastDigit);
		num1=num1/10;	//remove last digit
	}
	
	sc.close();
	
	
	
	
	
	
	}

}
