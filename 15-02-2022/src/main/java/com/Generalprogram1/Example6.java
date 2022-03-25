package com.Generalprogram1;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		//write the java program to print the odd number using for Loop
		int start, end;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the starting number:");
		start=scanner.nextInt();
		System.out.println("Enter the ending number:");
		end=scanner.nextInt();
		for(;start<=end;start++)
		{
			if(start%2==0)
			{
				System.out.println("EVEN NUMBER:"+start);
		
			} 
			if(start%2!=0)
			{
				System.out.println("ODD NUMBER:"+start);
			}
			 scanner.close();
		}
          
	}

}
