package solution.question_1;

import java.io.PrintWriter;

public class AthleticAbilities {
	private float speed;
	private float verticalJump;
	private float horizontalJump;
	private int numberOfBenchPresses;

	public AthleticAbilities(float speed, float verticalJump, float horizontalJump, int numberOfBenchPresses) {
		this.speed = speed;
		this.verticalJump = verticalJump;
		this.horizontalJump = horizontalJump;
		this.numberOfBenchPresses = numberOfBenchPresses;
	}
	
	public float calculateAverageScore() {	
		float sum = speed + verticalJump + horizontalJump + numberOfBenchPresses;
		float average = sum / 4;
		return average;
	}
	
	public float getSpeed() {
		return speed;
	}
	
	public float getVerticalJump() {
		return verticalJump;
	}

	public float getHorizontalJump() {
		return horizontalJump;
	}
	public int getNumberOfBenchPresses() {
		return numberOfBenchPresses;
	}

	public void printDetails() {
		System.out.println(speed);
		System.out.println(verticalJump);
		System.out.println(horizontalJump);
		System.out.println(numberOfBenchPresses);
	}
	
	public void save(PrintWriter printWritter) {
		printWritter.println(speed);
		printWritter.println(verticalJump);
		printWritter.println(horizontalJump);
		printWritter.println(numberOfBenchPresses);
	}
}