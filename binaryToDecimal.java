import java.lang.*;
import java.util.*;

class binaryToDecimal
{
	public static void main(String args[])
	{
		int b,d=0,i=0,r;
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		while(b>0)
		{
			r=b%10;
			d=d+(int)Math.pow(2,i)*r;
			b=b/10;
			i++;
		}
		System.out.println(d);
		
	}
}