package Strings;

import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {
		boolean result=CheckForUnique("pra");
		System.out.println(result);
			
	}
	public static boolean CheckForUnique(String str)
	{
		boolean isUnique=false;
		for(char c:str.toCharArray())
		{
			System.out.println("last index of string "+c+" is "+str.lastIndexOf(c));
			if(str.indexOf(c)==str.lastIndexOf(c))
			{
				isUnique=true;
			}
			else
			{
				isUnique=false;
			}
		}
		return isUnique;
	}

}
