package year_2020.semester_b.period_a.exam.question_1;

public class Surfer {
	
	private String name;
	private String country;
	private int worldRank;
	private SurfBoard[] surfBoards;
	private int numberOfBoards;
	private final int MAX_NUMBER_OF_SURBOARDS = 20;
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("Name: " + name + "(" + country + "), ");
		sb.append("World Rank: " + worldRank + ", ");
		sb.append("Surboards:\n");
		for (int index = 0; index < numberOfBoards; index++) {
			sb.append("\t" + surfBoards[index].toString() + "\n");
		}
		
		return sb.toString();
	}

	public boolean hasSurfBoardType(SurfBoard.BoardType boardType) {
		for (int index = 0; index < numberOfBoards; index++) {
			if(surfBoards[index].getBoardType() == boardType) {
				return true;
			}
		}
		return false;
	}

	public SurfBoard findSurfBoardById(int serialNumber) {
		for (int index = 0; index < numberOfBoards; index++) {
			if(surfBoards[index].getSerialNumber() == serialNumber) {
				return surfBoards[index];
			}
		}
				
		return null;
	}
}
