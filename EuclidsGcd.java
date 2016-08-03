import java.util.*;
public class EuclidsGcd {


	public static void main(String[] args) {
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
		System.out.println("the gcd is"+gcd(a,b));
	}
	
	public static int gcd(int x,int y)
	{
		if(y==0)
		{
			return x;
		}
			return gcd(y,x%y);
		
		
				
	}

}
