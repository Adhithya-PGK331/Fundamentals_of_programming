package Decisionmaking;

import java.util.Scanner;

public class Ifelse1st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age :");
		int personage=s.nextInt();
		
		if (personage>=18)
		{
			System.out.println("The person is eligible for voting");
			
		}
		else
		{
			System.out.println("The person is not eligible for voting");
		}s.close();
	}

}
