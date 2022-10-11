package org.tnsindia.string;
import java.util.StringTokenizer; 

public class DemoOnStringToken {
	public static void main(String args[])
	{  
		StringTokenizer st = new StringTokenizer("All Is Well");  
	    System.out.println(st.nextToken());  
	    System.out.println(st.nextToken());
	    System.out.println(st.nextToken());
	}  

}