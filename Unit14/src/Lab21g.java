//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		AtCounter a = new AtCounter();
		a.countAts(0, 0);
		System.out.println(a);
		a.countAts(2, 5);
		System.out.println(a);
		a.countAts(5, 0);
		System.out.println(a);
		a.countAts(9, 9);
		System.out.println(a);
		a.countAts(3, 9);
		System.out.println(a);
	}
}