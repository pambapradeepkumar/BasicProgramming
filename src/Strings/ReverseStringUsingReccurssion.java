package Strings;

public class ReverseStringUsingReccurssion 
{

	public static void main(String[] args) 
	{
		String str="java";
		System.out.println("out put is "+reverseString(str));

	}
	public static String reverseString(String s)
	{
		if(s.length()==0)
		{
		return s;
		}
		
		 
		return reverseString(s.substring(1))+s.charAt(0);
	}

}
