package org.tnsindia.finalkeyword;
class FinalClass
{
	protected String name="vishal";
}
//final class cannot be inherited
/*final class FinalClass
{
	protected String name="vishal";
	
}*/
//child class(Inheritance)
class ChildFinal extends FinalClass
{
	public void print()
	{
		System.out.println(name);
	}
}

public class DemoOnFinalClass {

	public static void main(String[] args) {
		ChildFinal c=new ChildFinal();
		c.print();


	}

}
