import java.lang.*;
import java.util.*;
class factor
{
	void cal(int x)
	{
		int n=1;
		for(int i=1;i<=x;i++)
		{
			n=n*i;
		}
	System.out.println("factorial:"+n);
	}
}
class factorial
{
	public static void main(String a[])
	{
		factor s=new factor();
		s.cal(Long.parseLong(a[0]));
	}
}