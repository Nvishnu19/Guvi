/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.println(a[k-1]);
	}
}
