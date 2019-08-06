package Arrays;

import java.util.Arrays;

public class findAllTheLeadersInAnIntegerArray {

	public static void main(String[] args) {
		
		findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3});

	}
	
	static void findTheLeaders(int inputArray[])
	{
		//Getting the length of input array
		int inputArrayLength=inputArray.length;
		
		//Assuming the last element as max
		
		int max = inputArray[inputArrayLength-1];
		
		System.out.println("The leaders in "+Arrays.toString(inputArray)+" are : ");
		 
        //Printing the last element as it is always a leader
		
		System.out.println(inputArray[inputArrayLength-1]);
		
		//Traversing the remaining elements from right to left
		
		for(int i=inputArray.length-2;i>=0;i--)
		{
			//If the element is greater than max
			if(inputArray[i]>max)
			{
				//Printing the element
				System.out.println(inputArray[i]);
				
				//updating the max
				
				max=inputArray[i];
			}
		}
	}

}
