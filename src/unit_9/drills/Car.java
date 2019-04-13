package unit_9.drills;
import java.sql.Date;


public class Car {
	final private int DEFAULT_VECTOR_SIZE = 40;
	final private static String DEFAULT_COLOR = "White";
	private int carNumber = 0;
	private String manufacturer = "";
	private String model = "";
	private String color = "";
	private int currentSpeed = 0;
	private Date[] tests = null;
	private int numberOfTests = 0; 
	
	public Car(final int carNumber, final String manufacturer, final String model, final String color){
		this.carNumber = carNumber;
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
		tests = new Date[DEFAULT_VECTOR_SIZE];
	}
	
	
	boolean isValid(int row, int column, int numOfRows, int numOfColumns) {
		return row >= 0 && column >= 0 && column < numOfColumns && row < numOfRows;
	}
	
	public Car(final int carNumber, final String manufacturer, final String model) {
		this(carNumber, manufacturer, model, DEFAULT_COLOR);
	}
	
	public void addTest(final Date test){
		if(numberOfTests <= tests.length){
			tests[numberOfTests] = test;
			numberOfTests++;
		}
		else{
			System.out.println("Your car is too old, go buy a new one");
		}
	}
	
	public void printTests(){
		for (int index = 0; index < numberOfTests; index++) {
			printTest(index);
		}
	}
	
	public void printTest(int index){
		if(index > numberOfTests){
			System.out.println("There is no test in index " + index);
		
			return;
		}
		
		System.out.println("Test No." + (index + 1) + " has been performed in " + tests[index].toString());
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(final int carNumber) {
		this.carNumber = carNumber;
	}
	
	public void cleanFrontWindow(){
		System.out.println("Cleaning the front window");
	}
	
	public void cleanFrontWindow(final int period){
		System.out.println("Cleaning the front window for " + period);
	}
	
	public void increaseSpeed(){
		currentSpeed++;
	}
	
	public void decreaseSpeed(){
		if(currentSpeed >= 0){
			currentSpeed--;
		}
	}
	
	public void stop(){
		while(getCurrentSpeed() > 0){
				decreaseSpeed();
		}
	}
	
	public void print(){
		System.out.println("Car Details:");
		System.out.println("------------");
		System.out.println("Number: " + carNumber);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Current speed: " + currentSpeed);
		printTests();
		System.out.println();
	}
}