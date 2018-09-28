/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Even
{
	public static void main (String[] args) throws IOException
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n%2==0)
	{
		System.out.print("Even");
	}
	else if(n<0)
	{
		System.out.print("invalid");
	}
	else
	{
		System.out.print("odd");
	}
	}
}
