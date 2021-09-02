import java.lang.*;
import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		int n,sum=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<n;i++)
		{
			if(n%i==0)
				sum+=i;
		}
		System.out.println(sum==n?"Armstrong":"Not Armstrong");
		
		
	}
}