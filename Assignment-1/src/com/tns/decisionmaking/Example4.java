package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			//switch
			Scanner s=new Scanner(System.in);
			char a=s.next().charAt(0);
			switch(a)
			{
			case 'a':
				System.out.println("Shrivalli");
				break;
			case 'b':
				System.out.println("Hello");
				break;	
			case 'c':
				System.out.println("Rita");
				break;
			default:
				System.out.println("Invalid input");
				s.close();
			}

	}

}
