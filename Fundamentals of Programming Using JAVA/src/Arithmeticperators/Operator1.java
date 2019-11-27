package Arithmeticperators;
import java.util.Scanner;
public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=s.nextInt();
		int b;
		int c;
		int d;
		int e;
		
		b=a%10;
		c=a/10;
		d=b*c;
		e=c*c;
		System.out.println("The output is as follows : ");
		System.out.println(d+""+e);
	}

}
