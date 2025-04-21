public class CheckingAccount extends Account{  
  private static int freeTransactions = 3;
  private static double transactionFee = 2.00;

  private int transactionCount;

  public CheckingAccount(String accNumber, double balance)  {  
    super(accNumber, balance);
    transactionCount = 0; 
  }
  
  public void incrementTransactionCount() {
  	transactionCount++;
  }
   
	public void deductTransactionFee() {
		super.withdraw(transactionFee);
	}
  
  public boolean withdraw(double amount)  {
  	boolean successful = super.withdraw(amount);
  	if (successful) {
  		transactionCount++; // OR: incrementTransactionCount();
  		if (transactionCount > freeTransactions)
  			deductTransactionFee();
  	}
  	return successful;
  }
  
  public void deposit(double amount) {
  	super.deposit(amount);
  	transactionCount++;
  	if (transactionCount > freeTransactions)
  		deductTransactionFee();
  }
  
  public static double getTransactionFee() {
  	return transactionFee;
  }
  
  public static int getFreeTransactions() {
  	return freeTransactions;
  }
  
  public int getTransactionCount() {
  	return transactionCount;
  }
  


}
