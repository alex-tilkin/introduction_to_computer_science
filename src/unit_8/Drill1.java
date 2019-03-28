package unit_8;

import java.util.Scanner;

public class Drill1 {

	public static void main(String[] args) {
		int speed = 0;
		Scanner scanner = new Scanner(System.in);
		Car car = new Car(1234567, "BMW", "118i Sport", "White");
		
		car.setCarNumber(2387641);
		System.out.print("What is your desired speed? ");
		speed = scanner.nextInt();
		scanner.close();
		
		for(int iterator = 0; iterator < speed; iterator++){
			car.increaseSpeed();
		}
		
		car.print();
		
		car.decreaseSpeed();
		car.decreaseSpeed();
		car.print();
		
		car.stop();
		car.print();
	}
}