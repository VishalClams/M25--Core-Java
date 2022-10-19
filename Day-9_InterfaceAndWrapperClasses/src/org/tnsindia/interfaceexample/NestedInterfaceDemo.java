package org.tnsindia.interfaceexample;

import java.util.Scanner;


interface InterfaceOuter
{
	
	void print();
	
	interface InnerInterface
	{
		
		void display();
	}
}
class ImplementableClass implements org.tnsindia.interfaceexample.InterfaceOuter.InnerInterface
{

	@Override
	public void display() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the batch: ");
		String str=s.nextLine();
		System.out.println("The batch is: "+str);
		
	}
	
}
class ImplementableClassP implements InterfaceOuter
{

	@Override
	public void print() {
		System.out.println("Working on Nested Interface");
		
	}

	
		
	
	
}