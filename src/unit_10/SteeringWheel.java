package unit_10;

public class SteeringWheel {
	private String manufacturer;
	private int diameter;
	private int serialNumber;
	
	public SteeringWheel(String manufacturer, int diameter, int serialNumber) {
		setManufacturer(manufacturer);
		setDiameter(diameter);
		setSerialNumber(serialNumber);
	}

	public SteeringWheel(SteeringWheel otherSteeringWheel) {
		this(otherSteeringWheel.manufacturer, otherSteeringWheel.diameter, otherSteeringWheel.serialNumber);
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public int getDiameter() {
		return diameter;
	}

	private void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	private void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	private void setDiameter(int diameter) {
		this.diameter = diameter;
	}
}