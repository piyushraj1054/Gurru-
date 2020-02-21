package practice;

import java.util.Scanner;

public class Question_1 {
	// Take values of length and breadth of a rectangle from user and check if it is square or not. 

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter Length");
		int Length = Input.nextInt();
		
		System.out.println("Enter Breath");
		int Breath = Input.nextInt();
		if(Length == Breath)
		{
			System.out.println("It is a square");
		}
		else {
			System.out.println("It is a reactangle");
		}
		
		// Take two int values from user and print greatest among them. 
		System.out.println("**************************=============================****************************************");
		System.out.println("Enter first integer");
		int a = Input.nextInt();
		System.out.println("Enter Second integer");
		int b = Input.nextInt();
		
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}
		

	}

}
