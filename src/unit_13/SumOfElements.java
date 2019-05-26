package unit_13;

import java.util.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4};
		
		int result = sumOfElements(array, array.length);
		
		System.out.println(result);
	}

	private static int sumOfElements(int[] array) {
		if(array.length == 0) {
			return 0;
		}
		
		int newSize = array.length - 1;
		int[] newArray = Arrays.copyOf(array, newSize);
		
		return sumOfElements(newArray) + array[newSize];
	}
	
	private static int sumOfElements(int[] array, int length) {
		if(array.length == 0) {
			return 0;
		}
		
		int newLength = array.length - 1;
		
		return sumOfElements(array, newLength) + array[newLength];
	}
}