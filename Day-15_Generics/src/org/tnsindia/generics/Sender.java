package org.tnsindia.generics;

public class Sender <T>
{
	private T message;
	//getter method
	public T getMessage() {
		return message;
	}
	//setter method
	public void setMessage(T message) {
		this.message = message;
	}
	public void sendMessage()
	{
		System.out.println("Message Type: "+getMessage().getClass());
		System.out.println("Contents are: "+getMessage());

	}
	

}