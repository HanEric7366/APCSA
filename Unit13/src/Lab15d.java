//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		FancyWords f = new FancyWords("");
		Scanner file = new Scanner(new File("H:\\APCSA\\Unit13\\src\\lab15d.dat"));
		int i = Integer.parseInt(file.nextLine());
		for(int j = 0; j<i;j++){
			f.setWords(file.nextLine());
			System.out.println(f);
		}
	}
}