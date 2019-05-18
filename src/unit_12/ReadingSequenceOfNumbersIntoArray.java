package unit_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingSequenceOfNumbersIntoArray {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/unit_12/storage/numbers_with_size.txt");
		Scanner scanner = new Scanner(file);
		
		int numberOfElements = scanner.nextInt();
		int[] array = new int[numberOfElements];
		for (int index = 0; index < numberOfElements; index++) {
			int number = scanner.nextInt();
			array[index] = number;
		}
		
		scanner.close();
		
		System.out.println(Arrays.toString(array));
	}
}