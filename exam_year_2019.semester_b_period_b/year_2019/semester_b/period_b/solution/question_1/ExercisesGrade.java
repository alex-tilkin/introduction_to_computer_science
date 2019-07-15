package year_2019.semester_b.period_b.solution.question_1;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExercisesGrade {

	private int gradeOne;
	private int gradeTwo;
	
	
	public ExercisesGrade(int gradeOne, int gradeTwo) {
		this.gradeOne = gradeOne;
		this.gradeTwo = gradeTwo;
	}
	public  ExercisesGrade(Scanner scan) {
		gradeOne=scan.nextInt();
		gradeTwo=scan.nextInt();	
	}
	private void save(PrintWriter writer) throws IOException {
		writer.println(gradeOne);
		writer.println(gradeTwo);
	}
	
	public String toString() {
		return "gradeOne=" + gradeOne + ", gradeTwo=" + gradeTwo ;
	}
	
	public int getGradeOne() {
		return gradeOne;
	}
	public int getGradeTwo() {
		return gradeTwo;
	}
	public static void main(String[] args) throws IOException {
		
		ExercisesGrade ex =new ExercisesGrade(100,98);
		System.out.println(ex);
	}
	public int getTotal() {
		// TODO Auto-generated method stub
		return gradeOne+gradeTwo;
	}
}
