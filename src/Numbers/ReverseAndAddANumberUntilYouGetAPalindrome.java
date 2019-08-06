package Numbers;

public class ReverseAndAddANumberUntilYouGetAPalindrome {

	public static void main(String[] args) {
		
		reverseNumber(7896);
		

	}
	
	static int reverseNumber(int inputNumber)
	{
		//Method To Reverse A Number
		
		int reverse=0;
		
		int rem=0;
		
		while(inputNumber!=0)
		{
			rem=inputNumber%10;
			
			reverse=(reverse*10)+rem;
			
			inputNumber=inputNumber/10;
		}
		
		return reverse;
	}
	
	//Method To Check For Palindrome
	
	static boolean checkPalindrome(int inputNumber)
	{
		int reverse=reverseNumber(inputNumber);
		if(reverse==inputNumber)
		{
		  return true;
		}
		else
		{
			return false;
		}
	}
	
	//Method To Reverse And Add Given Number Until You Get A Palindrome
	
	

}
