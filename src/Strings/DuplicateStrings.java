package Strings;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateStrings 
{

	public static void main(String[] args) 
	{
		String str="i am am learning java java";
		String[] s = str.split(" ");
		
		HashMap<String, Integer> hm=new HashMap<String,Integer>();
		for(String tempString: s)
		{
			if(hm.get(tempString)!=null)
			{
				hm.put(tempString, hm.get(tempString)+1);
			}
			else
			{
				hm.put(tempString, 1);
			}
		}
		Iterator<String> tempString = hm.keySet().iterator();
		while(tempString.hasNext())
		{
			String temp=tempString.next();
			if(hm.get(temp)>1)
			{
				System.out.println(temp+" is "+hm.get(temp)+" times ");
			}
		}
	}
}
