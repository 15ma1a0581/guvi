/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prime1
{
	public static void main (String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==1)
			{
				System.out.print(i);
				if(i<n2)
				{
					System.out.print(" ");
				}
			}
		}
	}
}
