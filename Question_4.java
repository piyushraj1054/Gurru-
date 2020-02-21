package practice;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {
	/*	A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		Ask user for their salary and year of service and print the net bonus amount.*/
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter number of year of service");
		int Experience = Input.nextInt();
		System.out.println("Enter Salary");
		int Salary = Input.nextInt();
		if(Experience>5)
		{
			double bonus= Salary*5/100;
			double TotalSal= Salary+bonus;
			System.out.println("Bounus is : " +bonus);
			System.out.println("Salary is : " +Salary);
		}
		else
		{
			System.out.println("Bonus not applicable");
		}
		
	}

}
