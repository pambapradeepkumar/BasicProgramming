package Strings;

public class OneStringIsRotationOfAnotherString {

	public static void main(String[] args) {
		
		String s1 = "pambapradeepkumar";
		 
        String s2 = "pambapradeepkumar";
        
        //step 1
        if(s1.length()!=s2.length())
        {
        	System.out.println("s2 is not rotated version of s1");
        }
        else
        {
        	//step 2
        	String s3=s1+s1;
        	
        	if(s3.contains(s2))
        	{
        		System.out.println("s2 is a rotated version of s1");
        	}
        	else
        	{
        		System.out.println("s2 is not rotated version of s1");
        	}
        }

	}

}
