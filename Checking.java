package bank;

public class Checking extends Account {

	
		// List properties specific to a checking Account.
	private int debitCardNumber;
		private int DebitCardPin;
		
		
		
		// Constructor to initialize checking and saving account. 
		
		public Checking(String name,String ssn,double initDeposit) 
		{
		super(name, ssn, initDeposit);
	    accountNo="2"+accountNo;
	    setDebitCard();
	
		
		// System.out.println("Account number:"+this.accountNo);
	}
		@Override
		public void setRate()
		{
			//System.out.println("Implement rate for account type:CHECKING ");
			rate=getBaseRate()*.15;
		}
		
		// list methods specific to checking account.
	
		private void setDebitCard()
		{
			debitCardNumber=(int)(Math.random()*Math.pow(10,12));
			DebitCardPin=(int)(Math.random()*Math.pow(10,4));
	
		}
		
		 public void showinfo()
		 {
			 super.showinfo();
			 System.out.println("Account type:CHECKING");
				System.out.println("Your Card Number is:"+this.debitCardNumber);
				System.out.println("Your Debit Card pin:"+this.DebitCardPin);
		 }

			
}
