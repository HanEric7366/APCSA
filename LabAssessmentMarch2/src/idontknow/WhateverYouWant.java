package idontknow;
import java.util.Arrays;
// "Name it whatever you want." -Mr. Mauro
public class WhateverYouWant {
	
	//I apologize in advance for my horrible variable names and messy work. Sorry!
	
	public static void main(String[] args){
		System.out.println("Hello Wordl!");
		System.out.println(isGoofy(17));
		System.out.println(Arrays.toString(getSomeGoofyNumbers(15)));
	}
	
	public static boolean isGoofy(int num)
	{
		int toyNum=num;
		int numberLength = getNumberLength(num);
		int oddEven=0;
		for(int i=0;i<numberLength;i++){
			int a = lastDigit(toyNum);
			if(a!=0){
				if(num%a==0){
					oddEven+=a;
				}
			}
			toyNum = eliminateLast(toyNum);
		}
		return (oddEven%2==1);
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int[] hyukHyuk = new int[count];
		for(int r=0;r<count;r++){
			if(r==0){
				hyukHyuk[r]=1;
			}
			if(r>=1){
				for(int i=hyukHyuk[r-1]+1;true;i++){
					if(isGoofy(i)==true){
						hyukHyuk[r] = i;
						break;
					}
				}
			}
			
		}
		return hyukHyuk;
	}
	
	
	public static int getNumberLength(int b){
		int numleng = 0;
		int tenpower = 1;
		for(int i=0;true;i++){
			for(int j=0;j<i;j++){
				tenpower = tenpower*10;
			}
			if(b>tenpower){
				numleng++;
			}
			else{
				break;
			}
		}
		return numleng;
	}
	
	/*public static int powerTen(int d){
		int tens = 1;
		for(int wow=0;wow<d;wow++){
			tens=tens*10;
		}
		return tens;
	}
	*/
	
	public static int lastDigit(int e){
		int target = e%10;
		return target;
	}
	
	public static int eliminateLast(int g){
		int oops = g;
		int aiya = g%10;
		oops -= aiya;
		oops = oops/10;
		return oops;
	}
}
