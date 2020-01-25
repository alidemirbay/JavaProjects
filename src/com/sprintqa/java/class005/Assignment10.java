package com.sprintqa.java.class005;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {		
		
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter your grade:");	
			char grade = sc.next().charAt(0);	
	
	switch (grade) {
	case 'A':
		System.out.println("Excellent");
		break;
	case'B':
		System.out.println("Good");
		break;
	
	case'C':
		System.out.println("Average");
		break;
	case'F':
		System.out.println("Bad");
		break;
	
	default:
		System.out.println("Enter A,B,C or F");
		break;
	
	}
	sc.close();
	
	
	
	
	
	}

}
