import java.util.*;
class LargestPrimeFactor
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of n");
n=sc.nextInt();
System.out.println(largePrime(n));

}

public static int largePrime(int m)
{
	int i;
	for(i=2;i<=m;i++)
	{
		if(m%i==0)
		{
			m=m/i;
		 i--;
		}
		
		
	}
return i;

	
}


}
