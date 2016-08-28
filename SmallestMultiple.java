import java.util.*;
import java.io.*;	
class SmallestMultiple
{	
	
public static int gcd(int m, int n)
{
    int t;
    while(n!=0)
    {
        t=n;
        n=m%n;
        m=t;
    }
    return m;
}

public static void main(String args[])
{
    int i,n;
	Scanner sc=new Scanner(System.in);
    int lcm=1;
    System.out.println("Enter the range:");
	n=sc.nextInt();
    
    for (i=1;i<=n;i++)
    {
        lcm = (i*lcm)/gcd(i,lcm);
    }
    System.out.println("smallest multiple :"+lcm);

}

}