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
	int i =0,num=0;
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		//Empty String
		String  primeNumbers = "";
		for (i=n1+1; i <n2; i++)        
		{ 		  	  
			int counter=0,p=0;	  
			for(num =i; num>=1; num--)
			{
            			if(i%num==0)
				{
 					counter = counter + 1;
 					p++;
				}
			 }
			if (counter ==2)
			{
				if(p==1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(i+" ");
					p--;
				}
				//Appended the Prime number to the String			}
			}
		}
				
		
		System.out.println(primeNumbers);
	}
}
