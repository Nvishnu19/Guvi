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
		int k=sc.nextInt();
		int m=sc.nextInt();
		String concat = Integer.toString(k) + Integer.toString(m);
		int combined = Integer.parseInt(concat);
		System.out.println(combined);
	}
}
