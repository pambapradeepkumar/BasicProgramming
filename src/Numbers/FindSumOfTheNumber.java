package Numbers;

public class FindSumOfTheNumber {

	public static void main(String[] args) {
		
		sumOfAllDigits(456);
		sumOfAllDigits(111);
		sumOfAllDigits(222);
		sumOfAllDigits(333);
		sumOfAllDigits(4444);

	}
	
	static void sumOfAllDigits(int inputNumber)
	{
		int copyOfNumber=inputNumber;
		int sum=0;
		while(copyOfNumber !=0)
		{
		
		   //Finding the last digit
		
		    int lastDigit=copyOfNumber%10;
		  
		    sum=sum+lastDigit;
		  
		   //removing last digit from the Number
		  
		   copyOfNumber=copyOfNumber/10;
		}
		
		//printing the Number 
		
		System.out.println("Sum of all digits in the Number is : " + sum);
	}

}
