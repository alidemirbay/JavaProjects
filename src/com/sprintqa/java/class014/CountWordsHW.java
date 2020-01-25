package com.sprintqa.java.class014;

public class CountWordsHW {

	public static void main(String[] args) {
		// Count number of words in sentence
				String str12 = "Welcome to SprintQA! This is Chirag "
						+ "from SprintQA We are going to learn automationQA";
				
		/*	int counter=1;
				for (int i=0; i<str12.length(); i++) {
				if(str12.charAt(i)==' ')
					counter++;
			}
				System.out.println(counter);
			*/	
				
				
				String words[] = str12.split(" ");
				System.out.println(words.length);	
				
				// if space is used more than one it doesn't work		
				
				
				
	}}
