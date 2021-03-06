//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{
		setString(s);
	}

   public void setString(String s)
   {
   	word=s;
   }

	public boolean findLetter(char c)
	{
		if(word.indexOf((int)c)>=0) return true;
		return false;
	}

	public boolean findSubString(String s)
	{
		int rip = s.length();
		int counter = 0;
		while(counter<(word.length()-rip-1)){
			if(word.substring(counter, counter+rip).equals(s))
				return true;
			counter++;
		}
		return false;
	}

 	public String toString()
 	{
 		return "\n\n";
	}
}