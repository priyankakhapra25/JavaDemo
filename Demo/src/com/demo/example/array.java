package com.demo.example;
import java.util.Scanner;

public class array {
	public static void main(String [] args)
	{
		int n,m;
		Scanner s = new Scanner(System.in);
		
		/*
		System.out.println("enter the size of m:");
		m=s.nextInt();
		
		Object[] obj= new Object[m];
		for(int j=0; j<obj.length; j++)
		{
			obj[i]= s.				
		}*/
		
		Object[] obj= new Object[3];
		obj[0]="hello";
		obj[1]=5;
		
		System.out.println("Enter the size:");
		n=s.nextInt();
		
		System.out.println("Enter elements:");
		int a[] = new int [n];
		for(int i=0; i<a.length; i++)
		{
			a[i]= s.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("elements are: "+a[i]);
		}
	
		System.out.print("objects type of array: "+obj[0]+"," +obj[1]);
	}
}
