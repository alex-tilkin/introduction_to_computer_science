package unit_03_04_loops;

public class WhileLoopExample {

	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		int STOP_CONDITION = 3;

		while(count < STOP_CONDITION){
		sum += count;
		count++;
		System.out.printf("The values of sum and count are %d and %d\n", sum, count);
		}
	}
}