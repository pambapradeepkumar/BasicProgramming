package Marics_Programs;

import java.util.Scanner;

public class CreationOfMatrics {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Number Of Rows");
		
		int row=sc.nextInt();
		
		System.out.println("Enter The Number Of Columns");
		
		int column=sc.nextInt();
		
		//defining 2D array to hold matrix data
		
		int[][] matrix =new int[row][column];
		
		System.out.println("Enter Matrix Data");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(matrix[i][j]+"\t");
			}
			
			System.out.println();
		}
		
	}

}
