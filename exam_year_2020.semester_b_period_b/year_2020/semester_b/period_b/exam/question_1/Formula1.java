package year_2020.semester_b.period_b.exam.question_1;

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
		
		stringBuffer.append("Location of the last competition: " 
                                          + locationOfLastCompetition + "\n");
		for (int index = 0; index < currentNumberOfDrivers; index++) {
			stringBuffer.append(drivers[index].toString() + "\n");
		}
		
		return stringBuffer.toString();
	}
}
