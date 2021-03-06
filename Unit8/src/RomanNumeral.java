//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
	}

	public void setNumber(Integer num)
	{
		number = num;
	}

	public void setRoman(String rom)
	{
		roman = rom;
	}

	public int getNumber()
	{
		number = 0;
		for(int j=0;j<roman.length();j++){
			for(int k=0;k<LETTERS.length;k++){
				if(LETTERS[k].length()==2&&j!=roman.length()-1){
					if(roman.substring(j,j+2).equals(LETTERS[k])){
						number+=NUMBERS[k];
						j++;
					}
				}
				if(LETTERS[k].length()==1){
					if(roman.substring(j,j+1).equals(LETTERS[k])){
						number+=NUMBERS[k];
					}
				}
			}
		}			
		return number;
	}

	public String toString()
	{
		roman = "";
		for(int i=0;i<NUMBERS.length;i++){
			if(number>=NUMBERS[i]){
				number = number-NUMBERS[i];
				roman+=LETTERS[i];
				i--;
			}
		}
		return roman + "\n";
	}
}