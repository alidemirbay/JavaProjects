package com.sprintqa.java.class013;

public class stringManipulation {

	public static void main(String[] args) {

		/*  String str1="Hello"; // + conc
		String str2=new String("Hello");
		String str3= "Hello";
		String str4=new String("Hello");

		String actualWebTitle = "Welcome to ebay";
		String expectedTitle="Welcome to Ebay";




		System.out.println(str1==str3);//true because compiler will refer to same object
		System.out.println(str2==str4);// false because compiler refer to different objects
		System.out.println(str2.equals(str4));// true it checks for the equality
		System.out.println(expectedTitle.equalsIgnoreCase(actualWebTitle));
		System.out.println(expectedTitle.length());


		System.out.println(str1.charAt(2));	
		 */


		String original= "SprintQA";  //write reverse string

		String rev="";
		for(int i=original.length()-1; i>=0; i--) {

			rev=rev + original.charAt(i);
		}

		System.out.println(rev);	

	}

}
