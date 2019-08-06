package Strings;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str="pradeep";
		HashMap<Character, Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(hm.get(c)!=null)
			{
				hm.put(c, hm.get(c)+1);
			}
			else 
			{
				hm.put(c, 1);
			}
		}
		Iterator<Character> tempChar = hm.keySet().iterator();
		while(tempChar.hasNext())
		{
			char temp=tempChar.next();
			if(hm.get(temp)>1)
			{
				System.out.println(temp+" is "+hm.get(temp)+" times ");
			}
		}
	}
}
