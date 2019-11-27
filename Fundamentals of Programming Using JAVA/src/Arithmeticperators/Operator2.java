package Arithmeticperators;

import java.util.Scanner;

public class Operator2 {

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
		b=a*a;
		c=n/100;
		d=c*a;
		e=b*d;
		System.out.println(b+""+d);
		System.out.println(e);
	}

}
