package unit_7;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4, 10, 40 };
		int x = 10;
		int lowBoundry = 0;
		int highBoundry = array.length - 1;
		
		int result = recursiveBinarySearch(array, x, lowBoundry, highBoundry);
		
		if (result == -1){
			System.out.println("Element not present");	
		}
		else{
			System.out.println("Element found at " + "index " + result);	
		}
	}
	
	static int recursiveBinarySearch(int array[], int value, int lowBoundry, int highBoundry) {

		int middle = lowBoundry + (highBoundry - lowBoundry) / 2;
		
		if(array[middle] == value) {
			return middle;
		}
		
		if(array[middle] < value) {
			return recursiveBinarySearch(array, value, middle + 1, highBoundry);
		}
		
		return recursiveBinarySearch(array, value, lowBoundry, middle - 1);
	}
}