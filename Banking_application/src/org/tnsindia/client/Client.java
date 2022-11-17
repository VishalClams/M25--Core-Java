package org.tnsindia.client;

import org.tnsindia.application.MMBankFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class Client {
	
	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1212121, "Gaurav", 65000, true);
		CurrentAcc c=new MMCurrentAcc(1313131,"Aman", 65000, 10000);
		
		System.out.println("Saving Account Details: ");
		s.withdraw(s.getAccBal());
		
		System.out.println();
		System.out.println("Current Account Details: ");
		c.withdraw(s.getAccBal());
		}
}