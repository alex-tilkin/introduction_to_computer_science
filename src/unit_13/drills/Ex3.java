package unit_13.drills;


public class Ex3 {

	public static void main(String[] args) {
		int count = counter(new int[]{1, 2, 3, 3, 4}, 5, 3);
		
		System.out.println(count);
	}

	public static final int counter(final int[] vector, final int size, final int number){
		if(size == 0){
			return 0;
		}
		
		return counter(vector, size - 1, number) + (vector[size - 1] == number ? 1 : 0);
	}
}
