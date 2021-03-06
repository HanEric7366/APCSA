//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.setColor(Color.YELLOW);
      window.fillOval(100, 50, 200, 200);
  
		//add more code here
      window.setColor(Color.RED);
      window.drawArc(125, 175, 150, 50, -15, -150); //smile
      
      window.setColor(Color.black);
      window.fillOval(150, 100, 25, 40);
      window.fillOval(250, 100, 25, 40); //eyes
      
      window.setColor(Color.MAGENTA);
      window.fillOval(200, 150, 15, 10); //nose
   }
}