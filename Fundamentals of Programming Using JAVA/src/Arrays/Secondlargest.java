package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Secondlargest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[]a=new int[6];
		int i;
		for (i=0;i<6;i++)
		{
			System.out.println("ENTER THE INDEX NUMBERS["+i+"]");
			a[i]=s.nextInt();			
		}
		
		Arrays.parallelSort(a);
		System.out.println("The second largest number is :");
		System.out.println(a[6-2]);
		s.close();
	}

}
