package com.sprintqa.java.class012;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int salary[] = {2000,5000,1000,500,400,700,600,600,1200,900 };
		
		int sum=0;
		
		for(int i=0; i<salary.length; i++) {
			sum = sum + salary[i];
		}
		System.out.println("total cost: "+sum);
	}

}
