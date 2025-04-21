import java.util.Scanner;

public class TestCurrentAccount{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
   	CurrentAccount c = new CurrentAccount("7788", 10000.00);
   	
	  int selection = 4;
		do {
			System.out.println("\n1. Withdrawal");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Quit");
			System.out.print("Enter choice> ");
			selection = scanner.nextInt();
			
			switch(selection) {
			
				case 1:
					System.out.println("\nWITHDRAWAL");
					System.out.println("----------");
					System.out.printf("Current balance: RM%.2f\n", c.getBalance());
					System.out.print("Enter amount: RM");
					double amount = scanner.nextDouble();
					if (c.withdraw(amount)) {
						c.incrementTransactionCount();
						if (c.getTransactionCount() > CurrentAccount.getFreeTransactions())
							c.deductTransactionFee();
						System.out.printf("Updated balance: RM%.2f\n", c.getBalance());
					}
					else {
						System.out.println("Transaction failed: Insufficient balance.");
					}
					break;
									
				case 2:
					System.out.println("\nDEPOSIT");
					System.out.println("-------");
					System.out.printf("Current balance: RM%.2f\n", c.getBalance());
					System.out.print("Enter amount: RM");
					amount = scanner.nextDouble();
					c.deposit(amount);
					c.incrementTransactionCount();
					if (c.getTransactionCount() > CurrentAccount.getFreeTransactions())
						c.deductTransactionFee();
					System.out.printf("Updated balance: RM%.2f\n", c.getBalance());
					break;
					
				case 3:
					System.out.printf("Current balance: RM%.2f\n", c.getBalance());
					break;
					
				default:
					System.out.println("\n\nTerminating program...");
			}
		}	while (selection >= 1 && selection <= 3);
		     
	 
	     
	}
}
