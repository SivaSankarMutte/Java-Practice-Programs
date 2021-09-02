import java.lang.*;
import java.util.*;

class decimalToBinary
{
	public static void main(String args[])
	{
		int d,b=0,i=1,r;
		Scanner sc=new Scanner(System.in);
		d=sc.nextInt();
		while(d>0)
		{
			r=d%2;
			b=b+r*i;
			i=i*10;
			d=d/2;
		}
		System.out.println(b);
	}
}