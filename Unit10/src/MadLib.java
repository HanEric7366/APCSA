//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.util.Random;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String result;
	
	Random r = new Random();
	
	public MadLib()
	{
        verbs = new ArrayList<String>();
        nouns = new ArrayList<String>();
        adjectives = new ArrayList<String>();
        result = "";
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
            while(file.hasNextLine()){
                result = file.nextLine();
            }
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("H:\\APCSA\\Unit10\\src\\nouns.dat"));
            while(file.hasNextLine()){
                nouns.add(file.nextLine());
            }
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem2!");
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("H:\\APCSA\\Unit10\\src\\verbs.dat"));
            while(file.hasNextLine()){
                verbs.add(file.nextLine());
            }
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!3");
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("H:\\APCSA\\Unit10\\src\\adjectives.dat"));
            while(file.hasNextLine()){
                adjectives.add(file.nextLine());	
            }
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!4");
		}
	}

	public String getRandomVerb()
	{
	
		return verbs.get(r.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		return nouns.get(r.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		return adjectives.get(r.nextInt(adjectives.size()));
	}		

	public String toString()
	{
        //String s = result;
        for(int i = 0; i<result.length(); i++){                 
            if(result.charAt(i) == '#'){        
                String n = getRandomNoun();
                result = result.substring(0, i) + n + result.substring(i+1);
            }      
            else if(result.charAt(i) == '@'){           
                String n = getRandomVerb();
                result = result.substring(0, i) + n + result.substring(i+1);
            }      
            else if(result.charAt(i) == '&'){       
                String n = getRandomAdjective();
                result = result.substring(0, i) + n + result.substring(i+1);
            }
        }
        return result;

	}
}