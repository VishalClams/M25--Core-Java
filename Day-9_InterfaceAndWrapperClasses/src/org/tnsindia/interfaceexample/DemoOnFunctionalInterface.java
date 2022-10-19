package org.tnsindia.interfaceexample;

@FunctionalInterface
interface FunctionalInterfacee{  
	
	
    void accept(String msg);  
}  
class FunctionalInterfaceExample implements FunctionalInterfacee{  
    public void accept(String msg){  
        System.out.println(msg);  
    }  
    
}  
public class DemoOnFunctionalInterface {

		public static void main(String[] args) {  
	        FunctionalInterfaceExample f = new FunctionalInterfaceExample();  
	        f.accept("Hello there");  
	    

	}

}