package com.sprintqa.java.class006;

public class NestedIfElseExample {

	public static void main(String[] args) {
		
		int dbUsername = 200;
		int dbPassword = 1234;
		
		int inputUsername = 300;
		int inputPassword = 1235;
		
		if(dbUsername ==inputUsername) { //cond1 if block
			if(dbPassword ==inputPassword)	{  //cond2 if block
				System.out.println("Login succesful!");
				
			}else	{
				System.out.println("Incorrect password");
			}
		}else {	//cond1 else block
			
			System.out.println("Entered user is not found ");
		}
		

	}

}
