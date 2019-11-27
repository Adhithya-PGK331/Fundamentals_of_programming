package Decisionmaking;

import java.util.Scanner;

public class Largeof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values for A, B and C in correct order :");
		
		int A=s.nextInt();
		int B=s.nextInt();
		int C=s.nextInt();
		
		if(A>B && A>C){
			System.out.println("A IS LARGE");
				  }
		
		else if(B>A && B>C)
		{
			System.out.println("B IS LARGE");
			}
		else if(C>A && C>B)
		{
			System.out.println("C IS LARGE");
			}
		
		else		{
			System.out.println("ERROR");
			}
		s.close();
}
	

}
