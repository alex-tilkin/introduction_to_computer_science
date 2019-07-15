package year_2019.semester_b.period_b.solution.question_1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Dog {
	public enum DogType {
		Boxer, Milinoar, Poodale, Chowchow
	};
	public static final int MAX_EXERCISE=5;
	private final String DOG_NO_NAME="Sal_D";
	private static final int DOG_HAS_NO_GRADES = -1;
	private static int idGen = 0;
	private String name;
	private int pastWin;
	private int pastLost;
	private DogType type;
	private int id;
	private ExercisesGrade grades;

	public Dog(String name, int pastWin, int pastLost, DogType type) {
		if(!checkName(name)) {
			name=DOG_NO_NAME;
		}
		this.name = name;
		this.pastWin = pastWin;
		this.pastLost = pastLost;
		this.type = type;
		this.id = idGen++;
	}
	public Dog(String name, int pastWin, int pastLost, DogType type, int gradeOne, int gradeTwo) {
		this(name,pastWin,pastLost,type);
		grades=new ExercisesGrade(gradeOne, gradeTwo);
		
	}
	public Dog(Scanner scan) {
		name = scan.next();
		pastWin = scan.nextInt();
		pastLost = scan.nextInt();
		type = DogType.valueOf(scan.next());
		id=scan.nextInt();
		grades=new ExercisesGrade(scan);
	}

		
	
	public static int getMaxExercise() {
		return MAX_EXERCISE;
	}
	public int getId() {
		return id;
	}
	

	public String toString() {
		String back="name=" + name + ", id=" + id+ ", pastWin=" + pastWin + ", pastLost=" + pastLost + ", type=" + type ;
		if(grades!=null) {
			back=back+", grades: " + grades;
		}
		return back; 
	}
	public double getOddesToWin() {
		double sum = pastLost + pastWin;
		return pastWin / sum;
	}

	public String getName() {

		return name;
	}
	private boolean checkName(String name) {
		int underLine=StringCheck.findChar(name,'_');
		if(underLine==StringCheck.CHAR_NOT_FOUND) {
			return false;
		}
		String dogName=name.substring(underLine+1);
		String famName=name.substring(0,underLine);
		if(!StringCheck.isStartWithCapital(dogName)||(!StringCheck.isStartWithCapital(famName))) {
			return false;
		}
		if(!StringCheck.onlyLetters(dogName)||(!StringCheck.onlyLetters(famName))) {
			return false;
		}
		return true;
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
	public int getTotalGrades() {
		if(grades==null) {
			return DOG_HAS_NO_GRADES;
		}
		return grades.getTotal();
	}
	public static void main(String[] args) throws IOException {
		Dog d = new Dog("d", 4, 6, DogType.Milinoar,100,100);
		Dog d2 = new Dog("Jon_Snow", 2, 6, DogType.Milinoar,90,98);
		System.out.println(d.getOddesToWin());
		System.out.println(d2);
		System.out.println(d);
		System.out.println(d);
		PrintWriter writer = new PrintWriter("dog1");
		d.save(writer);
		writer.close();
//		File f = new File("dog1");
//		Scanner s = new Scanner(f);
//		Dog d2 = new Dog(s);
//		System.out.println(d2);
//		Dog d1 = new Dog("d11", 14, 6, dogType.Milinoar);
//		System.out.println(d1);
	}
	

}
