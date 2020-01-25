package com.sprintqa.java.class012;

public class FindLargestNumber {

	public static void main(String[] args) {
  //write a prog to print largest number in the array
		
		int numbers[]= {10,35,67,89,45,10,40,60,58,7};
		
		//largest is 89
		
		int max=0;
		
		max=numbers[0];
		for (int i=0; i<numbers.length; i++) {
			
			if(max<numbers[i]) {
				max=numbers[i];
			}			
			
		}
		
		System.out.println("largest number: "+max);			
		
	}

}
