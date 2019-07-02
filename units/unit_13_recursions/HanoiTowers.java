package unit_13_recursions;

public class HanoiTowers {

	public static void main(String[] args) {
		int numberOfDisks = 3;
		solveHanoiTowers(3, 'A', 'B', 'C');
	}

	private static void solveHanoiTowers(int numberOfDisks, char source, char destination, char help) {
		if(numberOfDisks == 0) {
			return;
		}
		
		solveHanoiTowers(numberOfDisks - 1, source, help, destination);
		
		System.out.println("Move disk " + numberOfDisks + " from " + source + " to " + destination);
		
		solveHanoiTowers(numberOfDisks - 1, help, destination, source);
	}
}