package unit_10.drills;

import java.sql.Date;

public class Ex1 {

	public static void main(String[] args) {
		BusCompany busCompany = new BusCompany();
		
		Bus bus = busCompany.addBus();
		Line line = busCompany.addLine(47, "Bat-Yam", "Atidim");
		Date start = new Date(0);
		String duration = "1:00:00";
		busCompany.addRide(line, bus, start, duration);
	}
}