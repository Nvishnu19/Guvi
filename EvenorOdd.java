import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EvenorOdd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		{
			if(n%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
		    }
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
