package unit_03_04_loops;

public class ContinueExample {
	public static void main(String[] args) {
		final int SIZE = 10;
		
		for (int index = 0; index < SIZE; index++) {
			if(index % 2 == 0){
				continue;
			}
			
			System.out.print(index + " ");
		}
		System.out.println();
	}
}
