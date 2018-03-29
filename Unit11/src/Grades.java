//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private double[] grades;
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		setGrades(gradeList);		
	}
	
	public void setGrades(String gradeList)
	{
		Scanner sc = new Scanner(gradeList);
		if(sc.hasNextInt()){
			grades = new double[sc.nextInt()];
		}
		else{
			grades = new double[0];
		}
		sc.next();
		for(int i=0;sc.hasNext();i++){
			//grades[i]=sc.nextDouble();
			setGrade(i,sc.nextDouble());
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades[spot]=grade;
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(int i=0;i<grades.length;i++){
			sum+=grades[i];
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(int i=0;i<grades.length;i++){
			if(grades[i]<low){
				low = grades[i];
			}
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(int i=0;i<grades.length;i++){
			if(grades[i]>high){
				high = grades[i];
			}
		}
		return high;
	}
	
	public int getNumGrades()
	{
		return grades.length;
	}
	
	public String toString()
	{
		String output="";
		for(int i=0;i<grades.length;i++){
			output+=grades[i]+" ";
		}
		/*
		output+="\nsum = "+getSum()+"\nnum grades = "+getNumGrades()+"\nlow grade = "+getLowGrade()+"\nhigh grade"+getHighGrade();
		*/
		return output;
	}	
}