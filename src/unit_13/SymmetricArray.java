package unit_13;

public class SymmetricArray {

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 3, 2, 1};

		boolean result = isSymmetric(array, 0, array.length - 1);
		
		System.out.println(result);
	}

	private static boolean isSymmetric(int[] array, int leftPivot, int rightPivot) {
		if(leftPivot >= rightPivot) {
			return true;
		}
		
		return array[leftPivot] == array[rightPivot] ? isSymmetric(array, leftPivot + 1, rightPivot -1) : false;
	}
}