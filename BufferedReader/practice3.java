import java.io.*;
class practice3
{
	public static void main(String args[])
	throws IOException
	{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int a=Integer.parseInt(br.readLine());
	String b=br.readLine();
	System.out.print("int:"+a+"string:"+b);
	}
}