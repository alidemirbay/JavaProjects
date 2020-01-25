package com.sprintqa.java.class005;

import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {

		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();		
	
	if(age>=18&&age<=60) {
		System.out.println("You are eligible for work");
	
	}else if(age>60) {
		System.out.println("You are too old");
	}
	
	else {
		System.out.println("You are minor");
	}	
	sc.close();
	}

}
