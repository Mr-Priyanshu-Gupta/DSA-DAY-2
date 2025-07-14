import java.util.Scanner;

class DSA24
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		System.out.println("Enter your binary number");
 		 int num1 = sc.nextInt();
	 	System.out.println(" binary number is :" + num1);
		int power = 1;
		int result = 0 ;
			while(num1 > 0 ){
				int x = num1 % 10;
				result = result + (x * power);
				power = power * 2;
				num1 = num1 / 10;
			}
//binary to octa dec

		 if(result == 0){
		System.out.println("HEXAdec : 0");
		 }
		while(result > 0){
		 int HEXAdec = result % 8;
		 result = result /8;
		System.out.println("HEXAdecimal value : " + HEXAdec);
}
 }
}