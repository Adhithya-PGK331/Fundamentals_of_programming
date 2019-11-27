package Controlstructure;

import java.util.Scanner;

public class Checkfibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER TO CHECK");
			int n=s.nextInt();
			//System.out.printf("%d%d",a,b);
			int a=0;
			int b=1;
			int d=0;
			for (int i=0;i<n;i++)
			{
				int c=a+b;
				if(c==n)
				{
					d++;
				}
				a=b;
				b=c;
			}
			if(d!=0)
			{
				System.out.printf("fib");
			}
			else
				{
				System.out.printf("not fib");
				}
			s.close();	}
						}
							