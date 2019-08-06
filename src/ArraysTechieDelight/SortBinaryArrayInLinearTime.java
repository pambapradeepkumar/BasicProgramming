package ArraysTechieDelight;

public class SortBinaryArrayInLinearTime {

	public static void main(String[] args) {
		int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
		
		sort(A);
		
		for(int a:A)
		{
			System.out.println(a);
		}

	}
	
	public static void sort(int A[])
	{
		
		int a=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==0)
			{
				A[a++] = 0;
			}
		}
		
		for(int l=a;l<A.length;l++)
		{
			A[l]=1;
		}
		
	}

}
