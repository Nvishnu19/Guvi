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
		int base=sc.nextInt();
		int exponent=sc.nextInt();
		double result=Math.pow(base,exponent);
		System.out.println("answer  = "+result);
	}
}
