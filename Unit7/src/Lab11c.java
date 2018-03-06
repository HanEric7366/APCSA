//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.lang.System.*;
import java.util.Scanner;
public class Lab11c
{
   public static void main( String args[] )
    {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter a letter!");
	   String lettertbp = s.next();
	   System.out.println("Enter a number!");
	   int sizetbp = s.nextInt();
	   TriangleThree tri = new TriangleThree(sizetbp,lettertbp);
	   System.out.println(tri);
	}
}