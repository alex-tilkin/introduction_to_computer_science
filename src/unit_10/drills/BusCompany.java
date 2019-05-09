package unit_10.drills;

import java.sql.Date;


public class BusCompany {
	private final int NUMBER_OF_BUSSES = 100;
	private final int NUMBER_OF_LINES = 50;
	private final int NUMBER_OF_RIDES = 1000;
	
	private int bussesCounter = 0;
	private int ridesCounter = 0;
	private int linesCounter = 0;
	
	private Bus[] busses = null;
	private Line[] lines = null;
	private Ride[] rides = null;
	
	public BusCompany(){
		busses = new Bus[NUMBER_OF_BUSSES];
		lines = new Line[NUMBER_OF_LINES];
		rides = new Ride[NUMBER_OF_RIDES];
	}
	
	public Bus addBus(){
		if(bussesCounter >= NUMBER_OF_BUSSES){
			System.out.println("Insufficient funds (the maximum amout is "+ NUMBER_OF_BUSSES + ")");
			
			return null;
		}
		busses[bussesCounter] = new Bus();
		bussesCounter++;
		System.out.println("A new bus has been added. Updated amount is " + bussesCounter);
		
		return busses[bussesCounter];
	}
	
	public void removeBus(Bus bus){
		for (int index = 0; index < bussesCounter; index++) {
			if (busses[index] != bus) {
				continue;
			}
			
			System.out.println("The bus has been removed (serial number: " + bus.getSerialNumber() + ")");
			busses[index] = null;
			bus = null;
		}
	}
	
	public Line addLine(final int number, final String source, final String destination){
		if(linesCounter >= NUMBER_OF_LINES){
			System.out.println("Insufficient funds (the maximum amout is "+ NUMBER_OF_LINES + ")");
			
			return null;
		}
		
		lines[linesCounter] = new Line(number, source, destination);
		linesCounter++;
		System.out.println("A new line has been added. Updated amount is " + linesCounter);
		
		return lines[linesCounter];
	}
	
	public void removeLine(Line line){
		for (int index = 0; index < linesCounter; index++) {
			if(lines[index] == line){
				System.out.println("The line has been removed (line number: " + line.getNumber() + ")");
				lines[index] = null;
				line = null;
			}
		}
	}
	
	public void addRide(final Line line, final Bus bus, final Date start, final String duration){
		if(ridesCounter >= NUMBER_OF_LINES){
			System.out.println("Insufficient funds (the maximum amout is "+ NUMBER_OF_LINES + ")");
		
			return;
		}
		
		rides[ridesCounter] = new Ride(line, bus, start, duration);
		ridesCounter++;
		System.out.println("A new ride has been added. Updated amount is " + ridesCounter);
	}
	
	public void removeRide(Ride ride){
		for (int index = 0; index < ridesCounter; index++) {
			if(rides[index] ==  ride){
				System.out.println("The ride has been removed (line number: " + ride.getLine().getNumber() + ")");
				rides[index] = null;
				ride = null;
			}
		}
	}
}