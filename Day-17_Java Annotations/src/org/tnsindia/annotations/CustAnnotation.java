package org.tnsindia.annotations;

import java.lang.annotation.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//custom annotation
@interface OwnCustom
{
	int accept();
}
class C
{
	@OwnCustom(accept=35)
	public void display()
	{
		System.out.println("Hey, I am using Custom Annotations");
	}
}
public class CustAnnotation {

	public static void main(String[] args) throws Exception  {
		C c=new C();
		Method m=c.getClass().getMethod("display");
		OwnCustom obj=m.getAnnotation(OwnCustom.class);
		c.display();
		System.out.println(obj.accept());

	}

}