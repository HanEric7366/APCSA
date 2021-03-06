//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		/*int size = 0;
		int track = 0;
		for(int i=0;i<sentence.length();i++)
			if(sentence.charAt(i)==' '){
				wordRay[size] = sentence.substring(track, i);
				track = i+1;
		}*/
		int i =0;
		Scanner s = new Scanner(sentence);
		Scanner sc = new Scanner(sentence);
		while(s.hasNext()){
			i++;
			s.next();
		}
		wordRay = new String[i];
		for(int j =0; j<i; j++){
			wordRay[j] = sc.next();
		}
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for(String a:wordRay){
			if(a.length()>max) max = a.length();
		}
		for(String a:wordRay){
			addSpace(a,max);
		}
		for(int i=0;i<max;i++){
			for(String a:wordRay){
				output+=a.charAt(i);
			}
		}
		return output+"\n\n";
	}
	
	public String addSpace(String s, int q){
		int h = q-s.length();
		for(int i=0;i<h;i++){
			s=s+" ";
		}
		return s;
	}
}