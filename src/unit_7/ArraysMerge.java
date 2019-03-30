package unit_7;

public class ArraysMerge {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 4, 5, 9, 43, 56, 63, 85, 99, 100};
		int[] arrayB = {-1, -7, 23, 63, 76, 83, 127, 432};
		
		int[] mergedArray = mergeArrays(arrayA, arrayB);
		
		printArray(mergedArray);
	}

	private static void printArray(int[] mergedArray) {
		for(int index = 0; index < mergedArray.length; index++) {
			System.out.printf("%d%s", mergedArray[index], index < mergedArray.length - 1 ? ", " : "");
		}
		
		System.out.println();
	}

	public static int[] mergeArrays(int arrayA[], int arrayB[]) {
		int[] res = new int[arrayA.length + arrayB.length];
		int indexA = 0;
		int indexB = 0;

		while (indexA < arrayA.length && indexB < arrayB.length) {
			if (arrayA[indexA] <= arrayB[indexB]) {
				res[indexA + indexB] = arrayA[indexA++];
			} else {
				res[indexA + indexB] = arrayB[indexB++];
			}
		}
		
		while (indexA < arrayA.length) {
			res[indexA + indexB] = arrayA[indexA++];
		}

		while (indexB < arrayB.length) {
			res[indexA + indexB] = arrayB[indexB++];
		}
		
		return res;
	}
}