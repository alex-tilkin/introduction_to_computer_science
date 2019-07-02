package unit_12_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingSequenceOfNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/unit_12/storage/numbers.txt");
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			int number = scanner.nextInt();
			System.out.println(number);
		}
		
		scanner.close();
	}
}