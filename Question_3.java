package practice;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		/*A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
		Ask user for quantity
		Suppose, one unit will cost 100.
		Judge and print total cost for user.*/
		
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter Quantity");
		int Quantity = Input.nextInt();
		System.out.println("Enter cost");
		int Ucost= Input.nextInt();
		int Purchase = Quantity*Ucost;
		if(Purchase>1000)
		{
			int Discount = Purchase*10/100;
			int finalprice = Purchase-Discount;
			System.out.println("Discount is :" +Discount);
			System.out.println("Final Price is :" +finalprice);
		}
		else {
			System.out.println("Purchase is less than 1000. No discount applicable");
		}
	}

}

