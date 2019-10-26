package bank;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checking checkacc=new Checking("TOM CRUISE","343445",1500);
		
		Saving saveacc=new Saving("MOHIT MUNJAL","9987899",2500);
		
		checkacc .showinfo();
		System.out.println("-------------------------------------------");
		saveacc.showinfo();
		
		/*saveacc.Deposit(10000);
		saveacc.withdraw(2000);
		saveacc.transfer("Brokerage", 5000);      */
		//saveacc.compound();
		
		// read a csv file 
	}

}
