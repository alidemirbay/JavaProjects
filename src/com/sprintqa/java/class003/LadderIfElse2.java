package com.sprintqa.java.class003;

import java.util.Scanner;

public class LadderIfElse2 {

	public static void main(String[] args) {
		
		double num1 = 10,  num2 = 20;
		
		
		
		
		System.out.println("please enter operation to perform");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if (choice==1) { double result = num1+num2;
		
		System.out.println("sum is "+result);
		}
		
		else if (choice==2) { double result = num1-num2;
		
		System.out.println("sub is "+result);
		}
		else if (choice==3) { double result = num1*num2;
		
		System.out.println("mul is "+result);
		}

		else if (choice==4) { double result = num1/num2;

		System.out.println("div is "+result);
		}
	
	sc.close();
	
	
	
	}

}
