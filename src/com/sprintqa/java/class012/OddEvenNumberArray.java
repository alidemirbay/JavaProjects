package com.sprintqa.java.class012;

public class OddEvenNumberArray {

	public static void main(String[] args) {
	// find number of odd and even numbers in the array
	
		
		int numbers[]= {12,65,78,1,6,45,71,65,34,89};
		int odd=0;
		int even=0;
		
		for(int i=1; i<numbers.length; i++) {
			
			
			if(numbers[i]%2==0) {
				even++;
			}
		
			else{odd++;}			
		
		}	
	
		System.out.println("even:"+even + " odd:"+odd);
	
	}

}
