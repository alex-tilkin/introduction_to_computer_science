package unit_03_04_loops;

public class BreakExample {
	public static void main(String[] args) {
		final int SIZE = 10;
		
		for (int index = 0; index < SIZE; index++) {
			if(index % 2 == 0){
				continue;
			}
			else if (index / 5 == 1){
				break;
			}
			
			System.out.print(index + " ");
		}
		System.out.println();
	}
}
