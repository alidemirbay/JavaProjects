package com.sprintqa.java.class010;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y= 0;
		int num=17;		
	
	for(int i= 2; i <=num/2; i++) {
		if(num%i==0) {
			y= 1;
		}
	}
	if(y!=1)
	{System.out.println(num+" is a prime");}
	else
		{System.out.println(num+" is not prime");}
	}

}
