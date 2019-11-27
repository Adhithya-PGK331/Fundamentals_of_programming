package Decisionmaking;
import java.util.Scanner;
public class Elseif1st {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			System.out.println("Enter the mark :");
			
			int mark=s.nextInt();
			
			if(mark>=90){
				System.out.println("A+");
					  }
			
			else if(mark<90 && mark>=80)
			{
				System.out.println("A");
				}
			else if(mark<80 && mark>=70)
			{
				System.out.println("B");
				}
			else if(mark<70 && mark>=60)
			{
				System.out.println("C");
				}
			else if(mark<60 && mark>=50)
			{
				System.out.println("D");
				}
			else if(mark<50 && mark>=45)
			{
				System.out.println("PASSED");
				}
			else
			{
				System.out.println("FAILED");
				}
			s.close();
		}

	}
