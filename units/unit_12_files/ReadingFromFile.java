package unit_12_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("src/unit_12/storage/write_to_file_example.txt");
		Scanner scanner = new Scanner(file);
		
		String string = scanner.nextLine();
		System.out.println(string);
		for (int index = 0; index < 3; index++) {
			int number = scanner.nextInt();
			System.out.println(number);
		}
		
		scanner.close();
	}
}