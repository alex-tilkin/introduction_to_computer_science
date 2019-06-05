package unit_07_sort_and_search;

public class ArraysMerge {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 4, 5, 9, 43, 56, 63, 85, 99, 100};
		int[] arrayB = {-7, -1, 23, 63, 76, 83, 127, 432};
		
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
		int[] mergedArray = new int[arrayA.length + arrayB.length];
		int indexA = 0;
		int indexB = 0;

		while (indexA < arrayA.length && indexB < arrayB.length) {
			if (arrayA[indexA] <= arrayB[indexB]) {
				mergedArray[indexA + indexB] = arrayA[indexA++];
			} else {
				mergedArray[indexA + indexB] = arrayB[indexB++];
			}
		}
		
		while (indexA < arrayA.length) {
			mergedArray[indexA + indexB] = arrayA[indexA++];
		}

		while (indexB < arrayB.length) {
			mergedArray[indexA + indexB] = arrayB[indexB++];
		}
		
		return mergedArray;
	}
}