import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Splitters {
	private List<Splitter> ammo;

	public Splitters()
	{
		ammo = new ArrayList<Splitter>();
	}

	public void add(Splitter al)
	{
		ammo.add(al);
	}
	
	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i < ammo.size(); i++){
			window.setColor(Color.RED);
			window.fillRect(ammo.get(i).getX(), ammo.get(i).getY(), 5, 5);
		}
	}

	public void moveEmAll()
	{
		int b=0;
		for(int i = 0; i < ammo.size(); i++){
			if(i%2==0){
				ammo.get(i).setX(ammo.get(i).getX()+ammo.get(i).getSpeed());
				ammo.get(i).setY(ammo.get(i).getY()-ammo.get(i).getSpeed());
				if(b<10&&ammo.size()<10){b++; add(new Splitter (ammo.get(i).getX(),ammo.get(i).getY()));}
			}
			if(i%2==1) {
				ammo.get(i).setY(ammo.get(i).getY()-ammo.get(i).getSpeed());
				ammo.get(i).setX(ammo.get(i).getX()-ammo.get(i).getSpeed());
			}

		}
		
	}

	public void cleanEmUp(Graphics window)
	{
		for(int i = 0; i < ammo.size(); i++){
			if(ammo.get(i).getY()<10){
				ammo.get(i).setSpeed(0);
			}
			window.setColor(Color.black);
			window.fillRect(ammo.get(i).getX(), ammo.get(i).getY(), 5, 7);
			if(ammo.get(i).getSpeed()==0){
				window.setColor(Color.black);
				window.fillRect(ammo.get(i).getX(), ammo.get(i).getY(), 5, 7);
				ammo.remove(i);
			}
		}
		
	}

	public List<Splitter> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}

}
