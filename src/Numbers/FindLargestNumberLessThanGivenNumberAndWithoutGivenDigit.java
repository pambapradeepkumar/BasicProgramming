package Numbers;

public class FindLargestNumberLessThanGivenNumberAndWithoutGivenDigit {

	public static void main(String[] args) {
		System.out.println(FindNumber(119,9));
		

	}
	
	static int FindNumber(int number,int digit)
	{
		//Converting digit to char
		
		char c = Integer.toString(digit).charAt(0);
		
		//Decrementing number & checking whether it contains digi
		
		for(int i=number;i>0;i--)
		{
			int value = Integer.toString(i).indexOf(c);
			if(Integer.toString(i).indexOf(c)==-1)
			{
				//If 'i' doesn't contain 'c'
				
				return i;
			}
		}
		
		return -1;
		
	}

}
