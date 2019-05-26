package unit_13;

import java.io.File;

public class NumberOfFilesInFolder {

	public static void main(String[] args) {
		File file = new File(".");
		
		int numberOfFiles = countFiles(file);
		
		System.out.println("This directory has " + numberOfFiles + " files");
	}

	private static int countFiles(File file) {
		if(file.isFile()) {
			return 1;	
		}
		
		int sum = 0;
		File[] subFiles = file.listFiles();
		for (File subFile : subFiles) {
			sum += countFiles(subFile);
		}
		
		return sum;
	}
}