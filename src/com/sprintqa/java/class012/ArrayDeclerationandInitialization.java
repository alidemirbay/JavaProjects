package com.sprintqa.java.class012;

import java.util.Scanner;

public class ArrayDeclerationandInitialization {

	public static void main(String[] args) {
		
		int numbers[]= new int[5];		//decl and init
		
		
		Scanner sc=new Scanner  (System.in); 
		numbers[0]=sc.nextInt();
		numbers[1]=sc.nextInt();
		numbers[2]=sc.nextInt();
		numbers[3]=sc.nextInt();
		numbers[4]=sc.nextInt();
		
		
		for(int i=0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
		
		}
		
		sc.close();
		
	}

}
