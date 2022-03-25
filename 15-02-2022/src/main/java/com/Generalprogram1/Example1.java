package com.Generalprogram1;

public class Example1 {
	public static void main(String[] args) {
		int emploeeids[]= {252,562,798,268,265};
		double emploeesalaries[]= {5686.2,7954.2,5954.2,7956.2,9653.5};
		String emploeenames[]= {"Thara", "Devi","Zara","Seetha","Nisha"};
		System.out.println("THE EMPLOYEE ID ARE:");
		for(int emploeeID:emploeeids)
		{
			System.out.println(emploeeID);
		}
		System.out.println("--------------------------");
		System.out.println("THE EMPLOYEE SALARIES ARE:");
		for(double emploeesalary:emploeesalaries) 
		{
			System.out.println(emploeesalary);
		}
		System.out.println("------------------------");
		System.out.println("THE EMPLOYEE NAME ARE:");
		for(String emploeename:emploeenames)
		{
			System.out.println(emploeename);
		}
	}
}
