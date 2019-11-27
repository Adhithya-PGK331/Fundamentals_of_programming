package Controlstructure;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int a=0;
		int b=1;
		System.out.println("ENTER THE 'n' VALUE");
		int n=s.nextInt();
		System.out.printf("%d%d",a,b);
		
		for (int i=0;i<n-2;i++)
		{
			int c=a+b;
			System.out.printf("%d",c);
			a=b;
			b=c;
		}
		s.close();}

}
