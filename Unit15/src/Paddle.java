//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
      speed =5;
   }

    public Paddle(int i, int j) {
    	super(i,j);
    	speed=5;
    }
    
	public Paddle(int i, int j, int k) {
		super(i,j);
		speed=k;
	}
	
	public Paddle(int i, int j, int k, int l, int m) {
		super(i,j,k,l);
		speed=m;
	}
	
	public Paddle(int i, int j, int k, int l, Color green, int m) {
		super(i,j,k,l,green);
		speed=m;
	}

	public void moveUpAndDraw(Graphics window)
	{

	}

    public void moveDownAndDraw(Graphics window)
    {

    }

   
}