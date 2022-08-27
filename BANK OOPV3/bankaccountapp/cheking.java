package bankaccountapp;

public class cheking extends account {
	
	//list properties specific for checking accounts
	int debitCardNumber;
	int debitCardPin;
	
	//constructor to set base properties and initialize the account
	public cheking(String name, String sSN, double initDeposit){
		super(name,sSN,initDeposit);
		accountNumber="2" + accountNumber;
		setDebitCard();
	}
	
	//list  methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));

	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your cheking account features:"+
			     "\ndebitCardNumber: "+debitCardNumber+
			     "\ndebitCardPin: "+debitCardPin
				);
		}	
}
