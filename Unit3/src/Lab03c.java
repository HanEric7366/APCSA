//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		Scanner fun = new Scanner(System.in);
		Quadratic q = new Quadratic();
		System.out.println("Enter the value of a:");
		double a = fun.nextDouble();
		System.out.println("Enter the value of b:");
		double b = fun.nextDouble();
		System.out.println("Enter the value of c:");
		double c = fun.nextDouble();
		q.setEquation(a, b, c);
		q.calcRoots();
		q.print();
	}
}