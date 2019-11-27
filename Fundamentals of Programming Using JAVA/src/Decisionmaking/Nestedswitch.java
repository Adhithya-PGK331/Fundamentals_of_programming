package Decisionmaking;
import java.util.Scanner;
public class Nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// C-CSE E-ECE M-MECH
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER YEAR AND BRANCH");
		int collegeyear=s.nextInt();
		
		switch(collegeyear)
		{
		case 1:
			System.out.println("ENGLISH, MATHS, PHYSICS");
			break;// END OF CASE 1
		case 2:
			char branch=s.next().charAt(0);
			switch(branch)
			{
			case 'C':
				System.out.println("OS, JAVA, DATASTRUCTURES");
				break;
			case 'E':
				System.out.println("MP, LOGIC SWITCHING THEORY");
				break;
			case 'M':
				System.out.println("DRAWING, MANUFACTURING MACHINES");
				break;
			default:
				System.out.println("ERROR:INVALID CREDENTIALS...!!");
				break;
			}
			break;//END OF CASE 2
		case 3:
			char brnch=s.next().charAt(0);
			switch(brnch)
			{
			case 'C':
				System.out.println("COA, MULTIMEDIA");
				break;
			case 'E':
				System.out.println("FUNDAMENTALS OF LOGIC DESIGN, MICRO ELECTRONICS");
				break;
			case 'M':
				System.out.println("INTERNAL COMBUSTION ENGINES, MECHANICAL VIBRATION");
				break;
			default:
				System.out.println("ERROR:INVALID CREDENTIALS...!!");
				break;
			}
			break;// END OF CASE 3
		case 4:
			char b=s.next().charAt(0);
			switch(b)
			{
			case 'C':
				System.out.println("DATA COMMUNICATION, COMPUTER NETWORKS");
				break;
			case 'E':
				System.out.println("EMBEDDED SYSTEMS, IMAGE PROCESSING");
				break;
			case 'M':
				System.out.println("THERMAL ENGINES, PRODUCTION TECHNOLOGY");
				break;
			default:
				System.out.println("ERROR:INVALID CREDENTIALS...!!");
				break;
			}// END OF CASE 4
			break;
		}
		s.close();
	}

}
