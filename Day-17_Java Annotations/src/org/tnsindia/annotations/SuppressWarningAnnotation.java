package org.tnsindia.annotations;

class Animal
{
	//Non-Parameterized Constructor
	Animal()
	{
		System.out.println("Lion");
	}
	/*public void sound()
	{
		System.out.println("Roars");
	}*/
}
public class SuppressWarningAnnotation {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		//will remove the compiler warnings
		Animal a=new Animal();
		
		

	}

}