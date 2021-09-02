import java.lang.*;
import java.util.*;

class lcm
{
	public static void main(String args[])
	{
		int n1,n2,greater;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter first number:");
		n1=sc.nextInt();
		System.out.println("Enter second number:");
		n2=sc.nextInt();
		greater=n1;
		if(n2>n1)
			greater=n2;
		while(greater%n1!=0 || greater%n2!=0)
		{
			greater++;
		}
	System.out.println("LCM of "+n1+" and "+n2+" is: "+greater);
	}
}