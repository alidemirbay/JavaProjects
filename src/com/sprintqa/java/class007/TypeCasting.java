package com.sprintqa.java.class007;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		// implicit type casting-Widening

	//int	 num1 = 10; // 4byte
	//double num2 = num1; //8byte , 4byte fit into 8 byte
	//   num2 = num1;
		//System.out.println(num2);
	
	
	
	
	// explicit type casting-narrowing
	
	double	 num1 = 10.5 ; // 8byte
	int num2; //4byte , 8byte doesnt fit into 4 byte
	
	num2 = (int)num1;
	System.out.println(num2);
	
	
	}

}
