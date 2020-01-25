package com.sprintqa.java.class005;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
	
Scanner sc =new Scanner(System.in);
		
System.out.println("How many pennies?");		
		int penny = sc.nextInt();
		
System.out.println("How many nickels?");		
		int nickel = sc.nextInt();
		
System.out.println("How many dimes?");		
		int dime = sc.nextInt();
		
System.out.println("How many quarters?");		
		int quarter = sc.nextInt();
		
		
		int cent = penny+5*nickel+10*dime+25*quarter;
		
		if (cent==100) {
			System.out.println("Congratulation! It is $1.00! You win");}
		
		else if(cent>100) {int over =cent - 100;
		System.out.println("You went over by "+over+" cents");
		
		}
		else if(cent<100) {int under = 100 - cent;
		System.out.println("You went under by "+under+" cents");
		}
		
		
		sc.close();
					
		
		
		
	}

}
