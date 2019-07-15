package year_2019.semester_b.period_b.exam.question_1;

import java.io.IOException;
import java.io.PrintWriter;

public class Dog {
	public enum DogType {
		Boxer, Milinoar, Poodale, Chowchow
	};

	private final String DOG_NO_NAME = "Sal_D";
	public static final int MAX_EXERCISE = 5;
	private String name;
	private ExercisesGrade grades;
	private int pastWin;
	private int pastLost;
	private DogType type;
	private int id;
	
	public String getName() {
		return name;
	}
	
	public void save(PrintWriter writer) throws IOException {
		writer.println(name);
		writer.println(pastWin);
		writer.println(pastLost);
		writer.println(type.name());
		writer.println(id);
		writer.println(grades.getGradeOne());
		writer.println(grades.getGradeTwo());
	}
}