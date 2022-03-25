package com.Generalprogram1;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) 
	{ int start, end;
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the starting number:");
		start=scanner.nextInt();
		System.out.println("Enter the ending number:");
		end=scanner.nextInt();
		for(int i=start; start<=end; start++)
		{
			if(start%2!=0)
			{ 
				System.out.println("even number");
				System.out.println(start);
			}

				else if(start%2==0)
				{
					System.out.println("odd number");
				System.out.println(start);
				}
		}
		scanner.close();
       /*  System.out.println("even number");
         {
        	 if(start%2==0)
        	 {
        		 System.out.println(start);
        	 }
         **/
        
	}
}


