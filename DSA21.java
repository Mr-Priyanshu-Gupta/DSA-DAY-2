import java.util.Scanner;

class DSA21
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Decimal number");
 		 int num1 = sc.nextInt();
	 	System.out.println(" Decimal number is :" + num1);
		 if(num1 == 0){
		System.out.println("HEXAdec : 0");
		}
		while(num1 > 0){
		 int HEXAdec = num1 % 8;
		 num1 = num1 /8;
		System.out.println("HEXAdecimal value : " + HEXAdec);
  }
 }
}