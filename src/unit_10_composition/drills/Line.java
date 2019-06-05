package unit_10_composition.drills;


public class Line {
	private int number;
	private String source;
	private String destination;
	
	public Line(final int number, final String source, final String destination){
		setNumber(number);
		setSource(source);
		setDestination(destination);
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
