//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;

public class Lab02g
{
	public static void main( String[] args )
	{
		Fahrenheit f = new Fahrenheit();
		Scanner fun = new Scanner(System.in);
		System.out.println("Enter the temperature you would like to convert from Fahrenheit to Celsius");
		double temp = fun.nextDouble();
		f.setFahrenheit(temp);
		f.print();
	}
}