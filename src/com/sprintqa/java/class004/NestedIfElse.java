package com.sprintqa.java.class004;

import java.util.Scanner;
public class NestedIfElse {
	public static void main(String[] args) {
	
		
		
        Scanner sc = new Scanner(System.in);		
		System.out.println("enter your age");		
		int age1	=sc.nextInt();		
		System.out.println("enter your weight");	
		int weight1=sc.nextInt();
	
	if (age1 >18) {		
		if (weight1>=50) {
		System.out.println("you are eligible and you can donate blood");}	
	else 
	{ System.out.println("you are eligible but you cannot donate blood");}
	
	
	}
sc.close();
	}
	
	}
