import java.util.*;
public class FastModularExponentiation{

	
	public static void main(String[] args) {
		
		int value;
		int modular;
		int power;
	Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		value=sc.nextInt();
		System.out.println("enter the modular");
		modular=sc.nextInt();
		System.out.println("enter the power");
		power=sc.nextInt();
		System.out.println("the fast modular exponentiation is"+fme(value,modular,power));
		
		
	}
	
	public static int fme(int x,int y,int z)
	{
		int e=1;
		for(int i=0;i<z;i++)
		{
			e=((e*x)%y);
			
		}
		return e;
		
		
	}

}
