package unit_9;

public class CreatingCarWithPassengers {

	public static void main(String[] args) {
		String manufacturer = "BMW";
		int manufacturingYear = 2018;
		int maxNumOfPassengers = 5;
		
		Car carWithPassengers = new Car(manufacturer, manufacturingYear, maxNumOfPassengers);
		carWithPassengers.addPassenger("Keren");
		carWithPassengers.addPassenger("Alex");
		carWithPassengers.addPassenger("Messi");
		carWithPassengers.addPassenger("Brady");
		carWithPassengers.addPassenger("Newton");
		carWithPassengers.addPassenger("Trump");
		
		carWithPassengers.printPassengers();
	}
}