package Strings;

import java.util.Scanner;

public class ReverseStringWithoutUsingMethods 
{

	public static void main(String[] args) 
	{
		String original,reverse="";
		System.out.println("Please enter the string to reverse \n");
	  Scanner sc=new Scanner(System.in);
	  original=sc.nextLine();
	  for(int i=original.length()-1;i>=0;i--)
	  {
		  reverse=reverse+original.charAt(i);
	  }
	  System.out.println(reverse);
	}

}
