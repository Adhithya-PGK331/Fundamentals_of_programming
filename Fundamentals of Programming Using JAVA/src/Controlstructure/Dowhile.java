package Controlstructure;
import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		int r;
		int sum=0;
		System.out.println("ENTER THE NUMBER TO CHECK");
		int a=s.nextInt();
		do
		{
		r=a%10;
		sum=(sum*10)+r;
		a=a/10;
		
		}while(a!=0);
		
		System.out.println(sum);
	
		s.close();
}
}