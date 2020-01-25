package com.sprintqa.java.class004;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int age=60, weight=50;
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("enter your age");		
		 age	=sc.nextInt();		
		System.out.println("enter your weight");	
		 weight=sc.nextInt();
		
		 if (age<50  && weight<50)  {System.out.println("you are fit");
			 
		 }else
		
		 { System.out.println("you have to run daily");}
		sc.close();
	}

	}


