import java.io.*;
class practice4
{
public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str=br.readLine();
	int x[]=new int[256];
	for(int i=0;i<256;i++)
	{
	x[i]=0;
	}
	int a;
	for(int i=0;i<str.length();i++)
	{
	a=(int)str.charAt(i);
	x[a-1]++;
	}
	for(int i=0;i<256;i++)
	{
	if(x[i]!=0)
	{
	System.out.print(((char)(i+1))+""+x[i]);
	}
	}
	}
}