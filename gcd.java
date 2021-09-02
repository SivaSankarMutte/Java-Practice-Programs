import java.lang.*;
import java.util.*;

class gcd
{
	public static void main(String args[])
	{
		int n1,n2,gcd,smaller;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter first number:");
		n1=sc.nextInt();
		System.out.println("Enter second number:");
		n2=sc.nextInt();
		smaller=n1;
		if(n1>n2)
			smaller=n1;
		while(n1%smaller!=0 || n2%smaller!=0)
		{
			smaller--;
		}
		System.out.println("GCD of"+n1+" and "+n2+" is: "+smaller);
		
	}
}