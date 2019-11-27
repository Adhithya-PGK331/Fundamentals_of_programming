package Controlstructure;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("PROGRAM FOR FACTORIAL: \n");
		int f=1;
		System.out.println("ENTER THE 'n' VALUE");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			f=f*i;
			
		}
		System.out.println(f); 
		s.close();	
	}

}
