package unit_05_arrays_and_matrices;

import java.util.Random;

public class FindngMaxValue {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		Random random = new Random();
		for (int index = 0; index < array.length; index++) {
			array[index] = random.nextInt((100 - 1) - 1) + 1;
		}
		
		int max = -1;
		int selectedIndex = -1;
		for (int index = 0; index < array.length; index++) {
			if(array[index] > max){
				max = array[index];
				selectedIndex = index;
			}
		}
		
		if(selectedIndex >= 0){
			System.out.printf("The maximum is %d in index %d", max, selectedIndex);
		}
		else{
			System.out.println("No maximum, probalby the array is empty");
		}
	}
}