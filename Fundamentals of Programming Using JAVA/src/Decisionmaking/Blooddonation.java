package Decisionmaking;
import java.util.Scanner;
public class Blooddonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Please enter if you are healthy or not by providing 1-healthy and 0-not healthy and your weight and the number of times you had donated blood in correct order");
		
		int Healthy=s.nextInt();
		int wt=s.nextInt();
		int d=s.nextInt();
		
		
	
		if (Healthy==1)
		{
			if (wt>=45) {
				if (d<3) {
						System.out.println("DONATION POSSIBLE");
							}
				else {
						System.out.println("DONATIONS FOR THIS YEAR IS OVER");
					 }
				
						 }//CLOSED WEIGHT IF
			
			else {
				
				System.out.println("UNDER WEIGHT");
			}//CLOSED WEIGHT ELSE
			
		}
		else {
			System.out.println("SORRY YOU ARE UNHEALTHY");
			 }//CLOSED MAIN IF
		s.close();
	}

}
