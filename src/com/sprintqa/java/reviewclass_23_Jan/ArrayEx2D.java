package com.sprintqa.java.reviewclass_23_Jan;

public class ArrayEx2D {

	public static void main(String[] args) {
		// transpose of matrix
		// 1 4 7 
		// 2 5 8 
		// 3 6 9
		
		int numbers[][] = {{1, 2, 3},
						   {4, 5, 5},
						   {7, 8, 9}
						};
		
		for (int i=0; i<numbers.length; i++) {
			for(int j = 0; j<numbers[i].length;j++) {
				System.out.print(numbers[j][i]+" ");
			}
			System.out.println();
		}
		
		}}
