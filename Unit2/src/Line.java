//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private double x01,y01, x02, y02;
	private double slope;

	public Line(double x1, double y1, double x2, double y2)
	{





	}

	public void setCoordinates(double x1, double y1, double x2, double y2)
	{

		x01=x1;
		x02=x2;
		y01=y1;
		y02=y2;

	}

	public void calculateSlope( )
	{
		slope = (y01-y02)/(x01-x02);
	}

	public void print( )
	{
		System.out.println("The slope of the line is equal to "+slope+".");
	}
}