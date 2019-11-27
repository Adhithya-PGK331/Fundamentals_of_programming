package Arithmeticperators;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int t;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the n value");
	int n=s.nextInt();
	System.out.println("Enter the m value");
	int m=s.nextInt();
	t=n;
	n=m;
	m=t;
	System.out.println("The n and m values after swapping  respectively are as follows: ");
	System.out.println(n);
	System.out.println(m);
	
	
	}

}
