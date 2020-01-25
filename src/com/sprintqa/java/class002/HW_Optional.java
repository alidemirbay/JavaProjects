package com.sprintqa.java.class002;

public class HW_Optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int s = 5000;				
		int h = s/3600 ;		
		System.out.print(h +" "+"hours");
		
		
		int sec = s % 3600;		
		int m = sec / 60 ;		
		System.out.print(" "+ m +" "+"minutes");
		
		
		int sk = s % 60;
		
		System.out.print(" "+ sk +" "+"seconds");
	}

}
