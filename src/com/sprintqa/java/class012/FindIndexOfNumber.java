package com.sprintqa.java.class012;

public class FindIndexOfNumber {

	public static void main(String[] args) {
		// write a prog to print position of an element

	int numbers[]= {10,35,67,89,45,10,40,60,58,10};
	int targetNumber=10;	// ? which 10
	
	//89 is stored at position 3
	
	for(int i=0; i<numbers.length; i++) {
		
	
	if(numbers[i]==targetNumber) {
		System.out.println("position of " + targetNumber + " is "+i);
		break;
	
	}
	}
	
	}}
