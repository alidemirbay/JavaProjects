package com.sprintqa.java.class008;

public class SeriesProgram3 {

	public static void main(String[] args) {
		// find sum of even number 1-10
	
	
		int sum=0;
		
		for (int i=1; i<=10; i++)  {
			
			if(i%2==0) {		// even number			
			
			sum=sum +i;	
			}	
		}

		
		
		System.out.println("sum is "+sum);
	
	
	}

}
