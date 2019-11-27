package Arrays;
import java.util.Scanner;
public class Maxnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//System.out.println("ENTER THE ARRAY SIZE");
		//int size=s.nextInt();
		int[]a=new int[6];
		int max=0;
		int i;
		for (i=0;i<6;i++)
		{
			System.out.println("ENTER THE INDEX["+i+"]");
			a[i]=s.nextInt();			
		}
		for(i=0;i<6;i++)
		{
		if (a[i]>=max)
		{
			max=a[i];
						
		}
		}
		System.out.println("The maximum number is :");
		System.out.println(max);
		s.close();}

}
