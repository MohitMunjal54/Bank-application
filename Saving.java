package bank;

public class Saving extends Account {
// List properties specific to the saving account.
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	//constructor to initialize setting for saving properties
	

	public Saving(String name,String ssn,double initDeposit)
	{
		super(name,ssn,initDeposit);
		accountNo="i"+accountNo;
		
		//System.out.println("NEW SAVINGS ACCOUNT:"+name);
		// System.out.println("SSN:"+ssn +" "+"Deposit:₹"+initDeposit);
		
		setSafetyDepositBox();
	}
	
	
	private void setSafetyDepositBox()
	{
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));

	}
	
	
	
	public void showinfo()
	 {
		super.showinfo();
		 System.out.println("Account Type:SAVINGS ");
		 System.out.println(" Safety deposit box ID:"+this.safetyDepositBoxID);
		 System.out.println(" Safety deposit box KEY:"+this.safetyDepositBoxKey);
	 }


	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Implement rate for savings account.");
		rate=getBaseRate()-.25;
	}
}
