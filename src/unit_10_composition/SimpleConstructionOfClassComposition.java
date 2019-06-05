package unit_10_composition;

public class SimpleConstructionOfClassComposition {

	public static void main(String[] args) {
		String manufacturer = "Continental";
		int diameter = 15;
		int serialNumber = 273846537;
		
		SteeringWheel steeringWheel = new SteeringWheel(manufacturer, diameter, serialNumber);
		Car car = new Car(steeringWheel);
	}
}