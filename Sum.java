/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sum
{
	public static void main (String[] args) throws IOException
	{
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int sum=0;
	 for(int i=1;i<=n;i++)
	 {
	 	sum=sum+i;
	 	
	 }
	 System.out.print(sum);
	}
}
