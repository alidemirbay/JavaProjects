package com.sprintqa.java.class012;

public class CountDigit {

	public static void main(String[] args) {
		// write a prog to print number of  digit
		
		int num1=8970945  , count=0;
		
		while(num1!=0) { //or num1>0
			num1=num1/10;
			count++;		//finds number of iteration
		}
	
	System.out.println(count);
	
	
	
	
	}

}
