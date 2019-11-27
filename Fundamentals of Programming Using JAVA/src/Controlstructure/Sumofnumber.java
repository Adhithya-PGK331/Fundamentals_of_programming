package Controlstructure;
import java.util.Scanner;
public class Sumofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of digits, first and last numbers");
		
		int n=s.nextInt();
		int f=s.nextInt();
		int l=s.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
		sum=((f+l)*n)/2;
		
		}
		System.out.println(sum);
		s.close();}

}
