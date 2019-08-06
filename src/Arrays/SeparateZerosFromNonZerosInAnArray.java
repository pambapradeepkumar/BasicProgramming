package Arrays;

import java.util.Arrays;

public class SeparateZerosFromNonZerosInAnArray {

	public static void main(String[] args) {
		
		ZerosAtLast(new int[] {1,3,4,0,5,0,5,7});
		
		ZerosAtLast(new int[] {1,-3,4,0,-5,0,5,7});
		
		ZerosAtLast(new int[] {-4, 1, 0, 0, 2, 21, 4});

	}
	
	static void ZerosAtLast(int[] inputArray)
	{
		//Initializing counter to 0
		
		int counter=0;
		
		//Traversing inputArray from left to right
		
		for(int i=0;i<inputArray.length;i++)
		{
			//If inputArray[i] is non-zero
			
			if(inputArray[i]!=0)
			{
				//Assigning inputArray[i] to inputArray[counter]
				
				inputArray[counter]=inputArray[i];
				
				//Incrementing the counter by 1
				
				counter++;
			}
		}
		//Assigning zero to remaining elements
		
		while(counter<inputArray.length)
		{
			inputArray[counter]=0;
			
			counter++;
		}
		
		System.out.println(Arrays.toString(inputArray));
	}

}
