import java.lang.*;
import java.util.*;

class sumofdigits
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
		System.out.println(sum);
	}
}