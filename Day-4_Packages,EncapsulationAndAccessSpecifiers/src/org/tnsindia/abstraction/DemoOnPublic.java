package org.tnsindia.abstraction;
class B
{
	//if any data members is public the visibility is in any class
	public String dob="19-05-1995";
	public void display()
	{
		System.out.println("The DOB is: "+dob);
	}
}
public class DemoOnPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.display();

	}

}
