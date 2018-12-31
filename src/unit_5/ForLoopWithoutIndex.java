package unit_5;

import java.util.Iterator;

public class ForLoopWithoutIndex {

	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		
		for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + "\t");
		}
		
		System.out.println();
		
		for (int element : array) {
			System.out.print(element + "\t");
		}
	}
}