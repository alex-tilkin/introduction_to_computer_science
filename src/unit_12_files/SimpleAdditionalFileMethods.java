package unit_12_files;

import java.io.File;
import java.io.IOException;

public class SimpleAdditionalFileMethods {

	public static void main(String[] args) throws IOException {
		File[] files = new File[3];
		
		files[0] = new File("src/unit_12/storage/simple_file.txt");
		files[1] = new File("src/unit_12/storage/");
		files[2] = new File("src/unit_12/storage/additional_file.txt");
		
		File[] all = files[1].listFiles();
		for (File file : all) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println();
		files[2].createNewFile();
		all = files[1].listFiles();
		for (File file : all) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println();
		
		files[2].delete();
		all = files[1].listFiles();
		for (File file : all) {
			System.out.println(file.getAbsolutePath());
		}
	}
}