package unit_07_sort_and_search;

class SelectionSort {

	public static void main(String args[]) {
		int array[] = {64, 25, 12, 22, 11};
		
		System.out.println("Before Selection Sort:");
		printArray(array);
		sort(array);
		System.out.println("After Selection Sort:");
		printArray(array);
	}

	private static void sort(int array[]) {
		int length = array.length;

		for (int index = 0; index < length - 1; index++) {
			int minimumIndex = findMinimum(array, length, index);
			swap(array, index, minimumIndex);
		}
	}

	private static int findMinimum(int[] array, int length, int index) {
		int minimumIndex = index;
		for (int indexB = index + 1; indexB < length; indexB++){
			if (array[indexB] < array[minimumIndex]) {
				minimumIndex = indexB;
			}
		}
		
		return minimumIndex;
	}

	private static void swap(int[] array, int index, int minimumIndex) {
		int temp = array[minimumIndex];
		array[minimumIndex] = array[index];
		array[index] = temp;
	}

	public static void printArray(int arr[]) {		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index]+" "); 
		}
		
		System.out.println("\n");
	}
}