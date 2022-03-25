package com.Generalprogram1;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		// write the program to display the even number using forloop
		int start, end;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the starting number:");
		start=scanner.nextInt();
		System.out.println("Enter the ending number:");
        end=scanner.nextInt();
        for(;start<=end;start++)
        {
        	if(start%2!=0)
        		System.out.println(start);
        	scanner.close();
        }
        

	}

}
