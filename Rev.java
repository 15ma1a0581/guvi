/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Palindrome
{
	public static void main (String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		
		while(n!=0)
		{
		int	r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
	}
}
