//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner fun = new Scanner(System.in);
		Distance d = new Distance();
		System.out.println("Enter the x-coord of the first point:");
		double firstx = fun.nextDouble();
		System.out.println("Enter the y-coord of the first point:");
		double firsty = fun.nextDouble();
		System.out.println("Enter the x-coord of the second point:");
		double secx = fun.nextDouble();
		System.out.println("Enter the y-coord of the second point:");
		double secy = fun.nextDouble();
		d.setCoordinates(firstx, firsty, secx, secy);
		d.calcDistance();
		d.print();
			
	}
}