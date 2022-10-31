package org.tnsindia.annotations;


import java.lang.reflect.Method;
import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface Custom
{
	//abstract method
	//Multi-value annotation
	String print() default "Shiwani";
	int speed() default 5;
	float percentage() default 8.8f;
	
}
class B
{
	@Custom (print="Hello Students",speed=50,percentage=88.9f)
	public void display()
	{
		System.out.println("Hurrah!It's Holiday");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) throws Exception {
		B b=new B();
		b.display();
		Method m=b.getClass().getMethod("display");
		Custom obj=m.getAnnotation(Custom.class);
		
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.percentage());
		
	

	}

}