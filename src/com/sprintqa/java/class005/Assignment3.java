package com.sprintqa.java.class005;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("1-square\n2-circle\n3-triangle\n4-rhombus");
		
	System.out.println("Choose a shape");	
		Scanner sc = new Scanner(System.in);
		int choice;
		choice = sc.nextInt();
		
		switch(choice ) {
		case 1: System.out.println("You have chosen a square"); break;
		case 2: System.out.println("You have chosen a circle"); break;
		case 3: System.out.println("You have chosen a triangle"); break; 
		case 4: System.out.println("You have chosen a rhombus"); break;
		default: System.out.println("There is no such shape");
	
	}
	
		sc.close();
	
	
	}

}
