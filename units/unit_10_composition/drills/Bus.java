package unit_10_composition.drills;

import java.util.Random;

public class Bus {
	private int serialNumber;
	public int numberOfSeats = 40;
	
	public Bus(){
		Random random = new Random();
		setSerialNumber(random.nextInt(1000000));
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	private void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
}
