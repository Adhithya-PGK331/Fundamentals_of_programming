package Arithmeticperators;

import java.util.Scanner;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		int d;
		int e;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n=s.nextInt();
		
		a=n%10;
		b=n/10;
		c=a-b;
		d=a*b;
		e=c*b;
		System.out.println(c+""+d);
		System.out.println(e+""+a);
		
		
	}

}
