package org.tnsindia.statickeyword;

//Static keyword with Method
class A
{
	//non -sttaic method
	int add(int a,int b)
	{
		return a+b;
	}
	//static method
	public static void display()
	{
		System.out.println("Welcome to Java Full stack training in TNS.");
	}
}

public class DemoOnStaticMethod {

	public static void main(String[] args) {
		/*without creating any object for a class we can access that method by making
		that method as static
		className.methodname();*/
		
		A.display();

	}

}
