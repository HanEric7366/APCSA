//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(int x, int y)
	{
		setX(x);setY(y);setColor(Color.BLUE);
	}
	
	public Ball(int x, int y, int w, int h)
	{
		setX(x);setY(y);setWidth(w);setHeight(h);setColor(Color.BLUE);
	}
   
	public Ball(int x, int y, int w, int h, Color col)
	{
		setX(x);setY(y);setWidth(w);setHeight(h);setColor(col);
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xs, int ys){
		setX(x);setY(y);setWidth(w);setHeight(h);setColor(col);setxSpeed(xs);setySpeed(ys);
	}
	
	public void setxSpeed(int xs){
		xSpeed = xs;
	}
	public void setySpeed(int ys){
		ySpeed = ys;
	}

   public void moveAndDraw(Graphics window)
   {
      setX(getX()+xSpeed);
      setY(getY()+ySpeed);
   }
   
	public boolean equals(Object obj)
	{
		if(obj==this)return true;
		return false;
	}   

   public int getxSpeed(){
	   return xSpeed;
   }
   public int getySpeed(){
	   return ySpeed;
   }
}