package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String str="pradeep";
		char[] chars = str.toCharArray();
		//Set<Character> charSet=new HashSet<Character>();
		
		ArrayList<Character> charSet=new ArrayList<Character>();
		
		for(char ch:chars)
		{
			if(!charSet.contains(ch))//if we use array list
			{
			charSet.add(ch);
			}
		}
		
		StringBuffer sb=new StringBuffer();
		for(char c:charSet)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
	}

}
