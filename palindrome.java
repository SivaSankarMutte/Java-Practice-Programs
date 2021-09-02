import java.lang.*;
import java.util.*;

class palindrome
{
	public static void main(String args[])
	{
		int n,temp,s=0,r;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		System.out.println(s==temp?"Palindrome":"Not a Palindrome");
	}
}