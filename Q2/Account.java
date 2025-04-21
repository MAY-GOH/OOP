import java.util.Date;

public class Account{
	private String accNumber;
	private double balance;
	private Date dateCreated;
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(String accNumber, double balance) {
		this.accNumber = accNumber;
		this.balance = balance;
		dateCreated = new Date();
	}
	
	/******************* P6Q2(c) *************************/
  public boolean equals(Object o) {
  	Account otherAcc = (Account)o;
  	if (this.accNumber == otherAcc.accNumber)
  		return true;
  	else
  		return false;
  }
  /*****************************************************/
	
	public String getAccNumber() {
		return accNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public boolean withdraw(double amount) {
		if (amount > balance) 
			return false;
		
		balance -= amount;
		return true;
	}
	
	public String toString() {
		return String.format("Account Number: %s \nBalance: RM%.2f \nDate created: %s", accNumber, balance, dateCreated);
	}
}


