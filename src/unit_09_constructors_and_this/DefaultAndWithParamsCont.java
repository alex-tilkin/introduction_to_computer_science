package unit_09_constructors_and_this;

public class DefaultAndWithParamsCont {

	public static void main(String[] args) {
		
		Car defaultCar = new Car();
		Car withParamsCar = new Car("BMW", 2018);
		
		defaultCar.printData();
		withParamsCar.printData();
	}
}