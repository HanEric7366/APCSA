//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(0,0,0);
	}

	public Alien(int x, int y)
	{
		this(x,y,0);
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed=s;
		try
		{
			image = ImageIO.read(new File("C:\\Users\\bnick\\Desktop\\CSAP2\\Unit17\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void move(String direction)
	{
		setX(getX()+getSpeed());
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),40,40,null);
	}
	

	public String toString()
	{
		return "";
	}
}