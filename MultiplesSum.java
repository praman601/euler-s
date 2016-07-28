import java.util.*;
class MultiplesSum
{
public static void main(String args[])
{
int i,sum=0;
int a;
int b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the first multiple factor");

a=sc.nextInt();

System.out.println("enter the second multiple facotor");
b=sc.nextInt();
for(i=0;i<1000;i++)
{
if((i%a==0)||(i%5==0))
{
sum=sum+i;

}


}
System.out.println("the sum is"+sum);
}

}