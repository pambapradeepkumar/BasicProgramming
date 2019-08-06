package Strings;

public class ReverseEachWordOfAString {

	public static void main(String[] args) {
		ReverseString("my name is pradeep");

	}
	
	static void ReverseString(String sentance)
	{
		String[] words = sentance.split(" ");
		String reverseString="";
		
		for(int i=0;i<words.length;i++)
		{
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}
			
			reverseString = reverseString + reverseWord + " ";
		}
		
		System.out.println(sentance);
        
        System.out.println(reverseString);
	}

}
