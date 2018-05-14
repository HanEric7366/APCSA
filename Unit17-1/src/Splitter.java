import java.awt.Color;
import java.awt.Graphics;

public class Splitter extends MovingThing {
	private int speed;

	public Splitter()
	{
		this(0,0,0);
	}

	public Splitter(int x, int y)
	{
		super(x, y);
		setSpeed(5);
	}

	public Splitter(int x, int y, int s)
	{
		super(x, y);
		setSpeed(s);
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window )
	{
		window.setColor(Color.black);
		window.fillRect(getX(), getY(), 5, 5);
		move("");
		window.setColor(Color.RED);
		window.fillRect(getX(), getY(), 5, 5);
	}
	
	public void move( String direction )
	{
		setY(getY()+getSpeed());
		setX(getX());
	}

	public String toString()
	{
		return "";
	}
}
