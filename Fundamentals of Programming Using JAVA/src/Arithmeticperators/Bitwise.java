package Arithmeticperators;
import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number a:");
		int a=s.nextInt();
		System.out.println("Enter the number b:");
		int b=s.nextInt();
		int c=a&b;
		System.out.println(c);
	}

}
