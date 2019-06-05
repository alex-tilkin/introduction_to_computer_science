package unit_13;

public class SubSetFinder {
	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5};
		
		boolean result = findSubSet(array, array.length, 0);
		
		System.out.println(result);
	}

	private static boolean findSubSet(int[] array, int length, int value) {
		if(value == 0) {
			return true;
		}
		
		if(length == 0 && value != 0) {
			return false;
		}
		
		return findSubSet(array, length - 1, value) || findSubSet(array, length - 1, value - array[length - 1]);
	}
}