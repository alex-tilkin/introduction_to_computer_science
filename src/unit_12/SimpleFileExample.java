package unit_12;

import java.io.File;

public class SimpleFileExample {

	public static void main(String[] args) {
		File file = new File("src/unit_12/storage/simple_file.txt");
		
		System.out.println("the name of the file is " + file.getName());
		System.out.println("Is the file exists? " + file.exists());
		System.out.println("Is this is a file? " + file.isFile());
		System.out.println("Is this is a directory? " + file.isDirectory());
		System.out.println("Can I read from theis file? " + file.canRead());
		System.out.println("Can I write to this file? " + file.canWrite());
		System.out.println("Can I execute this file? " + file.canExecute());
		System.out.println("The path is " + file.getPath());
		System.out.println("The absolute path is " + file.getAbsolutePath());
		System.out.println("the parent of the file is " + file.getParent());
		System.out.println("the length of the content of the file is " + file.length());
	}
}