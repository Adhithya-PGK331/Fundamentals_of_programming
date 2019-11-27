package Arithmeticperators;

import java.util.Scanner;

public class Simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner s=new Scanner(System.in);
		System.out.println("amount=");
		int p=s.nextInt();
		System.out.println("period=");
		int n=s.nextInt();
		System.out.println("rate=");
		float r=s.nextFloat();
		float interest=p*n*r/100;
		System.out.printf("%.2f",interest);
		
	}

}
