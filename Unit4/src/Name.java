//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	private String [] ar;
	private int i;
	
	public Name()
	{

	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   name = s;
   }

	public String getFirst()
	{
		//ar = name.split(" ");
		//return ar[0];
		i = 0;
		while(i<name.length()){
			if(name.charAt(i)==' ')
				break;
			else i++;
		}
		return name.substring(0,i);
	}

	public String getLast()
	{
		//ar = name.split(" ");
		//return ar[1];
		i = 0;
		while(i<name.length()){
			if(name.charAt(i)==' ')
				break;
			else i++;
		}
		return name.substring(i+1);
	}

 	public String toString()
 	{
 		return name;
	}
}