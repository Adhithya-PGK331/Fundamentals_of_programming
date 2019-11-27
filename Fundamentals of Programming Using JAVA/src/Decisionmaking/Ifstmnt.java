package Decisionmaking;
import java.util.Scanner;
public class Ifstmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age :");
		int personage=s.nextInt();
		
		if (personage>=18)
		{
			System.out.println("The person is eligible for voting");
			
		}s.close();
	}

}
