package Arrays;

import java.util.Scanner;

public class Matrix_sum_except_diagonal_and_larger_number {

	  public static void main(String [] args)
	  {
	    //Type your code here
		  Scanner s=new Scanner(System.in);
		  int m=s.nextInt();
		  int n=s.nextInt();
		  int a[][]=new int [m][n];int sum=0;
		  for(int i=0;i<m;i++)
		  {
		  for(int j=0;j<n;j++)
		  {
		  a[i][j]=s.nextInt();
		  }
		  }int max=0;
		  for(int i=0;i<m;i++)
		  {
		  for(int j=0;j<n;j++)
		  {
			  if(a[i][j]>max)
			  {
			  max=a[i][j];}
		  if((i!=j) && (j!=m-i-1)) 
		  {
		  sum=sum+a[i][j];}
		  }
		  }
		  
		  
		  System.out.println("\"Sum of all the elements in the matrix\"");
		 System.out.println(sum);
			System.out.println("\"Largest number in the matrix\"");	
							 System.out.println(max);
		  
	  }
	}