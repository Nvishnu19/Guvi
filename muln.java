/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class muln
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=5;
		for(int i=1;i<=d;i++)
		{
				int mul=n*i;
				System.out.print(mul+" ");
		} 
	}
}
