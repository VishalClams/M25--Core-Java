package org.tnsindia.basic.userinput;

import java.util.Scanner;

public class DemoOnFloat {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x: ");
		float x=s.nextFloat();
		System.out.println("The result is: ");
		System.out.print(x);
		s.close();
	}

}
