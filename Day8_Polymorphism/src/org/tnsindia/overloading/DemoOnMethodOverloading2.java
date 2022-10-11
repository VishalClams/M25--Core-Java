package org.tnsindia.overloading;

//demo on method overloading-by passing the different data types
class MathematicalOperation
{
	//method overloading
	public void addition(int a,int b)
	{
		System.out.println("The sum is: "+(a+b));
	}
	public void addition(float a,int b)
	{
		System.out.println("The sum is: "+(a+b));
	}
}

public class DemoOnMethodOverloading2 {
	public static void main(String[] args) {
		MathematicalOperation m=new MathematicalOperation();
		m.addition(10, 45);
		m.addition(11.0f, 25);

	}


}