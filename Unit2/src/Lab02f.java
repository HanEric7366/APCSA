//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class Lab02f
{
	public static void main( String[] args )
   {
		Line l = new Line(0,0,0,0);
		Scanner fun = new Scanner(System.in);
		System.out.println("Enter the x-coord of the first point:");
		double firstx = fun.nextDouble();
		System.out.println("Enter the y-coord of the first point:");
		double firsty = fun.nextDouble();
		System.out.println("Enter the x-coord of the second point:");
		double secx = fun.nextDouble();
		System.out.println("Enter the y-coord of the second point:");
		double secy = fun.nextDouble();
		l.setCoordinates(firstx, firsty, secx, secy);
		l.calculateSlope();
		l.print();
	}
}