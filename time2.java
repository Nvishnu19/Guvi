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
		int time=sc.nextInt();
		int min,hr;
		min= time%60; 
		hr=(time-min)/60; 
		System.out.println(hr+" "+min);

	}
}
