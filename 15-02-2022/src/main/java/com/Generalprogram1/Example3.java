package com.Generalprogram1;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number:");
		i=scanner.nextInt();
		for(int a=10; i<=a; i++)
		{
			i+=1;
		}
		System.out.println("display the value:"+i);
		scanner.close();
		
		

	}

}
