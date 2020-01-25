package com.sprintqa.java.reviewclass_23_Jan;

public class LogicalProgramEx1 {

	public static void main(String[] args) {
		int num1=26;

		boolean flag=false;
		for(int i=2; i<=num1-1; i++) {

			if(num1==2||num1==1) {
				break;
			}
			if(num1%i==0) {
				System.out.println("not prime");
				flag= true;
				break;
			}
		}if (flag==false) {

			System.out.println("prime");
		}


	}}



