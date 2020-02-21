package practice;

public class String_Reverse {

	public static void main(String[] args) {
		
		String str= "Hello World";
		int length = str.length();
		String reverse = "";
		for(int i = length-1;i>0;i--)
		{
			reverse = reverse + str.charAt(i);
			
		}
		System.out.println("Reverse of string is : " +reverse);


	}

}
