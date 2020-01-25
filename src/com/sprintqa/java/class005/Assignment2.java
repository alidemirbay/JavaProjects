package com.sprintqa.java.class005;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		int num;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many sales did the employee make this week");
		
		 num	=sc.nextInt();
		
		if(num <=10) { System.out.println("The employee's pay is $800");}
		
		else {System.out.println("The employee's pay is $1000");}
	
		
		
		sc.close();

	}

}
