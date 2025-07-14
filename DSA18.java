import java.util.Scanner;

class DSA18
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
		long Sum = 0;
		long Rem = 0;
		long result1 = 0;
		int shift = 0;
		long Mul;
		long x;

		System.out.println("Enter 1st Binary number");
 		 long binary1 = sc.nextLong();
		System.out.println("number 1 is :" + binary1);

		System.out.println("Enter 2nd Binary number");
		 long binary2 = sc.nextLong();
		System.out.println("number 2 is :" + binary2);

		while(binary2 != 0){
			long tempBinary1 = binary1; // Use a copy for inner loop
    		long partial = 0;
			int place = 1;
			x = binary2 % 10;
			while(tempBinary1 != 0){
				Mul = (((tempBinary1 % 10) * x) % 2);
				partial += Mul * place;
				place = place*10;
				tempBinary1 = tempBinary1 / 10;
			}	
			result1 += partial * (long)Math.pow(10, shift);
			binary2 = binary2 / 10; 
   			 shift++;
		}

System.out.println("Product is: " + result1);
}
}