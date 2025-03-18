public class Car {
  private String plateNo;
  private String color;
  private int year;
  private CarType carType;

  public Car(String plateNo, String color, int year, CarType carType) {
  	this.plateNo = plateNo;
  	this.color = color;
  	this.year = year;
  	this.carType = carType;
  }
    
  public String toString() {
  	return String.format("%-10s %-8s %-6s %-15s", plateNo, color, year, carType);
  }  
}