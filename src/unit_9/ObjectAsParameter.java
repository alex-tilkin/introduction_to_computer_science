package unit_9;

public class ObjectAsParameter {

	public static void main(String[] args) {
		Car car = new Car("BMW", 2018, 5);
		
		System.out.println("Before method:");
		car.printPassengers();
		
		addPaasenger(car);
		System.out.println("After method:");
		car.printPassengers();
	}

	private static void addPaasenger(Car car) {
		car.addPassenger("Nisim");
	}
}