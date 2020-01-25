package com.sprintqa.java.class005;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {

		System.out.println("Enter: number1, operator(+,-,*,/) number2");
		Scanner sc = new Scanner(System.in);

		double num1 = sc.nextDouble();
		char opr = sc.next().charAt(0);
		double num2 = sc.nextDouble();		
		double result = 0; 
	
	switch(opr) {
	case'+': result = num1 + num2;
	break;
	case'-': result = num1 - num2;
	break;
	case'*': result = num1 * num2;
	break;
	case'/': if (num2==0) {sc.close();
		System.out.println("Division by 0!"); return;
	}else {result = num1 / num2;}
	break;
		
	default: System.out.println("invalid operator");
	}
		
		System.out.println("result:"+result);
		
		
		sc.close();	
		
	
	}

}
