//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class Lab02e
{
	public static void main( String[] args )
   {
		Circle c = new Circle();
		Scanner ok = new Scanner(System.in);
		System.out.println("Enter a radius:");
		c.setRadius(ok.nextDouble());
		c.calculateArea();
		c.print();
	
	}
}