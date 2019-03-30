package unit_9;

public class Car {
	private String manufacturer;
	private int manufacturingYear;
	
	public Car(String manufacturer, int manufacturingYear) {
		System.out.println("In constructor with Params");
		this.manufacturer = manufacturer;
		this.manufacturingYear = manufacturingYear;
	}

	public Car() {
		System.out.println("In default constructor");
	}
	
	public void printData() {
		System.out.println("manufacturer: " + manufacturer + ", manufacturing year: " + manufacturingYear);
	}
}