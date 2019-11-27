package Arrays;
import java.util.Scanner;
public class Arraysum2 {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("ENTER THE ARRAY SIZE");
			int size=s.nextInt();
			int[]a1=new int[size];
			int sum=0;int sum1=0;int b=0;int c=0;
			for (int i=0;i<size;i++)
	{System.out.println("ENTER THE INDEX["+i+"]");
				a1[i]=s.nextInt();				}
			for (int i=0;i<size;i++)
			{if(a1[i]%2!=0)
				{
				System.out.println(a1[i]);
				sum1=sum1+a1[i];
				c++;
				}}
			for (int i=0;i<size;i++)
			{if(a1[i]%2==0)
				{
				System.out.println(a1[i]);
				sum=sum+a1[i];
				b++;
				}}
			int e=sum/b;int o=sum1/c;
			System.out.println(o);
			System.out.println(e);
			s.close();}
}

