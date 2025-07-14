import java.util.Scanner;

class DSA30
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Hexadec  number");
 		 //int num1 = sc.nextInt();
			String hexStr = sc.nextLine(); 
	 	System.out.println(" hexadec number is :" + hexStr);
			int decnum = Integer.parseInt(hexStr, 16);
			String octnum = Integer.toOctalString(decnum);
			System.out.println(octnum); 
 }		

 }
