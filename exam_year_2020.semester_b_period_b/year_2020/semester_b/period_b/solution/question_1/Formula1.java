package year_2020.semester_b.period_b.solution.question_1;

public class Formula1 {
	private Driver drivers[];
	private String locationOfLastCompetition;
	private final int MAX_NUMBER_OF_DRIVERS = 50;
	private int currentNumberOfDrivers;
	
	public Formula1(String locationOfCompetition) {
		setLocationOfCompetition(locationOfCompetition);
		drivers = new Driver[MAX_NUMBER_OF_DRIVERS];
	}

	public String getLocationOfCompetition() {
		return locationOfLastCompetition;
	}

	public void setLocationOfCompetition(String locationOfCompetition) {
		this.locationOfLastCompetition = locationOfCompetition;
	}
	
	public boolean addDriver(Driver driver) {
		if(currentNumberOfDrivers >= MAX_NUMBER_OF_DRIVERS) {
			return false;
		}
		
		drivers[currentNumberOfDrivers++] = driver;
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("Location of the last competition: " + locationOfLastCompetition + "\n");
		for (int index = 0; index < currentNumberOfDrivers; index++) {
			stringBuffer.append(drivers[index].toString() + "\n");
		}
		
		return stringBuffer.toString();
	}
	
	// SOLUTION
	public Driver findDriverWithTheFastestCar() {
		Driver selectedDriver = null;
		
		for (int index = 0; index < currentNumberOfDrivers; index++) {
			if(selectedDriver == null || drivers[index].getFastestCar().getMaxSpeed() > selectedDriver.getFastestCar().getMaxSpeed()) {
				selectedDriver = drivers[index];
			}
		}
		
		return selectedDriver;
	}
	
	// SOLUTION
	public int returnTheNumberOfDriversWithTheGivenCarType(Car.Type carType) {
		int counter = 0;
		
		for (int index = 0; index < currentNumberOfDrivers; index++) {
			if(drivers[index].isDrivingThisType(carType)) {
				counter++;
			}
		}
		
		return counter;
	}
	
	// SOLUTION
	public Car.Type findTheMostUsedCarType(){
		Car.Type[] carTypes = Car.Type.values();
		int selectedNumberOfDrivers = returnTheNumberOfDriversWithTheGivenCarType(carTypes[0]);
		Car.Type selectedCarType = carTypes[0];
		
		for (int index = 1; index < carTypes.length; index++) {
			int numberOfSurfers = returnTheNumberOfDriversWithTheGivenCarType(carTypes[index]);
			if(numberOfSurfers > selectedNumberOfDrivers) {
				selectedCarType = carTypes[index];
				selectedNumberOfDrivers = numberOfSurfers;
			}
		}
		
		return selectedCarType;
	}
	
	// SOLUTION
	public Driver findDriver(int serialNumber) {
		if(currentNumberOfDrivers == 0) {			
			return null;
		}
		
		for (int index = 0; index < currentNumberOfDrivers; index++) {
			if(drivers[index].isDrivingThisCar(serialNumber)) {
				
				return drivers[index];
			}
		}
		
		return null;
	}
}
