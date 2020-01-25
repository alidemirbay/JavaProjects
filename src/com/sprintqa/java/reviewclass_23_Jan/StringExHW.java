package com.sprintqa.java.reviewclass_23_Jan;

public class StringExHW {

	public static void main(String[] args) {

		// write a prog to print frequency of given char
		
		String str = "This is string program we learning from java concept";
		char c = 't';
		
	int frq = 0;
	for(int i=0; i<str.length(); i++) {
		if (c==str.toLowerCase().charAt(i) || c==str.toUpperCase().charAt(i)) {
			frq++;
		}
		
	}
	
	System.out.println("frequency of "+ c +" is " + frq);
	}

}
