package year_2019.semester_b.period_b.exam.question_1;

public class DogContest {
	private Dog[] dogs;
	public final static int MAX_NUMBER_OF_DOGS = 5;
	private int numberOfDogs;

	
	public Dog getWinner() {		
		return null;
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer("The dog contest has the folowing dogs : ");
		for (int i = 0; i < numberOfDogs; i++) {
			str.append("\n");
			str.append(dogs[i].toString());
		}
		str.append("\nThe wining dog is ");
		str.append(getWinner().getName());
		return str.toString();
	}
}