package unit_9;

public class CopyConstructorExample {

	public static void main(String[] args) {
		Car car = new Car("BMW", 2018, 5);
		car.addPassenger("Yossi");
		
		Car aliasCar = new Car(car);
		
		aliasCar.printPassengers();
	}
}