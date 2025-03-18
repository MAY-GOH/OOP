import java.util.Scanner;

public class TestCarRegistration {
  public static void main(String[] args) {
  	CarType[] carTypeArr = {new CarType("Toyota", "Vios", 1.5), 
  													new CarType("Nissan", "Teana", 2.0),
  													new CarType("Honda", "City", 1.6)};
  	
  	Registration[] regArr = new Registration[6];
  	
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < regArr.length; ++i) {
  		System.out.println("\nRegistration number: " + Registration.getNextRegNo());
  		System.out.print("Enter owner's name: ");
  		String name = scanner.nextLine();
  		System.out.print("Enter ic number: ");
  		String icNo = scanner.next();
  		Owner owner = new Owner(name, icNo);
  		
  		System.out.print("\nEnter plate no: ");
  		String plateNo = scanner.next();
  		System.out.print("Enter color: ");
  		String color = scanner.next();
  		System.out.print("Enter year: ");
  		int year = scanner.nextInt();
  		  		
  		System.out.println("\nCar Types: ");
  		for (int j = 0; j < carTypeArr.length; ++j) {
  			System.out.println((j+1) + ". " + carTypeArr[j]);
  		}
  		System.out.print("\nSelect car type [1.." + carTypeArr.length + "]: ");
  		int selection = scanner.nextInt();
  		CarType carType = carTypeArr[selection-1];
  		Car car = new Car(plateNo, color, year, carType);
  		
  		regArr[i] = new Registration(owner, car);
  		scanner.nextLine();
  	}
  
  	displayListing(regArr);	
  }
  
  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }
}
