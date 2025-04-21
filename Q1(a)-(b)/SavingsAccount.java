public class SavingsAccount extends Account {
  private static double interestRate = 0.05;	
  
  public SavingsAccount(){
  }
  
  public SavingsAccount(String accNumber, double balance){
  	super(accNumber, balance);
  }   
  	
  public static double getInterestRate(){
  	return interestRate;
  }
  
  public static void setInterestRate(double intRate){
  	interestRate = intRate;
  }
  
  // DFT4 Stop here 
  
  public double calcInterest() {
  	return getBalance() * interestRate / 12;
  }
  
  public void addInterest()    {  
    double interest = calcInterest();
    deposit(interest); 
   }
}
