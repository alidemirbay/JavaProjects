package com.sprintqa.java.class012;

public class sumOfarrayElementUsingForEach {

	public static void main(String[] args) {
		
		
		int salary[] = {2000,5000,1000,500,400,700,600,600,1200,900 };
		
		int cost=0;
	
		//  dataType varName: arrayName
		for(int empSalary: salary) {
			
			cost=cost+empSalary;
		
		}
	
	System.out.println(cost);
	
	
	
	}

}
