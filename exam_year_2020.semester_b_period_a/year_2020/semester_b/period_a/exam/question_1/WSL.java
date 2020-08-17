package year_2020.semester_b.period_a.exam.question_1;

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
}
