public class TestAccounts{

	public static void main(String [] args){
	   SavingsAccount s = new SavingsAccount("12345", 2000);
	   CurrentAccount c = new CurrentAccount("7788", 1000);
	    
	   System.out.printf("Savings account %s has balance: RM%.2f\n", s.getAccNumber(), s.getBalance());
	   System.out.println("Transaction: Deposit RM100.00");
	   s.deposit(100);
	   System.out.printf("Updated balance: RM%.2f\n", s.getBalance());
	   
	   System.out.println("\nTransaction: Withdraw RM5000.00");
	   boolean successful = s.withdraw(5000);
	   if (!successful)
	   	System.out.println("Transaction failed.  Withdrawal amount > balance.");
	   
	   System.out.println("\nTransaction: Withdraw RM500.00");
	   successful = s.withdraw(500);
	   System.out.printf("Updated balance: RM%.2f\n", s.getBalance());
	   
	   // DFT4 stop here
	   System.out.printf("\nAdding interest of RM%.2f\n", s.calcInterest());
	   s.addInterest();
	   System.out.printf("Updated balance: RM%.2f\n", s.getBalance());
	   
	   System.out.printf("\n\nCurrent account %s has balance: RM%.2f\n", c.getAccNumber(), c.getBalance());
	   System.out.println("Transaction: Deposit RM100.00");
	   c.deposit(100);
	   System.out.printf("Updated balance: RM%.2f\n", c.getBalance());
	   
	   System.out.println("\nTransaction: Withdraw RM5000.00");
	   successful = c.withdraw(5000);
	   if (!successful)
	   	System.out.println("Transaction failed.  Withdrawal amount > balance.");
	   
	   System.out.println("\nTransaction: Withdraw RM500.00");
	   successful = c.withdraw(500);
	   System.out.printf("Updated balance: RM%.2f\n", c.getBalance());
	   
	   
	     
	 }
}
