package practice;

public class Number_Swap {

	public static void main(String[] args) 
	{
		//With third variable
		int a = 10;
		int b = 20;
		int temp;
		
		/*temp = a;
		a=b;
		b=temp;
		System.out.println("with third variable");
		System.out.println(a);
		System.out.println(b);*/
		
		//without third variable
		System.out.println("without third variable");
		a=a+b; //10+20 = 30
		b = a-b; // 30-20=10
		a=a-b; // 30 -10
		System.out.println(a);
		System.out.println(b);
		

	}

}