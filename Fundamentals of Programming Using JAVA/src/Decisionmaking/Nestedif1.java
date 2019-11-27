package Decisionmaking;
import java.util.Scanner;
public class Nestedif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the laptop name :");
		String ACER=s.nextLine();
		int ram=s.nextInt();
		int HDD=s.nextInt();
		if (ACER==ACER)
		{
			if (ram==16) {
				if (HDD==2) {
						System.out.println("PRODUCT AVAILABLE");
							}
				else {
						System.out.println("THIS HARD DISK SIZE IS NOT AVAILABLE");
					 }
				
						 }//CLOSED RAM IF
			
			else {
				
				System.out.println("THIS RAM SIZE  NOT AVAILABLE");
			}//CLOSED RAM ELSE
			
		}
		else {
			System.out.println("PRODUCT NOT AVAILABLE");
			 }//CLOSED MAIN IF
		s.close();
	}

}
