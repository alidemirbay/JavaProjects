package com.sprintqa.java.class009;

import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
		int noOfRaws = sc.nextInt();
		int noOfCols = sc.nextInt();
		
	for(int i=1; i<=noOfRaws; i++) { //outer for-loop
		
		for(int j=1; j<=noOfCols; j++) { // inner for-loop
			
			
			System.out.print("*");
			
		} //end of inner loop
		System.out.println();
		
	} // end of outer loop
	sc.close();
	
	
	}

}
