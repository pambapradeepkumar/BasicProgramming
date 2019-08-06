package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class CountOccurrencesOfEachElementInAnArray {

	public static void main(String[] args) {
		elementsInArrayDuplicates(new int[] {1,2,3,4,5,6,1,2,3,4});

	}
	
	static void elementsInArrayDuplicates(int[] arrayElemets)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		
		for(int i : arrayElemets)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			
			else
			{
				map.put(i, 1);
			}
		}
		
		System.out.println("Input Array : "+Arrays.toString(arrayElemets));
		
		System.out.println("Element Count : "+map);
	}

}
