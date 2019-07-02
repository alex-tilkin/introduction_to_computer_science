package unit_12_files;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class WrittingToFile {

	public static void main(String[] args) throws IOException {
		File file = new File("src/unit_12/storage/write_to_file_example.txt");
		PrintWriter printWritter = new PrintWriter(file);
		
		printWritter.print("hi, this is how we create a text file and writting a sequence of numbers\n");
		for (int index = 0; index < 3; index++) {
			printWritter.print(index + " ");
		}
		
		printWritter.close();
	}
}