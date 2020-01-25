package com.sprintqa.java.class007;

public class ForLoopEx5 {

	public static void main(String[] args) {
		
		//write a prog with output 11029384756
		
		
		/* for(int i=1,j=10; i<=5 && j>=6; i++,j-- ) {				
			
			System.out.print(i);
			System.out.print(j);
			
		} */
		
		/*	for(int i=1,j=10; i<=5 ; i++,j-- ) {				
			
			System.out.print(i);  // if we use i or j enough -loop repeat 5 times
			System.out.print(j);  // if we use j   we put  j>=6
		
		
		}	*/
	
			for(int i=1; i<=5 ; i++ ) {				
				
				System.out.print(i);  
				System.out.print(11-i);  			
	
			}
	
	
	
	}

}
