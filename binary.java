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
		int number=sc.nextInt();
	 boolean isBinary = true;
        int copyOfNumber = number;
        while (copyOfNumber != 0)
        {
            int temp = copyOfNumber%10;   //Gives last digit of the number
            if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                copyOfNumber = copyOfNumber/10;    //Removes last digit from the number
            }
        }
 
        if (isBinary)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
	}
}
