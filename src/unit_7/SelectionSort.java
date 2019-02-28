package unit_7;

class SelectionSort {

	public static void main(String args[]) {
		int array[] = {64, 25, 12, 22, 11};
		System.out.println("Before Selection Sort:");
		PrintArray(array);
		Sort(array);
		System.out.println("After Selection Sort:");
		PrintArray(array);
	}

	public static void Sort(int array[]) {
		int length = array.length;

		for (int index = 0; index < length - 1; index++) {
			int min_idx = index;
			for (int indexB = index + 1; indexB < length; indexB++){
				if (array[indexB] < array[min_idx]) {
					min_idx = indexB;
				}
			}

			int temp = array[min_idx];
			array[min_idx] = array[index];
			array[index] = temp;
		}
	}

	public static void PrintArray(int arr[]) {		
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index]+" "); 
		}
		
		System.out.println("\n");
	}
}