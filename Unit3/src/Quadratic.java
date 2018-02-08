//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private double a, b, c, rootOne, rootTwo;

	public Quadratic()
	{


	}


	public void setEquation(double quadA, double quadB, double quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
		
 	}

	public void calcRoots( )
	{
		rootOne = (-b+sqrt(b*b-4*a*c))/2*a;
		rootTwo = (-b-sqrt(b*b-4*a*c))/2*a;
	}

	public void print( )
	{
		System.out.println("The roots of this equation are "+rootOne+" and "+rootTwo+".");
	}
}