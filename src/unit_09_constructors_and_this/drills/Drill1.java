package unit_09_constructors_and_this.drills;

import java.util.Scanner;

public class Drill1 {

	public static void main(String[] args) {
		int speed = 0;
		Scanner scanner = new Scanner(System.in);
		Car car = new Car(1234567, "BMW", "116i kit-M", "White");
		
		car.setCarNumber(2387641);
		System.out.print("What is your desired speed? ");
		speed = scanner.nextInt();
		scanner.close();
		
		System.out.println("Increasing speed to " + speed);
		for(int iterator = 0; iterator < speed; iterator++){
			car.increaseSpeed();
		}
		car.print();
		
		System.out.println("Decreasing speed");

		car.decreaseSpeed();
		car.decreaseSpeed();
		car.print();
		
		System.out.println("Stopping the car");
		car.stop();
		car.print();
	}

}
