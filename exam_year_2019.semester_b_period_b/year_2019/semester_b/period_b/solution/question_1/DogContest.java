package year_2019.semester_b.period_b.solution.question_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import year_2019.semester_b.period_b.solution.question_1.Dog.DogType;

public class DogContest {
	private Dog[] dogs;
	public final static int MAX_NUMBER_OF_DOGS = 5;
	private int numberOfDogs;

	public DogContest() {
		numberOfDogs = 0;
		dogs = new Dog[MAX_NUMBER_OF_DOGS];
	}

	public DogContest(String fileName) throws FileNotFoundException {
		this();
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		numberOfDogs = scan.nextInt();
		for (int i = 0; i < numberOfDogs; i++) {
			dogs[i] = new Dog(scan);
		}
	}

	private void save(String fileName) throws IOException {
		File file = new File(fileName);
		PrintWriter writer = new PrintWriter(file);
		writer.println(numberOfDogs);
		for (int i = 0; i < numberOfDogs; i++) {
			dogs[i].save(writer);
		}
		writer.close();
	}

	public boolean addDog(Dog dog) {
		if (numberOfDogs >= dogs.length) {
			return false;
		}
		dogs[numberOfDogs++] = dog;
		return true;
	}

	public Dog getFavoriteDogToWin() {
		int bestIndex = 0;
		for (int i = 1; i < numberOfDogs; i++) {
			if (dogs[i].getOddesToWin() > dogs[bestIndex].getOddesToWin()) {
				bestIndex = i;
			}
		}
		return dogs[bestIndex];
	}

	public Dog getWinner() {
		int bestIndex = 0;
		for (int i = 1; i < numberOfDogs; i++) {
			if (dogs[i].getTotalGrades() > dogs[bestIndex].getTotalGrades()) {
				bestIndex = i;
			}
		}
		return dogs[bestIndex];
	}

	public String toString() {
		StringBuffer str = new StringBuffer("The dog contest has the following dogs : ");
		for (int i = 0; i < numberOfDogs; i++) {
			str.append("\n");
			str.append(dogs[i].toString());
		}
		str.append("\nThe wining dog is ");
		str.append(getWinner().getName());
		return str.toString();
	}

	public static void main(String[] args) throws IOException {
		// DogContest tournament=new DogContest("dogTur.txt");
		
		DogContest tournament = new DogContest();
		Dog d3=new Dog("Girl_HasNoName",6,2,DogType.Boxer,28,90);
		Dog d4=new Dog("Dany_QueenOf",2,6,DogType.Boxer,42,42);
		
		Dog d = new Dog("d",6,0,DogType.Milinoar,100,100);
		tournament.addDog(d);
		tournament.addDog(d3);
		tournament.addDog(d4);

		Dog d1 = new Dog("Jhon_Snow", 5, 6, DogType.Chowchow, 2, 5);

		tournament.addDog(d1);
		tournament.save("dogTur.txt");
		//System.out.println(tournament);
		DogContest t1=new DogContest("dogTur.txt");
		System.out.println(t1);
	}

}
