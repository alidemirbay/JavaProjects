package com.sprintqa.java.class005;

import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {
		
		int choice;
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
				
		switch (choice) {
		case 1:  System.out.println("mon");	break;
		case 2:  System.out.println("tue"); break;
		case 3:  System.out.println("wed"); break;
		case 4:  System.out.println("thu"); break;
		case 5:  System.out.println("fri"); break;
		case 6:  System.out.println("sat"); break;
		case 7:  System.out.println("sun"); break;
		default: System.out.println("enter number between 1-7");
				
		}
		
		sc.close();	

	}

}
