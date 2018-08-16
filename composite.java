/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a, b;
  Scanner scan = new Scanner(System.in);
  b = scan.nextInt();
  scan.close();
  for (a = 2; a <= b - 1; a++) {
   if (b % a == 0) {
    System.out.println("yes" );
    break;
   }
  }
  if (b == a)
   System.out.println("no" );
	}

}
