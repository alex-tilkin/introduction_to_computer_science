package unit_13_recursions;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 5, 123, 743, 8324};

		int index = recursiveBinarySearch(array, 0, array.length - 1, 123);
		
		System.out.println(index);
	}

	private static int recursiveBinarySearch(int[] array, int lowBound, int highBound, int value) {
		if(lowBound > highBound) {
			return -1;
		}
		
		int middle = (highBound + lowBound) / 2;
		if(value == array[middle]) {
			return middle;
		}
		
		if(value < array[middle]){
			return recursiveBinarySearch(array, lowBound, middle - 1, value);
		}else {
			return recursiveBinarySearch(array, middle + 1, highBound, value);
		}
	}
}