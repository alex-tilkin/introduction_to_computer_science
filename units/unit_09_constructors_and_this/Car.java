package unit_09_constructors_and_this;

public class Car {
	private String manufacturer;
	private int manufacturingYear;
	private String[] passengers;
	private int numOfPassengers;
	private String color;

	public Car(String manufacturer, int manufacturingYear, int maxNumOfPAssengers) {
		this(manufacturer, manufacturingYear);
		passengers = new String[maxNumOfPAssengers];
	}

	public Car(String manufacturer, int manufacturingYear) {
		System.out.println("In constructor with Params");
		setManufacturer(manufacturer);
		setManufacturingYear(manufacturingYear);
	}

	public Car() {
		System.out.println("In default constructor");
	}

	public Car(Car otherCar) {
		manufacturer = otherCar.manufacturer;
		manufacturingYear = otherCar.manufacturingYear;
		numOfPassengers = otherCar.numOfPassengers;
		passengers = new String[otherCar.passengers.length];
		for (int index = 0; index < passengers.length; index++) {
			passengers[index] = otherCar.passengers[index];
		}
	}

	public boolean addPassenger(String newPassenger) {
		if (numOfPassengers == passengers.length) {
			return false;
		}

		passengers[numOfPassengers] = newPassenger;
		numOfPassengers++;

		return true;
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public int getMaxNumOfPassengers() {
		return passengers.length;
	}

	public void printData() {
		System.out.println("manufacturer: " + getManufacturer() + ", manufacturing year: " + getManufacturingYear());
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	public void printPassengers() {
		System.out.println("The passengers are:");
		for (int index = 0; index < numOfPassengers; index++) {
			System.out.println(passengers[index]);
		}
	}

	public void setColor(String colot) {
		this.color = color;
	}
}