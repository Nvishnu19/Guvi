/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println("a is large");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("b is large");
		}
		else
		{
			System.out.println("c is large");
		}

		
	}
}