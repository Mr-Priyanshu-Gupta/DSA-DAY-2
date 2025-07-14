import java.util.Scanner;

class DSA26
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
				if(result == 0){
		System.out.println("Binary : 0");
		}
		while(result >0){
			int binary = result % 2;
			result = result /2;
			System.out.println("Binary : " + binary);
  }

			
 }		

 }
