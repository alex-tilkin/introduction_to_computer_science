package unit_10.drills;

import java.sql.Date;

public class Ride {
	private Date start;
	private Line line;
	private String duration;
	private Bus bus;
	
	public Ride(final Line line, final Bus bus, final Date start, final String duration){
		setStart(start);
		setBus(bus);
		setLine(line);
		setDuration(duration);
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Line getLine() {
		return line;
	}

	public void setLine(Line line) {
		this.line = line;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
}