package org.tnsindia.buffereader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoOnBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		String str=r.readLine();
		System.out.println(str);

	}

}
