//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a number :: ");
		int numero = keyboard.nextInt();
		Prime test = new Prime(numero);
		test.setPrime(numero);
		System.out.println(test.toString());

	}	
}