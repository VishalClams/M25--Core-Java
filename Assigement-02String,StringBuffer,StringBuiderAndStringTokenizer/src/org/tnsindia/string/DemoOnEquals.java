package org.tnsindia.string;

import java.util.Scanner;

public class DemoOnEquals {
	public static void main(String[] args) {
		String str="Rutujas";
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str1.equals(str))
		{
			System.out.println("Matching");
			
		}
		else
		{
			System.out.println("Not Matching");
		}
		s.close();

	}


}