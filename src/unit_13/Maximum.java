package unit_13;

public class Maximum {

	public static void main(String[] args) {
		int[] array = new int[] {4, 7, 2, 8, 4, 7};
		
		int result = findMaximum(array, array.length);

		System.out.println(result);
	}

	private static int findMaximum(int[] array, int length) {
		if(length == 0) {
			return array[0];
		}
		
		int newLength = length - 1;
		
		int localMaximum = findMaximum(array, newLength);
		
		return localMaximum > array[newLength] ? localMaximum : array[newLength];
	}
}