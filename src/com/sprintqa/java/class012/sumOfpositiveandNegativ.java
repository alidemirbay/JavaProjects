package com.sprintqa.java.class012;

import java.util.Scanner;

public class sumOfpositiveandNegativ {

	public static void main(String[] args) {
		
		
		int numbers[]= new int[10];
		Scanner sc=new Scanner  (System.in); 
		int posSum=0, negSum=0;
		
	// taking data from user
	for(int i=0; i<numbers.length; i++) {
		numbers[i]=sc.nextInt();	
	}
	
	
	//getting data from array and do sum
	for(int i=0; i<numbers.length; i++) {
		
		if(numbers[i]>0) {
			posSum=posSum+numbers[i];
		}else {
			negSum=negSum+numbers[i];
		}
	}
	
	
	System.out.println("sum of pos number="+posSum);
	System.out.println("sum of neg number="+negSum);
	sc.close();
	}

}
