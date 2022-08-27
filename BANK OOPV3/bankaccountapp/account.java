package bankaccountapp;

public abstract class account implements IBaseRate {
	//list properties specific for checking accounts
	String name;
	String sSN;
	double balance;
	
	static int index=10000;
	String accountNumber;
	double rate;
	
	
		//constructor to set base properties and initialize the account
		public account(String name,String sSN,double initDeposit) {
			this.name=name;
			this.sSN=sSN;
			balance =initDeposit;
			
			//set account number
			index++;
			this.accountNumber=setAccountNumber();
						
			
			}
		private String setAccountNumber() {
			String lastTwoSSN=sSN.substring(sSN.length()-2, sSN.length());
			int uniqueID= index;
			int randomNumber =(int) (Math.random() * Math.pow(10, 3));
			return lastTwoSSN + uniqueID +randomNumber;
		}
		
		public void showInfo() {
			System.out.println(
					"Name: " + name +
					"\nACCOUNTNUMBER: " + accountNumber  +
					"\nBALANCE: " + balance 
					);
		}
			
		} 	
		
		//list  methods specific to the checking account

