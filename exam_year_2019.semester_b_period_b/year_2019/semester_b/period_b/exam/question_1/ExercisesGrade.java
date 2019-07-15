package year_2019.semester_b.period_b.exam.question_1;

public class ExercisesGrade {
	private int gradeOne;
	private int gradeTwo;

	public ExercisesGrade(int gradeOne, int gradeTwo) {
		this.gradeOne = gradeOne;
		this.gradeTwo = gradeTwo;
	}

	public String toString() {
		return "gradeOne=" + gradeOne + ", gradeTwo=" + gradeTwo;
	}

	public int getGradeOne() {
		return gradeOne;
	}

	public int getGradeTwo() {
		return gradeTwo;
	}
}