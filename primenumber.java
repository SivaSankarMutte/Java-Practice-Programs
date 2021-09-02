import java.lang.*;
import java.util.*;

class primenumber
{
	public static void main(String args[])
	{
		int i,s;
		double n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextDouble();
		if(n%2!=0)
		{
			s=(int)Math.sqrt(n);
			s++;
			for(i=3;i<=s;i=i+2)
			{
				if(n%i==0)
				{
					System.out.println("Not Prime");
					return;
				}
			}
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
		
		
	}
}