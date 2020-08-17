package year_2020.semester_b.period_b.solution.question_1;

public class Driver {
	private String name;
	private int rank;
	private String country;
	private Car cars[];
	private final int MAX_NUMBER_OF_CARS = 2;
	private int numberOfCars;
	
	// SOLUTION
	public Driver(String name, int rank, String country) {
		this.name = name;
		this.rank = rank;
		this.country = country;
		this.cars = new Car[MAX_NUMBER_OF_CARS];
		numberOfCars = 0;
	}
	
	public Car getCarBySerialNumber(int serialNumber) {
		for (int index = 0; index < numberOfCars; index++) {
			if(cars[index].getSerialNumber() == serialNumber) {
				return cars[index];
			}
		}
		
		return null;
	}
	
	public boolean isDrivingThisType(Car.Type type){
		for (int index = 0; index < numberOfCars; index++) {
			if(cars[index].getType() == type) {
				return true;
			}
		}
		
		return false;
	}
	
	// SOLUTION
	public boolean addCar(Car car) {
		if(numberOfCars >= MAX_NUMBER_OF_CARS) {
			return false;
		}
		
		for (int index = 0; index < numberOfCars; index++) {
			if(cars[index].getSerialNumber() == car.getSerialNumber()) {
				return false;
			}
		}
		
		cars[numberOfCars++] = car;
		
		return true;
	}
	
	// SOLUTION
	public Car getFastestCar() {
		Car fastestCar = null;
		
		for (int index = 0; index < numberOfCars; index++) {
			if(fastestCar == null || fastestCar.getMaxSpeed() < cars[index].getMaxSpeed()) {
				fastestCar = cars[index];
			}
		}
		
		return fastestCar;
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Name: " + getName() + "\n");
		stringBuffer.append("Rank: " + rank + "\n");
		stringBuffer.append("Country: " + country + "\n");
		stringBuffer.append("Cars: " + "\n");
		for (int i = 0; i < numberOfCars; i++) {
		   stringBuffer.append("  " + (i+1) + ") " + cars[i].toString() + "\n");
		}
		
		return stringBuffer.toString();
	}
	
	public boolean isDrivingThisCar(int serialNumber) {
		for (int index = 0; index < numberOfCars; index++) {
			if(cars[index].getSerialNumber() == serialNumber) {
				return true;
			}
		}
		
		return false;
	}

	public String getName() {
		return name;
	}
}
