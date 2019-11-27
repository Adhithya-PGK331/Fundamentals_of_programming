package Decisionmaking;
import java.util.Scanner;
public class Ifelse3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value :");
		
		int marks=s.nextInt();
		
		if(marks>=45){
			System.out.println("The student passed");
				  }
		
		else {
			System.out.println("The student failed");
			}
		s.close();
	}

}
