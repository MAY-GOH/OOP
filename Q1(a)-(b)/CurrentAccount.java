public class CurrentAccount extends Account{  
  private static int freeTransactions = 3;
  private static double transactionFee = 2.00;

  private int transactionCount;

  public CurrentAccount(String accNumber, double balance)  {  
    super(accNumber, balance);
    transactionCount = 0; 
  }
  
  // DFT4 stop here
  public static double getTransactionFee() {
  	return transactionFee;
  }
  
  public static int getFreeTransactions() {
  	return freeTransactions;
  }
  
  public int getTransactionCount() {
  	return transactionCount;
  }
  
  public void incrementTransactionCount() {
  	transactionCount++;
  }
   
	public void deductTransactionFee() {
		withdraw(transactionFee);
	}

}
