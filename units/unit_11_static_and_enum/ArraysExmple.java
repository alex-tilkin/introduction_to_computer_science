package unit_11_static_and_enum;

import java.util.Arrays;

public class ArraysExmple {

	public static void main(String[] args) {
		int[] array = new int[] {5, 3, 2, 8};
		
		int[] newArray = Arrays.copyOf(array, 10);
		
		System.out.println("The original array " + Arrays.toString(array));
		System.out.println("The original array " + Arrays.toString(newArray));
		System.out.println(Arrays.equals(array, newArray));
		
		int[] newArrayB = Arrays.copyOf(array, array.length);
		System.out.println("The original array " + Arrays.toString(array));
		System.out.println("The original array " + Arrays.toString(newArrayB));
		System.out.println(Arrays.equals(array, newArrayB));
	}
}