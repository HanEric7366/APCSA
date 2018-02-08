//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private double x01,y01, x02, y02;
	private double length;
	public Distance()
	{



	}


	public void setCoordinates(double x1, double y1, double x2, double y2)
	{

		x01=x1;
		x02=x2;
		y01=y1;
		y02=y2;

	}

	public void calcDistance()
	{
		length = sqrt((x01-x02)*(x01-x02)+(y01-y02)*(y01-y02));
	}

	public void print( )
	{
		System.out.println("The distance between these two points is "+length+".");
	}
}