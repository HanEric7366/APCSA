
//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable, Collidable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		xPos = 100;
		yPos = 150;
		width = 10;
		height = 10;
		color = Color.black;

	}

	public Block(int x, int y) {
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
		color = Color.black;
	}

	// add other Block constructors - x , y , width, height, color
	public Block(int x, int y, int widthr, int hieghtr) {
		xPos = x;
		yPos = y;
		width = widthr;
		height = hieghtr;
		color = Color.black;
	}

	public Block(int x, int y, int widthr, int hieghtr, Color col) {
		xPos = x;
		yPos = y;
		width = widthr;
		height = hieghtr;
		color = col;
	}

	// add the other set methods

	public void setColor(Color col) {
		color = col;

	}

	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void setX(int x) {
		xPos = x;
	}

	public void setY(int y) {
		yPos = y;
	}

	public void setSize(int widthr, int heightr) {
		width = widthr;
		height = heightr;
	}

	public void draw(Graphics window) {
		// uncomment after you write the set and get methods
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		return false;
	}

	// add the other get methods
	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return "x - " + xPos + " || y - " + yPos + " || width - " + width + " || height - " + height + " || Color - "
				+ color;
	}

	
	public boolean didCollideLeft(Object obj) {
		if (obj instanceof Block){
            Block block = (Block) obj;
            if (xPos <= block.getX() + block.getWidth() && xPos >= block.getX())
                return true;
        }
		return false;
	}

	
	public boolean didCollideRight(Object obj) {
		if (obj instanceof Block) {
            Block block = (Block) obj;
            if (xPos + width >= block.getX() && xPos <= block.getX())
                return true;
		}
        return false;
	}

	
	public boolean didCollideTop(Object obj) {
		if (obj instanceof Block) {
            Block block = (Block) obj;
            if (yPos <= block.getY() + block.getHeight() && yPos >= block.getY())
                return true;
        }
		return false;
	}

	
	public boolean didCollideBottom(Object obj) {
		if (obj instanceof Block) {
            Block block = (Block) obj;
            if (yPos + height >= block.getY() && yPos <= block.getY())
                return true;
        }
		return false;
	}
}