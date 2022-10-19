package org.tnsindia.generics;

public class GenericsClassExample<T>
{
	T num;
	//method
	public void show()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		//instead of collections i have used Generic class name and generics concept
		GenericsClassExample<Double>obj=new GenericsClassExample<>();
		obj.num=13.8;
		obj.show();
	}

}