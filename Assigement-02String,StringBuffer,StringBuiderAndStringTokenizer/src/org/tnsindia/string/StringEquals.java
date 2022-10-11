package org.tnsindia.string;
public class StringEquals {

	public static void main(String[] args) {
		//String str3="Welcome";
		String str="Welcome";
		String str1=new String("Welcome");
		String str2=new String("Welcome");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
	}
}