//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Lab0c
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo, intSum;
		double doubleOne, doubleTwo, doubleSum;
		float floatOne, floatTwo, floatSum;
		short shortOne, shortTwo, shortSum;
		byte byteOne, byteTwo, byteSum;
		long longOne, longTwo, longSum;

		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

		System.out.print("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		
		System.out.print("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();

		System.out.print("Enter a float :: ");
		floatOne = keyboard.nextFloat();

		System.out.print("Enter a float :: ");
		floatTwo = keyboard.nextFloat();

		System.out.print("Enter a short :: ");
		shortOne = keyboard.nextShort();

		System.out.print("Enter a short :: ");
		shortTwo = (short) keyboard.nextShort();

		System.out.print("Enter a byte :: ");
		byteOne = keyboard.nextByte();

		System.out.print("Enter a byte :: ");
		byteTwo = keyboard.nextByte();
		
		System.out.print("Enter a long :: ");
		longOne = keyboard.nextLong();

		System.out.print("Enter a long :: ");
		longTwo = keyboard.nextLong();

		intSum = intOne + intTwo;
		doubleSum = doubleOne + doubleTwo;
		floatSum = floatOne + floatTwo;
		shortSum = (short) (shortOne + shortTwo);
		byteSum = (byte) (byteOne + byteTwo);
		longSum = longOne + longTwo;
		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println();
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
		System.out.println();
		System.out.println("byte one = " + byteOne );
		System.out.println("byte two = " + byteTwo );
		System.out.println();
		System.out.println("long one = " + longOne );
		System.out.println("long two = " + longTwo );
		System.out.println();
		System.out.println("integer one + integer two  = " + intSum );
		System.out.println();
		System.out.println("double one + double two = " + doubleSum );
		System.out.println();
		System.out.println("float one + float two = " + floatSum );
		System.out.println();
		System.out.println("short one + short two = " + shortSum );
		System.out.println();
		System.out.println("byte one + byte two = " + byteSum );
		System.out.println();
		System.out.println("long one +long two = " + longSum );
		
		//add in output for all variables








	}
}