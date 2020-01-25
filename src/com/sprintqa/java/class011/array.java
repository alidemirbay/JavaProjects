package com.sprintqa.java.class011;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
	int stdMark[] ;	//declaration of array
	int choice;
	
	
	stdMark=new int[10];  // initialization of array
	Scanner scanner=new Scanner(System.in);
	
	
	for(int i = 0; i<10; i++) {
		System.out.println("enter number at position "+i+" -");
		
		stdMark[i]=scanner.nextInt();
	}
	
	do {	
	
		System.out.println("enter roll number - ");
		int rollNumber=scanner.nextInt();	
	
	
		System.out.println(stdMark[rollNumber - 1]);
	
		System.out.println("do you want to continue ");
	
		choice=scanner.nextInt();
		} while (choice==1);
	
	scanner.close();
	
	
	
	
	
	
	}}
