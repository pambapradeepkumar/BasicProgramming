package ArraysTechieDelight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindLongestSubArrayFormedByConsecutiveIntegers {

	public static void main(String[] args) {
		int[] A= {2, 0,5, 2, 1, 4, 3, 1, 0 };
		
		
		findMaxSubArray(A);

	}
	
	
	public static void findMaxSubArray(int[] A)
	{
		Set<Integer> s=new HashSet<Integer>();
		ArrayList<Integer> ars=new ArrayList<Integer>();
		int max=-1;
		ArrayList<Integer> ans=new ArrayList<Integer>();
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(s.add(A[j]))
				{
					ars.add(A[j]);
				}
				else
				{
				   ArrayList<Integer> temp = ars;
				   Collections.sort(ars);
				   Boolean t = true;
				   for(int k=0;k<ars.size();k++)
				   {
					   if(k+1<ars.size())
					   {
						   if(ars.get(k+1)-ars.get(k)!=1)
						   {
							   t = false;
							   break;
						   } 
					   }
				   }
				   if(t) {
					   if(ars.size()>max) {
						   max = ars.size();
						   ans = temp;
					   }
				   }
				}
				
				

			}
			s = new HashSet<Integer>();
			ars = new ArrayList<>();
		}
		
		ans.forEach(e->System.out.println(e));
		
	}
	
	

}
