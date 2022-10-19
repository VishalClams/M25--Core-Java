package org.tnsindia.interfaceexample;

import java.util.Scanner;
class Product implements Cloneable   
{  
	public int pid;  
	public String pname;  
	public double pcost;  
	//Product class constructor   
	public Product (int pid, String pname, double pcost)  
	{  
		this.pid = pid;  
		this.pname = pname;  
		this.pcost = pcost;  
	}  
	//clone method 
    public Object clone()throws CloneNotSupportedException{     
        return super.clone();  
    }  
	//method that prints the detail on the console  
	public void showDetail()   
	{  
		System.out.println("Product ID: "+pid);  
		System.out.println("Product Name: "+pname);  
		System.out.println("Product Cost: "+pcost);  
	}  
}
public class InBuiltInterfaceDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		//reading values of the product from the user  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter product ID: ");  
		int pid = sc.nextInt();  
		System.out.print("Enter product name: ");  
		String pname = sc.next();  
		System.out.print("Enter product Cost: ");  
		double pcost = sc.nextDouble();  
		System.out.println("-------Product Detail--------");  
		Product p1 = new Product(pid, pname, pcost);  
		//clone the s1 object
        Product p2=(Product)p1.clone();  
		//cloning the object of the Product class using the clone() method  
        System.out.printf("Original Product object: ");
        p1.showDetail();
        System.out.println("Cloned Product object: " );
        p2.showDetail();
		sc.close();
		}  
		

	

}