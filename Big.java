/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Big
{
	public static void main (String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>n2&&n1>n3)
		{
			System.out.print(n1);
		}
		else if(n2>n1&&n2>n3)
		{
			System.out.print(n2);
		}
		else
		{
			System.out.print(n3);
		}
	}
}
