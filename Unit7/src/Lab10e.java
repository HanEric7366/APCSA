//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		while(true){
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter your difficulty!");
		GuessingGame g = new GuessingGame(keyboard.nextInt());
		g.playGame();
		char response = keyboard.next().charAt(0);
		out.println("Would you like to keep playing? y or n");
		if(response=='n') break;
		}
	}
}