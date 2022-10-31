package org.tnsindia.annotations;


import java.lang.reflect.Method;
import java.lang.annotation.*;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//if we need to inherit an annotation from superclass then go with inherited annotation
@Inherited
//custom annotation
@interface CustomB
{
	//abstract method
	//Multi-value annotation
	String print() ;
	
}

class E
{
	@CustomB(print = "SHIWANI")

	public void display()
	{
		System.out.println("Displaying inherited");
	}
}
class F extends E
{
	public void display1()
	{
		System.out.println("Displaying inherited-11");
	}
}
public class InheritedAnnotation {

	public static void main(String[] args) throws Exception
	{
		F obj=new F();
		obj.display();
		obj.display1();
		
		Method m=obj.getClass().getMethod("display");
		CustomB obj1=m.getAnnotation(CustomB.class);
		
		System.out.println(obj1.print());
		

	}

}