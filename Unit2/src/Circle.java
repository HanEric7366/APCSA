//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = radius * radius * 3.1415926535;
	}

	public void print( )
	{
		System.out.println("The area of the circle with radius "+radius+" is "+area+".");
	}
}