package unit_05_arrays_and_matrices;

import java.util.Random;

public class IncreaseArrayValues {

	public static void main(String[] args) {
		int[] array = new int[4];
		
		Random random = new Random();
		for (int index = 0; index < array.length; index++) {
			array[index] = random.nextInt((10 - 1) - 1) + 1;
		}
		
		System.out.println("Before increase:");
		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
		
		for (int index = 0; index < array.length; index++) {
			array[index]++;
		}
		
		System.out.println("After increase:");
		for (int index = 0; index < array.length; index++) {
			System.out.println(array[index]);
		}
	}
}