package bankaccountapp;

public class savings extends account {
	//list properties specific specific to the saving accounts
	int safetyDepositBoxID;
	int safetyDepostBoxKey;
	
	//constructor to initialize settings for the savings properties
	public savings(String name, String sSN, double initDeposit) {
		//invoking  with super keyword
		super(name,sSN,initDeposit); 
		accountNumber="1" + accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepostBoxKey=(int)(Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
	super.showInfo();
	System.out.println(
			"Your savings account features:"+
		     "\n safetyDepositID: "+safetyDepositBoxID+
		     "\n safetyDepositKey:"+safetyDepostBoxKey
			);
	}
	//list any methods specific to saving accounts

}
