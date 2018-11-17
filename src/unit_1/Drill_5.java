package unit_1;

import java.util.Scanner;

public class Drill_5 {

	public static void main(String[] args) {
		final int delayInFloorInSecs = 5;
		final int travelingTimeBetweenTwoFloorsInSecs = 3;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Which floor are you traveling form?");
		int currentFloor = scanner.nextInt();
				
		System.out.println("Which floor do you want to travel to?");
		int destinationFloor = scanner.nextInt();
		
		scanner.close();
		
		int numberOfFloorsToTravel = Math.abs(destinationFloor - currentFloor);
		int totalTravelingTimeBetweenFloors = numberOfFloorsToTravel * travelingTimeBetweenTwoFloorsInSecs;
		int totalTravelingTime = totalTravelingTimeBetweenFloors + delayInFloorInSecs;
		
		System.out.println("The duration for traveling from " + currentFloor + " to " + destinationFloor + " floor is " + totalTravelingTime + " seconds");
	}
}