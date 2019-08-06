package ArraysTechieDelight;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int length1 = s.nextInt();                 
        for(int i=0;i<length1;i++)
        {
             
            int arr[]=new int[length1];
            
            
            for(int j=0;j<arr.length;j++)
            {
                arr[j]=s.nextInt();
            }
            
            for(int k=arr.length-1;k>0;k--)
            {
                System.out.println(arr[k]);
            }
            
            
        }
	}

}
