package unit_09_constructors_and_this;

import java.util.Scanner;

public class CreatingCarWithPassengerUsingLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean isContinue = true;
		boolean isEnoughSpace = true;
		Car car = new Car("BMW", 2018, 5);
		String newPassenger;
		
		do {
			System.out.print("enter the name of the new passenger: ");
			newPassenger = scanner.nextLine();
			isEnoughSpace = car.addPassenger(newPassenger);
			if(isEnoughSpace) {
				System.out.println(newPassenger + " was added");
				System.out.print("Would you like to add another passenger? (y/n)");
				String continueAnswer = scanner.nextLine();
				isContinue = continueAnswer.equals("y") ? true : false;
			} else {
				System.out.println("Not enough space for " + newPassenger);
			}
		}while(isContinue && isEnoughSpace);
		
		car.printPassengers();
	}
}