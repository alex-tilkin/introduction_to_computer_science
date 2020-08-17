package year_2020.semester_b.period_a.solution.question_1;

public class WSL {
	private Surfer[] surfers;
	private String locationOfLastSurfingCompetition;
	private final int MAX_NUMBER_OF_SURFERS = 50;
	private int currentNumberOfSurfers;
	
	public WSL(String locationOfLastSurfingCompetition) {
		setLocationOfLastSurfingCompetition(locationOfLastSurfingCompetition);
		surfers = new Surfer[MAX_NUMBER_OF_SURFERS];
	}
	
	public String getLocationOfLastSurfingCompetition() {
		return locationOfLastSurfingCompetition;
	}
	
	public void setLocationOfLastSurfingCompetition(String locationOfLastSurfingCompetition) {
		this.locationOfLastSurfingCompetition = locationOfLastSurfingCompetition;
	}
	
	public boolean addSurfer(Surfer surfer) {
		if(currentNumberOfSurfers == MAX_NUMBER_OF_SURFERS) {
			return false;
		}
		
		surfers[currentNumberOfSurfers++] = surfer;
		return true;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Last location was " + locationOfLastSurfingCompetition);
		sb.append(", and the surfurs were:\n");
		for (int i=0 ; i < currentNumberOfSurfers ; i++)
			sb.append(surfers[i].toString());
		return sb.toString();
	}


	public Surfer findSurferWithLongestSurfBoard() {
		if(currentNumberOfSurfers == 0) {			
			return null;
		}
		
		int selectedIndex = 0;
		for (int index = 1; index < currentNumberOfSurfers; index++) {
			if(surfers[index].getLongestSurfboard().getLength() > surfers[selectedIndex].getLongestSurfboard().getLength()) {
				selectedIndex = index;
			}
		}
		
		return surfers[selectedIndex];
	}
	
	public int getNumberOfSurfersHavingBoardType(SurfBoard.BoardType boardType) {
		int counter = 0;
		
		for (int index = 0; index < currentNumberOfSurfers; index++) {
			if(surfers[index].hasSurfBoardType(boardType)) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public SurfBoard.BoardType findTheMostUsedBoardType(){
		SurfBoard.BoardType[] boardTypes = SurfBoard.BoardType.values();
		int selectedNumberOfSurfers = getNumberOfSurfersHavingBoardType(boardTypes[0]);
		SurfBoard.BoardType selectedBoardType = boardTypes[0];
		
		for (int index = 1; index < boardTypes.length; index++) {
			int numberOfSurfers = getNumberOfSurfersHavingBoardType(boardTypes[index]);
			if(numberOfSurfers > selectedNumberOfSurfers) {
				selectedBoardType = boardTypes[index];
				selectedNumberOfSurfers = numberOfSurfers;
			}
		}
		
		return selectedBoardType;
	}
	
	public Surfer findSurferByBoardSerialNumber(int serialNumber) {
		if(currentNumberOfSurfers == 0) {
			return null;
		}
		
		for (int index = 0; index < currentNumberOfSurfers; index++) {
			if(surfers[index].findSurfBoardById(serialNumber) != null) {
				return surfers[index];
			}
		}
				
		return null;
	}
}
