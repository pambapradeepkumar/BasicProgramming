package ArraysTechieDelight;

public class FindPairsWithGivenSumINAnArray {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,8,2,4,5};
		
		int sum=10;
		
		findPair(a,sum);

	}
	
	public static void findPair(int[] a,int sum)
	{
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
				{
					System.out.println("pair found at index :"+i+" and "+j);
					
				}
			}
		}
		
	}

}
