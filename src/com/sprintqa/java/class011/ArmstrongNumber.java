package com.sprintqa.java.class011;


public class ArmstrongNumber {

	public static void main(String[] args) {
		// check if the number is armstrong or not
		
		
		
		int num1=1634, sum=0, lastDigit, originalNum1=num1;
		
		while(num1!=0) {
		lastDigit=num1%10;
		sum=sum + lastDigit*lastDigit*lastDigit;
		num1=num1/10;
		}		
		
		
		if(sum==originalNum1) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}	
			
		
	}

}
