//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private int timer;
	

	private AlienHorde horde;
	private Bullets shots;	
	private Splitters splitters;
	private boolean[] keys;
	private BufferedImage back;
	private int count;
	
	public OuterSpace()
	{
		timer = 0;
		setBackground(Color.black);

		keys = new boolean[5];
		ship = new Ship(350, 450, 10);
		horde = new AlienHorde(48);
		shots = new Bullets();
		shots.add(new Ammo(-10,-10,0));
		splitters = new Splitters();
		count = 0;

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
//		Graphics2D twoDGraph = (Graphics2D) window;
		ship.draw(window);
		splitters.cleanEmUp(window);
		splitters.moveEmAll();
		splitters.drawEmAll(window);
		shots.cleanEmUp(window);
		shots.moveEmAll();
		shots.drawEmAll(window);
		timer++;
		count = horde.getKills();
		horde.moveEmAll();
		horde.drawEmAll(window);
		horde.removeDeadOnes(shots.getList());
		horde.removeDeadOnes1(splitters.getList());
		if(back==null){
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		}
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);

		
		if(keys[0] == true)
		{
			if(ship.getX()>10)ship.move("LEFT");
		}
		
		if(keys[1] == true)
		{
			if(ship.getX()<700)ship.move("RIGHT");
		}
		
		if(keys[2] == true)
		{
			if(ship.getY()>10)ship.move("UP");
		}
		
		if(keys[3] == true)
		{
			if(ship.getY()<500)ship.move("DOWN");
		}
		
		if(keys[4] == true && timer>50)
		{
			timer = 0;
			if(horde.getKills()==5){
				splitters.add(new Splitter(ship.getX()+40, ship.getY(),-1));
				horde.setKills(0);
			}
			else shots.add(new Ammo(ship.getX()+40, ship.getY(),-1));
		}
		graphToBack.setColor(Color.WHITE);
		graphToBack.setFont(new Font("ComicSans", Font.PLAIN, 14));
		graphToBack.drawString("Kills until Splitter:"+(5-count), 10, 10);
//		twoDGraph.drawImage(back,null,0,0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{

	}

public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}