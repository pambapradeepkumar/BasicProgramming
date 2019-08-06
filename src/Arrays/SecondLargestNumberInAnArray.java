package Arrays;

public class SecondLargestNumberInAnArray {

	public static void main(String[] args) {
		
	  int arr[] = {12, 35, 1, 10, 35, 1};
	  int n = arr.length;
	  print2largest(arr,n);

	}
	
	public static void print2largest(int arr[], int arr_size)
	{
		int i,first,second;
		if(arr_size<2)
		{
			System.out.println("InvalidArray");
			return;
		}
		first = second = Integer.MIN_VALUE;
		for(i=0;i<arr_size;i++)
		{
			if(arr[i]>first)
			{
				/* If current element is smaller than  
	            first then update both first and second */
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!=first)
			{
				second=arr[i];
			}
		}
		
		if(second==Integer.MIN_VALUE)
		{
			System.out.println("There is no second largest element");
		}
		else
		{
			System.out.println("Second Largest number is  :"+second);
		}
	}

}
