package org.tnsindia.framework;
	
public abstract class SavingAcc extends BankAcc{
		
	private boolean isSalery;
	static final private float MINBAL=0.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalery) {
		super(accNo, accNm, accBal);
		this.isSalery = isSalery;
		
	}		
	public void withdraw(float accBal)
	{
		System.out.println("Account NO:"+this.getAccNo()+","+"Account Name:"+this.getAccNm()
		+","+"Withdrawable Balance is : "+this.getAccBal());
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalery=" + isSalery + "]";
	}
	
}
