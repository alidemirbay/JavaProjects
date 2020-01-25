package com.sprintqa.java.class011;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		int num1=scanner.nextInt();

		boolean flag=false;

		for(int i=2; i<=num1-1; i++) {

			if(num1==2 ||num1==1) {
				break;
			}
			if(num1%i==0) {
				System.out.println("not prime");
				flag=true;
				break;
			}

		}

		if(flag==false) {
			System.out.println("number is prime");
		}

		System.out.println("end of program");
		scanner.close();
	}

}
