package unit_7;

class BubbleSortDescending{
	public static void main(String args[]){
		BubbleSort ob = new BubbleSort();
		int array[] = {64, 34, 25, 12, 22, 11, 90};
		
		System.out.println("Before sorting:");
		Print(array);
		Sort(array);
		System.out.println("After sorting:");
		Print(array);
	}

	public static void Sort(int array[]){
		int n = array.length;
		
		for (int index = 0; index < n - 1; index++){
			for (int indexB = 0; indexB < n - index - 1; indexB++){
				if (array[indexB] < array[indexB + 1]){
					Swap(array, indexB); 
				}
			}
		}
	}

	private static void Swap(int[] array, int index) {
		int temp = array[index];
		
		array[index] = array[index + 1]; 
		array[index + 1] = temp;
	}

	public static void Print(int array[]){ 
		for (int index = 0; index < array.length; index++){
			System.out.print(array[index] + " "); 
		}

		System.out.println("\n"); 
	}
}