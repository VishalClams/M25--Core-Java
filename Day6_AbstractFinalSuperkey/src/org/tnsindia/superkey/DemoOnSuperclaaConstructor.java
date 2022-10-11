package org.tnsindia.superkey;

class Person
{
	//super class constructor
	Person()
	{
		System.out.println("Parent class constructor");
	}
}
class Student extends Person
{
	Student()
	{
		//to call the parent class constructor
		super();
		System.out.println("Child class constructor");

	}
}
public class DemoOnSuperclaaConstructor {

	public static void main(String[] args) {
		Student s=new Student();
	}

}
