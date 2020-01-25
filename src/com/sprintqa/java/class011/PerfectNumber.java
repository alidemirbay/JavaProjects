package com.sprintqa.java.class011;

public class PerfectNumber {

	public static void main(String[] args) {
		// check if number is perfect number


		int num1 = 28, sum=0;

		for(int i=1; i<num1; i++ ) {

			if (num1%i==0) {				

				sum=sum+i;
			}

		}if(num1==sum) {
			System.out.println("perfect");

		}else {
			System.out.println("not perfect");
		}

	}}
