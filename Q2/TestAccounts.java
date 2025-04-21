public class TestAccounts{

	public static void main(String [] args){
		Account a = new Account("98765", 5000);
	  SavingsAccount s = new SavingsAccount("12345", 2000);
	  CurrentAccount c = new CurrentAccount("77880", 1000);
	    
	  System.out.println("Account info: \n" + a.toString());
	  System.out.println("\nSavings account info: \n" + s.toString());
	  
	  c.withdraw(100.00);
	  c.deposit(500.00);
	  c.withdraw(200.00);
	  System.out.println("\nCurrent account info: \n" + c.toString());
	  
	  SavingsAccount s2 = new SavingsAccount("12345", 5000);
	  SavingsAccount s3 = new SavingsAccount("12344", 2200);
	  
	  System.out.println("\ns equals s2: " + s.equals(s2));
	  System.out.println("s equals s3: " + s.equals(s3));
	 }
}
