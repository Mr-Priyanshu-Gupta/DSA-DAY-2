import java.util.Scanner;

class DSA25
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter your binary number");
 		 int num1 = sc.nextInt();
	 	System.out.println(" octal number is :" + num1);
			int power = 1;
			int result = 0 ;
				while(num1 > 0 ){
				int x = num1 % 10;
				result = result + (x * power);
				power = power * 8;
				num1 = num1 / 10;
			
			}
System.out.println(result);
			
 }		

 }
