package Marics_Programs;

import java.util.Scanner;

public class SubTractionOfTwoMatrix {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of row count");
		
		int row = sc.nextInt();
		
		System.out.println("Enter number of Column count");
		
		int column = sc.nextInt();
		
		int[][] matrix1=new int[row][column];
		int[][] matrix2=new int[row][column];
		int[][] subtraction=new int[row][column];
		
		System.out.println("Enter Your First matrix");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		
        System.out.println("Enter Your Second matrix");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		
       System.out.println("this is your First matrix");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(matrix1[i][j]+"\t");
			}
			
			System.out.println();
		}
		
        System.out.println("this is your Second matrix");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println(matrix2[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		System.out.println("Sum of Two matrixs");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				subtraction[i][j]=matrix1[i][j]-matrix2[i][j];
				
				System.out.print(subtraction[i][j]+"\t");
			}
			
			System.out.println();
		}
		
	}
	

}
