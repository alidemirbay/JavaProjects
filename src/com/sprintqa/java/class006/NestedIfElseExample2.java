package com.sprintqa.java.class006;

public class NestedIfElseExample2 {

	//student shiukd be graduated frim eng-please complete graduation and apply
	//std shiukld have 70% or above- your score is lower than eligible criteria
	public static void main(String[] args) {
		
		boolean hasGrDeg = true;
		int marks = 90;
		
		if (hasGrDeg==true) {
			if(marks>=70) {
				System.out.println("you are eligible for job");
			}else {
				System.out.println("your score is lower than needed");
				
			}
		}else {
			System.out.println("please complete graduation and apply");
		}
			
		
		
		
	}

}
