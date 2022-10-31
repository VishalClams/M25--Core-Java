package org.tnsindia.regex;

import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="M1-16 @@ Pratik Jain @@ Ankita @@ Hrithik";
		String[] res=str.split("@@");
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}