//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setX(200);setY(200);setWidth(10);setHeight(10);setColor(Color.BLUE);
	}

	
	public Block(int x, int y)
	{
		setX(x);setY(y);setColor(Color.BLUE);setWidth(10);setHeight(10);
	}
	
	public Block(int x, int y, int w, int h)
	{
		setX(x);setY(y);setWidth(w);setHeight(h);setColor(Color.BLUE);
	}
   
	public Block(int x, int y, int w, int h, Color col)
	{
		setX(x);setY(y);setWidth(w);setHeight(h);setColor(col);
	}

   public Block(int i, int j, int k) {
	   setX(i);setY(j);setColor(Color.BLUE);setWidth(k);setHeight(10);
   }


public void setColor(Color col)
   {
	   color = col;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void setWidth(int w){
	   width = w;
   }
   public int getWidth(){
	   return width;
   }
   public int getHeight(){
	   return height;
   }
   public void setHeight(int h){
	   height = h;
   }
	public boolean equals(Object obj)
	{
		if(this==obj)return true;
		return false;
	}

	 
	public void setPos(int x, int y) {
		setX(x);setY(y);
	}

	 
	public void setX(int x) {
		xPos = x;
	}

	 
	public void setY(int y) {
		yPos = y;
	}

	 
	public int getX() {
		return xPos;
	}

	 
	public int getY() {
		return yPos;
	}   

   public String toString(){
	   String output=xPos+" "+yPos+" "+width+" "+height+" "+color;
	   return output;
   }
}