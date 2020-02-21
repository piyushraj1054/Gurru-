package practice;

import java.util.Scanner;

public class Question_5 {

	public static void main(String[] args) {
		/*A school has following rules for grading system:
			a. Below 25 - F
			b. 25 to 45 - E
			c. 45 to 50 - D
			d. 50 to 60 - C
			e. 60 to 80 - B
			f. Above 80 - A
			Ask user to enter marks and print the corresponding grade. */
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter Marks Obtained");
		double Marks = Input.nextInt();
		
		if(Marks>=80) {
			System.out.println("Grade is A");
		}
		else if(Marks>=60 & Marks<=80){
			System.out.println("Grade is B");			
		}
		else if ( Marks >=50 & Marks<=60) {
			System.out.println("Grade is C");
			}
	else if(Marks>=45 & Marks<=50) 
	{
		System.out.println("Grade is D");
	}
	else if (Marks>=25 & Marks<=45) {
		System.out.println("Grade is E");
	}
	else {
		System.out.println("Grade is F");
	}

}}
