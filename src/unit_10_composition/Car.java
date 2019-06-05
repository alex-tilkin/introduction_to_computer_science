package unit_10_composition;

public class Car {
	private SteeringWheel steeringWheel;
	
	public Car(SteeringWheel steeringWheel) {
		this.steeringWheel = new SteeringWheel(steeringWheel);
	}
}