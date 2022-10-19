package org.tnsindia.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantageDemo {

	public static void main(String[] args) {
		List<Integer> obj=new LinkedList<>();
		obj.add(12);
		//1.Type safety
		//obj.add("Shiwani");
		
		System.out.println(obj);
		//2.Type-casting is not required
		List <Integer>obj2=new ArrayList<>();
		obj2.add(15);
		//3. Compile-time checking
		//obj2.add("15");
		
		@SuppressWarnings("unused")
		Integer d=obj2.get(0);
		System.out.println(obj2);

	}

}