package com.sprintqa.java.class008;

public class SeriesProgram4 {

	public static void main(String[] args) {
		// calc 1/2 +2/3 +3/4 ....10/11
	
	
	double i ,j;
	
	double sum=0;
	for (i=1, j=2; i<=10 ;i++,j++) {
		
		
		sum=sum+(i/j);
		
	}
	
System.out.println(sum);
	
	}

}
