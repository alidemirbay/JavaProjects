package com.sprintqa.java.class012;

public class SumOfEachRow {

	public static void main(String[] args) {

		int numbers[][]= {{10,20,30},{40,50,60},{70,80,90}};
	
		// sum of row1- 60
		//sum of row2- 150
		//sum of row3-240
		
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum=0;
			for(int j=0; j<numbers[i].length; j++){
				
				sum=sum+numbers[i][j];
				
			}
		
		System.out.println("sum of row "+i+" ="+sum);
		}
			
	}

}
