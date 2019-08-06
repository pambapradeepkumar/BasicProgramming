package Strings;

import java.util.HashMap;

public class EachCharCountInString {

	public static void main(String[] args) {
		
		CharacterCount("pradeep kumar pamba");
		

	}
	
	public static void CharacterCount(String InputString)
	{
		//Creating a HashMap containing char as a key and occurrences as  a value
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		//Converting given string to char array
		
		char[] strArray=InputString.toCharArray();
		
		//checking each char of strArray
		
		for(char c : strArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
				
			}
			else
			{
				//If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
				
				charCountMap.put(c, 1);
			}
		}
		
		//Printing the charCountMap
		 
        System.out.println(charCountMap);
	}

}
