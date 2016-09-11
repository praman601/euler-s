import java.io.*;
import java.util.*;
class CeaserDecrypt
{
	public static void main(String args[]) throws IOException
	{
		String in;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		in=br.readLine();
		Cipher cc= new Cipher();
		String decrypt =cc.ceaserCipher(in);
		System.out.println("The decrypted string is "+decrypt);
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
		if(inp[i]=='a'||inp[i]=='A'||inp[i]=='b'||inp[i]=='B'||inp[i]=='c'||inp[i]=='C')
			inp[i]=(char)((int)inp[i]+23);
		else
			inp[i]=(char)((int)inp[i]-3);
		}
		out=new String(inp);
		return out;
 	} 
}
