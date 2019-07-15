package year_2019.semester_b.period_a.solution.question_1;

import java.io.FileNotFoundException;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		DraftContest draftContest = new DraftContest();

		draftContest.load("src/question_1/players.txt");
	}

}
