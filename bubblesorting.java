import java.lang.*;
import java.util.*;

class bubblesorting
{
	public static void main(String args[])
	{
		int i,j,temp;
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Before Sorting:");
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\nAfter Sorting:\n");
		for(i=0;i<10-1;i++)
		{
			if(a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}