package year_2020.semester_b.period_b.exam.question_1;

public class Car {
	public enum Type{AlfaRomeo, Ferrari, WilliamsRacing, McLaren, RacingPoint, MercedesAMG, RedBullRacing, Renault, ToroRosso, Haas}
	
	private String color;
	private Type type;
	private int maxSpeed;
	
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
}
