package com.sprintqa.java.class010;

public class LogicalEx {

	public static void main(String[] args) {
		
		// program to check number is prime or not

		int number=10;
		int sum=0;
		for (int i=1; i<=number; i++) {
			if (number%i==0) {
				
				sum=sum + i;
			}
		}
		
	if (sum==1+number) {
		System.out.println("it is a prime number" );
	}
	else {
		System.out.println("it is not prime number");
	}
	
	}}
