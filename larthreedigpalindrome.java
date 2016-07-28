import java.util.*;
public class larthreedigpalindrome
{
    public static boolean isPalin(int num)
    {
        char[] val = (""+num).toCharArray();
        for(int i=0;i<val.length;i++)
        {
            if(val[i] != val[val.length - i - 1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
		int mul=0,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the max number");
		int a=sc.nextInt();
        for( i=a;i>0;i--)
		{
            for( j=a;j>0;j--)
            {
               
                if(isPalin(i*j))
                {
					//if(mul<i*j)
					//{
						mul=i*j;
						System.out.printf("%d * %d = %d",i,j,mul);
                    
                    return;
					//}
					
                }
            }
		}	
    }
}