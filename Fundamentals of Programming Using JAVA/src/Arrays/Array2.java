package Arrays;
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[]a1=new int[6];int[]a2=new int[5];
		int[]a3=new int[6];int[]a4=new int[5];
		int[]a5=new int[6];int[]a6=new int[5];
		double sum=0;int count=0;int d=0;
		int co=0;int de=0;				
		for (int i=0;i<6;i++)
		{System.out.println("ENTER THE INDEX["+i+"]");
			a1[i]=s.nextInt();
			if(a1[i]%2==1)
			{a3[i]=a1[i];
				count++;
				sum=sum+a1[i];
				//System.out.println(sum);
				}
			if(a1[i]%2==0)
			{//System.out.println(a1[i]);
				a5[i]=a1[i];
				d++;
				sum=sum+a1[i];
			}
			}
		for (int i=0;i<6;i++)
		{
			System.out.println(a3[i]);	
		}
		for (int i=0;i<6;i++)
		{
			System.out.println(a5[i]);	
		}
		System.out.println(count);
		
		for (int i=0;i<5;i++)
		{
			System.out.println("ENTER THE INDEX["+i+"]");
			a2[i]=s.nextInt();
			if(a2[i]%2==1)
			{
				a4[i]=a2[i];
				co++;
				
				sum=sum+a2[i];
				//System.out.println(sum);
			}
			
			if(a2[i]%2==0)
			{
				//System.out.println(a2[i]);
				a6[i]=a2[i];
				de++;
				sum=sum+a2[i];
			}		
		}
			for (int i=0;i<5;i++)
		{
			System.out.println(a4[i]);
		}
		for (int i=0;i<5;i++)
		{
			System.out.println(a6[i]);
		}
		
		System.out.println(co);
		//System.out.println(de);
		//for (int i=0;i<size;i++)
	//	{
	//		System.out.println(a1[i]+a2[i]);
			
	//	}
		s.close();
	}

}
