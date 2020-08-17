package year_2020.semester_b.period_b.solution.question_1;

public class Car {
	public enum Type{AlfaRomeo, Ferrari, WilliamsRacing, McLaren, RacingPoint, 
        MercedesAMG, RedBullRacing, Renault, ToroRosso, Haas}

		private String color;
		private Type type;
		private int maxSpeed;
		
		private int serialNumber; // SOLUTION
		private static int globalSerialNumber = 1000;  // SOLUTION
		
		// SOLUTION
		public Car(String color, Type type, int maxSpeed) {
			this.color = color;
			this.type = type;
			this.maxSpeed = maxSpeed;
			serialNumber = globalSerialNumber++;
		}
		
		public int getMaxSpeed() {
			return maxSpeed;
		}
		
		public String getColor() {
			return color;
		}
		
		public Type getType() {
			return type;
		}
		
		@Override
		public String toString() {
			StringBuffer stringBuffer = new StringBuffer();
			
			stringBuffer.append("Color: " + color + ", ");
			stringBuffer.append("Type: " + type.toString());
			
			return stringBuffer.toString();
		}
		
		// SOLUTION
		public int getSerialNumber() {
			return serialNumber;
		}
}
