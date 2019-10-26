package bank;

public abstract class Account implements IBaseRate{
	
	// List common properties for savings and checking account.
	private String name;
	private String ssn;
	private double balance;
	private static int index=10000;
	protected String accountNo;
	protected double rate;
	
	
	
	
	
// Constructor to set base properties and initialize the account.
	public Account(String name,String ssn, double initDeposit) 
	{
		// TODO Auto-generated constructor stub
		this.name=name;
		this.ssn=ssn;
		balance=initDeposit;
		//System.out.println("NAME:"+" "+name+" "+"SSN:"+" "+"BALANCE:₹"+" "+balance);
	
		// Set Account number.
		index++;
		this.accountNo=setAccountNumber();
		// System.out.println("ACCOUNT NUMBER:"+this.accountNo);
	//	System.out.println(" Base rate is:"+getBaseRate());
		setRate();
	}
	
	
	public abstract void setRate();
	
	private String setAccountNumber()
	{
		String lastTwoOfSSN=ssn.substring(ssn.length()-2,ssn.length());
		int uniqueId=index;
		int randomnumber=(int) (Math.random()*Math.pow(10,3));
		return lastTwoOfSSN+uniqueId +randomnumber;
	}
	
	
	public void compound()
	{
		double accruedinterest=balance*(rate/100);
		balance = balance+accruedinterest;
		System.out.println("Accured Interest:₹"+accruedinterest);
		printbalance();
	}
	// list of common methods.

	public void Deposit(double amount)
	{
	balance=balance+amount;
	System.out.println("Depositing amount of ₹"+amount);
	printbalance();
	}
	
	public void withdraw(double amount)
	{
		balance=balance-amount;
		System.out.println("WithDraw  amount ₹"+amount);
		printbalance();
	}

	public void transfer(String toWhere,double amount)
	{
		balance=balance-amount;
		System.out.println("Transfer of amount ₹"+amount+" "+"TO"+" "+toWhere);
		printbalance();
	}
	
	public void printbalance()
	{
		System.out.println("Your balance is ₹:"+balance);
	}
	
	
	
	public void showinfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Acount number:"+accountNo);
		System.out.println("Balance:₹"+balance);
		System.out.println("Base Rate:"+rate+"%");
	}
}
