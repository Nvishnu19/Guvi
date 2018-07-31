/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sumofnaturalno
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	int i;
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
	}
		System.out.println("sum of natural numbers:"+sum);
	}	
}
