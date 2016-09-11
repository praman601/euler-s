import java.io.*;
import java.util.*;
class Ceaser
{
	public static void main(String args[]) throws IOException
	{
		String in;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		in=br.readLine();
		Cipher cc= new Cipher();
		String encrypt =cc.ceaserCipher(in);
		System.out.println("The encrypted string is "+encrypt);
	}
}
class Cipher
{
	public String ceaserCipher(String in)
	{
		String out;
		char inp[]=in.toCharArray();
		for(int i=0;i<in.length();i++)
		{
		if(inp[i]=='x'||inp[i]=='X'||inp[i]=='y'||inp[i]=='Y'||inp[i]=='z'||inp[i]=='Z')
			inp[i]=(char)((int)inp[i]-23);
		else
			inp[i]=(char)((int)inp[i]+3);
		}
		out=new String(inp);
		return out;
	}
} 
