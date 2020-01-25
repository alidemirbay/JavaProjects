package com.sprintqa.java.class008;

public class SeriesProgramHW2 {

	public static void main(String[] args) {
		// 1^1+2^2+...10^10

	long sum=0;
		for(int i=1; i<=10; i++) {
			
			sum= (long) (sum+Math.pow(i, i));
			
		}
			
	System.out.println(sum);
	
		}

}
