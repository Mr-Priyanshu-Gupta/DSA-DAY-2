import java.util.Scanner;

class DSA19
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Decimal number");
 		 int num1 = sc.nextInt();
	 	System.out.println(" Decimal number is :" + num1);
		if(num1 == 0){
		System.out.println("Binary : 0");
		}
		while(num1 >0){
			int binary = num1 % 2;
			num1 = num1 /2;
			System.out.println("Binary : " + binary)
  }
 }
}