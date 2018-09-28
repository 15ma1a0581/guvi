/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Character
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c!='a'|| c!='e'||c!='i'||c!='o'||c!='u')
		{
			System.out.print("Consonant");
      	}
	else
	{
		System.out.print("invalid");
	}
  }
}
