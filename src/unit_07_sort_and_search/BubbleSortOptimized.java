package unit_07_sort_and_search;

class BubbleSortOptimized{
	public static void main(String args[]){
		int array[] = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println("Before sorting:");
		Print(array);
		Sort(array);
		System.out.println("After sorting:");
		Print(array);
	}

	public static void Sort(int array[]){
		int length = array.length;
		boolean isSwapped = true;
		
		for (int index = 0; index < length - 1 && isSwapped; index++){
			isSwapped = false;
			for (int indexB = 0; indexB < length - index - 1; indexB++){
				if (array[indexB] > array[indexB + 1]){
					swap(array, indexB, indexB + 1); 
					isSwapped = true;
				}
			}
		}
	}

	private static void swap(int[] array, int indexA, int indexB) {
		int temp = array[indexA];
		
		array[indexA] = array[indexB]; 
		array[indexB] = temp;
	}

	public static void Print(int array[]){ 
		for (int index = 0; index < array.length; index++){
			System.out.print(array[index] + " "); 
		}

		System.out.println("\n"); 
	}
}