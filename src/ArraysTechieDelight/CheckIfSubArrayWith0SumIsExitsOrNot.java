package ArraysTechieDelight;

public class CheckIfSubArrayWith0SumIsExitsOrNot {

	public static void main(String[] args) {
		int[] A= {4,-6,3,-1,4,2,7};
		
		if (zeroSumSubarray(A)) {
			System.out.println("Subarray exists");
		} else {
			System.out.println("Subarray do not exist");
		}

	}
	
	public static boolean zeroSumSubarray(int[] A)
	{
		
		int B=0;
		int sum=0;
		for(int i=0;i<A.length-1;i++)
		{
			sum +=A[i];
			
			if(sum==B)
			{
				return true;
			}
		}
		return false;
	}

}
