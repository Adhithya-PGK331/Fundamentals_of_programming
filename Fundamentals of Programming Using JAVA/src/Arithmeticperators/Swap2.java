package Arithmeticperators;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=s.nextInt();
		System.out.println("Enter the m value");
		int m=s.nextInt();
		n=n+m;
		m=n-m;
		n=n-m;
	
		System.out.println("The n and m values after swapping  respectively are as follows: ");
		System.out.println(n);
		System.out.println(m);
	}

}
