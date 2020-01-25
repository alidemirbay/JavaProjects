package com.sprintqa.java.class012;

public class FindLowestNumber {

	public static void main(String[] args) {
  //write a prog to print lowest number in the array
		
		int numbers[]= {10,35,67,89,45,10,40,60,58,7};
		
		//lowest is 7
		
		int min=0;
		
		min=numbers[0];
		for (int i=0; i<numbers.length; i++) {
			
			if(min>numbers[i]) {
				min=numbers[i];
			}
		}
		
		System.out.println("lowest number: "+min);		
		
	}}
