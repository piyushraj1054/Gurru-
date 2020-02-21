package practice;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		 //Take input of age of 3 people by user and determine oldest and youngest among them. 
		Scanner Input = new Scanner(System.in);
		System.out.println("Age of User 1");
		int User_1 = Input.nextInt();
		System.out.println("Age of User 2");
		int User_2 = Input.nextInt();
		System.out.println("Age of User 3");
		int User_3 = Input.nextInt();
		
		if(User_1>User_2 & User_1 > User_3 )
		{
			System.out.println("User 1 is older than User 2 and User 3");
			//System.out.println("User 3 is youngest");
		}
		else if(User_2>User_3 & User_2>User_1 )
		{
			System.out.println("User 2 is older than User 1 and User 3");
			//System.out.println("User 1 is youngest");
		}
		else  {
			System.out.println("User 3 is oldest");
			//System.out.println("User 2 is youngest");
		}
		
		}
		
	}


