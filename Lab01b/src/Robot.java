//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      //call head method
      
      head(window);
      upperBody(window);
      lowerBody(window);
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
	   SmileyFace s = new SmileyFace();
       s.smileyFace(window);
				
   }

   public void upperBody( Graphics window )
   {
	   window.setColor(Color.CYAN);
	   window.fillRect(50, 250, 300, 200);
	   window.setColor(Color.black);
	   window.fillRect(10, 250, 40, 30);
	   window.fillRect(350, 250, 40, 30);
   }

   public void lowerBody( Graphics window )
   {
	   window.setColor(Color.GRAY);
	   window.fillRect(30, 450, 340, 200);
	   window.setColor(Color.black);
	   window.fillRect(50, 650, 30, 40);
	   window.fillRect(320, 650, 30, 40);
   }
}