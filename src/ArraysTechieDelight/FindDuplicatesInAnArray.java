package ArraysTechieDelight;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicatesInAnArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,4};
		
		findDuplicates(array);

	}
	
	public static void findDuplicates(int array[])
	{
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int element :array)
		{
			if(map.get(element)==null)
			{
				map.put(element, 1);
			}
			else
			{
				map.put(element, map.get(element)+1);
			}
		}
		
		Set<Entry<Integer, Integer>> list = map.entrySet();
		for(Entry<Integer, Integer> e:list)
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey() + " :Id duplicate " + e.getValue() + " :times");
			}
		}
	}

}
