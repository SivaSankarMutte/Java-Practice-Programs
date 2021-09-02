import java.lang.*;
import java.util.*;

class fibonacci
{
	public static void main(String args[])
	{
		long n1=1,n2=1,n3,s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLong();
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		while(s>2)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
			s--;
		}
		
	}
}