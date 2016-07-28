import java.util.*;
class FibEvenSum
{
public static void main(String args[])
{
int sum=0,i,j,a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the max value");
a=sc.nextInt();
for(i=1;i<=a;i++)
{
	fib(i);
	if((fib(i)%2==0)&&(fib(i)<=4000000))
	{
   sum=sum+fib(i);
System.out.println(fib(i));
	}

}
System.out.println("the sum of even fibonacci series below"+a+"is:"+sum);



}

public static int fib(int x)
{
if(x<=1)
return x;
else

return fib(x-1)+fib(x-2);



}




}

