package unit_07_sort_and_search;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		int array[] = { 2, 3, 4, 10, 40, 50, 53, 100, 254, 309, 1000, 1439, 2043, 3000 };
		int x = 1439;
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
		if(lowBoundry > highBoundry) {
			return -1;
		}
		
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