package Arrays;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesInAnArray {
	
	public static void main(String[] args)
	{
		int[] inputArray = new int[] {111, 333, 555, 777, 333 , 777 , 777 ,7777 };
		findDuplicatesUsingHashMap(inputArray);
	}

	private static void findDuplicatesUsingHashMap(int[] inputArray) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
        
	    for(int element : inputArray)
	    {
	    	if(map.get(element) == null)
	    	{
	    		map.put(element, 1);
	    	}
	    	else
	    	{
	    		map.put(element, map.get(element)+1);
	    	}
	    }
	    
	    Set<Entry<Integer, Integer>> entry = map.entrySet();
	    for(Entry<Integer, Integer> e:entry)
	    {
	    	if(e.getValue()>1)
	    	{
	    		System.out.println(e.getKey() + " :Id duplicate " + e.getValue() + " :times");
	    	}
	    }

	}

  }

	
	
	
