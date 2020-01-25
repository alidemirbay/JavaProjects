package com.sprintqa.java.class012;

import java.util.Scanner;

public class CostToCompany {

	public static void main(String[] args) {
		
		
		int salary[]= new int[5];// decl of array and init with zero value	
		
		Scanner sc=new Scanner  (System.in); 
		
		int sum=0;
		
		//taking data from user and assigning in each position
		salary[0]=sc.nextInt();
		salary[1]=sc.nextInt();
		salary[2]=sc.nextInt();
		salary[3]=sc.nextInt();
		salary[4]=sc.nextInt();
		
		
		for(int i=0; i<salary.length; i++) {
			
			sum=sum+salary[i];
		}
		
		
		System.out.println("cost:"+sum);
		
		sc.close();	
		
		
		
	}

}
