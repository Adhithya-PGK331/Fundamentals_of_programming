package Arrays;
import java.util.Scanner;
public class Arraysum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE");
		int size=s.nextInt();
		int[]a1=new int[size];
		int[]a2=new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("ENTER THE INDEX["+i+"]");
			a1[i]=s.nextInt();			
		}
		for (int i=0;i<size;i++)
		{
			System.out.println("ENTER THE INDEX["+i+"]");
			a2[i]=s.nextInt();			
		}
		for (int i=0;i<size;i++)
		{
			System.out.println(a1[i]+a2[i]);			
		}
		s.close();}
}
