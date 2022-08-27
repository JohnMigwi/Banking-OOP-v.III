package bankaccountapp;

public class BankAccountAPP {

	public static void main(String[] args) {
		
		//Read a csv file and create an account based on that data
		
		
		cheking acc1= new cheking("john migwi","123456789",1500);
	
		savings sav1=new savings("alexia tek","2345678901",2500);
		
		sav1.showInfo();
		System.out.println("*****************");
		acc1.showInfo();
		
	}

}
