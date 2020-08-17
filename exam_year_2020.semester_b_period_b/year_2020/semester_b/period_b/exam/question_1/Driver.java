package year_2020.semester_b.period_b.exam.question_1;

public class Driver {
	private String name;
	private int rank;
	private String country;
	private Car cars[];
	private final int MAX_NUMBER_OF_CARS = 2;
	private int numberOfCars;
	
	public Car getCarBySerialNumber(int serialNumber) {
		for (int index = 0; index < numberOfCars; index++) {
			/*if(cars[index].getSerialNumber() == serialNumber) {
				return cars[index];
			}*/
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
			/*if(cars[index].getSerialNumber() == serialNumber) {
				return true;
			}*/
		}
		
		return false;
	}

	public String getName() {
		return name;
	}
}
