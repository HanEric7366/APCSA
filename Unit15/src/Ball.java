//� A+ Computer Science  -  www.apluscompsci.com
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
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
   
	public Ball(int x, int y, int w, int h, Color col)
	{
		super(x,y,w,h,col);
		xSpeed = 3;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xs, int ys){
		super(x,y,w,h,col);
		xSpeed = xs;
		ySpeed = ys;
	}
	
	public void setXSpeed(int xs){
		xSpeed = xs;
	}
	public void setYSpeed(int ys){
		ySpeed = ys;
	}

   public void moveAndDraw(Graphics window)
   {
      window.setColor(Color.WHITE);
	  super.draw(window);
	  setX(getX()+xSpeed);
      setY(getY()+ySpeed);
      window.setColor(super.getColor());
      super.draw(window);
   }
   
	public boolean equals(Object obj)
	{
		if(obj==this)return true;
		return false;
	}   

   public int getXSpeed(){
	   return xSpeed;
   }
   public int getYSpeed(){
	   return ySpeed;
   }
}